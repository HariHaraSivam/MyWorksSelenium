package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/login");
driver.manage().window().maximize();
String title = driver.getTitle();
System.out.println(title);
driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("crmsfa");
driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click();
System.out.println(title);
driver.close();

	}

}
