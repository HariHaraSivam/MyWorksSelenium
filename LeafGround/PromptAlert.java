package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PromptAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeOptions options = new ChromeOptions();
options.addArguments("--remote-allow-origins=*");
ChromeDriver driver = new ChromeDriver(options);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://leafground.com/alert.xhtml");
driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
Alert alert = driver.switchTo().alert();
String text = alert.getText();
System.out.println(text);
alert.sendKeys("Hari");
alert.accept();
String text2 = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
System.out.println(text2);

	}

}
