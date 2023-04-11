package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeOptions options = new ChromeOptions();
options.addArguments("--remote-allow-origins=*");
ChromeDriver driver = new ChromeDriver(options);
driver.manage().window().maximize();
driver.get("https://www.leafground.com/alert.xhtml");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
Alert alert = driver.switchTo().alert();
String text = alert.getText();
System.out.println(text);
alert.accept();
String text2 = driver.findElement(By.xpath("//span[@id='simple_result']")).getText();
System.out.println(text2);
driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
Alert alert2 = driver.switchTo().alert();
String text3 = alert2.getText();
System.out.println(text3);
alert2.accept();
String text4 = driver.findElement(By.xpath("//span[@id='result']")).getText();
System.out.println(text4);
driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
driver.findElement(By.xpath("(//span[text()='Show'])[4]")).click();
driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();
driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
Alert alert3 = driver.switchTo().alert();
alert3.sendKeys("Hari");
alert.accept();
String text6 = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
System.out.println(text6);
driver.findElement(By.xpath("//span[text()='Delete']")).click();
driver.findElement(By.xpath("//span[text()='Yes']")).click();
driver.findElement(By.xpath("(//span[text()='Show'])[6]")).click();
driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[3]")).click();




	}

}
