package marathon3;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethod {
	RemoteWebDriver driver;
	public String excelfile;
	@Parameters({"browser", "url", "username", "password"})
	@BeforeMethod
public void preCondition(String browser, String url, String uname, String pwd) {
		switch (browser) {
		case "Chrome":
		{
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			options.addArguments("--disable-notifications");
			driver = new ChromeDriver(options);			
			break;
		}
		case "Edge":
		{
			driver = new EdgeDriver();
			break;
		}
		}
	driver.manage().window().maximize();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys(uname);
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
	driver.findElement(By.xpath("//input[@id='Login']")).click();
	driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	driver.findElement(By.xpath("//button[text()='View All']")).click();
}
	@AfterMethod
public void postCondition() {
	driver.close();
}
	@DataProvider(name= "datas")
	public String[][] getData() throws IOException {
		String[][] readData = ReadExcel.dataInput(excelfile);
		return readData;
	}
}
