package marathon3;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	


		public static String[][] dataInput(String fileName) throws IOException {
			XSSFWorkbook book = new XSSFWorkbook("./input/" + fileName + ".xlsx");
			XSSFSheet sheet = book.getSheetAt(0);
			int rowCount = sheet.getLastRowNum();
			int colCount = sheet.getRow(1).getLastCellNum();
			String[][] data = new String[rowCount][colCount];

			for (int i = 1; i <= rowCount; i++) {
				for (int j = 0; j < colCount; j++) {
					String allValues = sheet.getRow(i).getCell(j).getStringCellValue();
					System.out.println(allValues);
					data[i - 1][j] = allValues;
					// data[0][0]=companyName,
				}
			}

			book.close();
			return data;

		}

	}


//ExcelDataInput