package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.redbus.in/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Chennai");
driver.findElement(By.xpath("(//li[@class='sub-city'])[1]")).click();
driver.findElement(By.id("dest")).sendKeys("Bangalore");
driver.findElement(By.xpath("//li[contains(text(),'Madiwala')]")).click();
driver.findElement(By.xpath("//td[text()='10']")).click();
driver.findElement(By.id("search_btn")).click();
String text = driver.findElement(By.xpath("//span[contains(text(),'103')]/parent::span")).getText();
System.out.println(text);
driver.findElement(By.xpath("//label[text()='SLEEPER']")).click();
String text2 = driver.findElement(By.xpath("(//span[text()='80'])/parent::span")).getText();
System.out.println(text2);
String title = driver.getTitle();
System.out.println(title);
//input[@id='dest']
	}

}
