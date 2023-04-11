package marathon3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Chrome extends ProjectSpecificMethod {
	@BeforeTest
	public void setup() {
		excelfile = "Chrome";
	}
@Test(dataProvider = "datas")
	public void usingChrome(String question, String detail) {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Content");
		driver.findElement(By.xpath("//mark[text()='Content']")).click();
		WebElement chatter = driver.findElement(By.xpath("//span[text()='Chatter']"));
		driver.executeScript("arguments[0].click();",chatter);
		String currentUrl = driver.getCurrentUrl();
		if(currentUrl.contains("chatter")) {
			System.out.println("url is correct");
		}
		driver.findElement(By.xpath("//span[text()='Question']")).click();
		driver.findElement(By.xpath("//textarea[@class='cuf-questionTitleField textarea']")).sendKeys(question);
		driver.findElement(By.xpath("//div[@class='ql-editor ql-blank slds-rich-text-area__content slds-text-color_weak slds-grow']")).sendKeys(detail);
		driver.findElement(By.xpath("//button[text()='Ask']")).click();
		String text = driver.findElement(By.xpath("(//span[@class='uiOutputText'])[3]")).getText();
		System.out.println(text);
		
		
	}

}
