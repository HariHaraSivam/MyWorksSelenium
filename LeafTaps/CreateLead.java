package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SafariDriver driver = new SafariDriver();
driver.manage().window().maximize();
driver.get("http://leaftaps.com/opentaps/control/login");
driver.findElement(By.id("username")).sendKeys("demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.partialLinkText("CRM/SFA")).click();
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari Hara");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sivam");
WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
Select dropdown = new Select(source);
dropdown.selectByVisibleText("Employee");
WebElement marketing = driver.findElement(By.name("marketingCampaignId"));
Select dropdown2 = new Select(marketing);
dropdown2.selectByValue("DEMO_MKTG_CAMP");
WebElement campaign = driver.findElement(By.xpath("//select[contains(@id,'createLeadForm_ownershipEnumId')]"));
Select dropdown3 = new Select(campaign);
dropdown3.selectByIndex(5);
driver.findElement(By.name("submitButton")).click();
String title = driver.getTitle();
System.out.println(title);


		
	}

}
