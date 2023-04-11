package marathon3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Edge extends ProjectSpecificMethod{

	@BeforeTest
	public void setup() {
		excelfile="Safari";
	}
	
@Test(dataProvider = "datas")
	public void usingEdge(String oppname, String amount) {
		// TODO Auto-generated method stub
driver.findElement(By.xpath("//p[text()='Sales']")).click();
//WebElement target = driver.findElement(By.xpath("//span[text()='View All Key Deals']"));
//Actions action = new Actions(driver);
//action.moveToElement(target).perform();
WebElement keyDeals = driver.findElement(By.xpath("//span[text()='View All Key Deals']"));
driver.executeScript("arguments[0].click();",keyDeals);
//driver.findElement(By.xpath("//span[text()='View All Key Deals']")).click();
driver.findElement(By.xpath("//div[text()='New']")).click();
driver.findElement(By.xpath("(//input[@class='slds-input'])[4]")).sendKeys(oppname);
driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[2]")).click();
driver.findElement(By.xpath("//span[text()='New Customer']")).click();
driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[3]")).click();
driver.findElement(By.xpath("//span[text()='Partner Referral']")).click();
driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys(amount);
driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).sendKeys("4/7/2023");
//calender.click();
//calender.sendKeys("4/7/2023");
driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[1]")).click();
driver.findElement(By.xpath("(//span[@class='slds-media__body'])[4]")).click();
driver.findElement(By.xpath("(//input[@class='slds-combobox__input slds-input'])[2]")).click();
//driver.findElement(By.xpath("(//lightning-base-combobox-item[@class='slds-media slds-listbox__option slds-media_center slds-listbox__option_entity'])[1]")).click();
driver.findElement(By.xpath("//span[text()='test']")).click();
driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
String text = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
if (text.contains("created")) {
	System.out.println(text);
}
//span[text()='New Customer']


	}

}
