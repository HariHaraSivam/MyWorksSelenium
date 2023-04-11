package testcase;


import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethod{
@Test(dataProvider = "data1")
	public void creLead(String cname, String fname, String lname, String num) {
	
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(num);
		driver.findElement(By.name("submitButton")).click();
}
@DataProvider(name="data1")
public String[][] getData() {
	String[][] data = new String[2][4];
	//1st set
	data[0][0]= "TestLeaf";
	data[0][1]= "Hari";
	data[0][2]= "R";
	data[0][3]= "99";
	
	//2nd set
	data[1][0]= "Qeagle";
	data[1][1]= "Babu";
	data[1][2]= "M";
	data[1][3]= "98";
	return data;
}
}






