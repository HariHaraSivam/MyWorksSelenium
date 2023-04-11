package Marathon2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.sukgu.Shadow;

public class OrderingMobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeOptions options = new ChromeOptions();
options.addArguments("--remote-allow-origins=*");
ChromeDriver driver = new ChromeDriver(options);
driver.manage().window().maximize();
driver.get("https://dev57553.service-now.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("2oaD6KN$q$vN");
driver.findElement(By.id("sysverb_login")).click();
Shadow dom = new Shadow(driver);
dom.setImplicitWait(20);
dom.findElementByXPath("//div[@id='all']").click();
dom.setImplicitWait(20);
//WebElement filter = dom.findElementByXPath("//input[@id='filter']");
//filter.sendKeys("Service catalog");
//dom.setImplicitWait(20);
dom.findElementByXPath("//span[text()='Service Catalog']").click();
//
WebElement frame = dom.findElementByXPath("//iframe[@id='gsft_main']");
driver.switchTo().frame(frame);
driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();
//driver.switchTo().defaultContent();
driver.findElement(By.xpath("//strong[text()='Apple iPhone 6s']")).click();
//builder.scrollToElement(scroll).perform();
driver.findElement(By.xpath("(//select[@class='form-control cat_item_option '])[2]")).click();
driver.findElement(By.xpath("//option[text()='Gold']")).click();
driver.findElement(By.xpath("(//select[@class='form-control cat_item_option '])[3]")).click();
driver.findElement(By.xpath("//option[contains(text(),'128GB')]")).click();
driver.findElement(By.xpath("//button[@id='oi_order_now_button']")).click();
String reqNo = driver.findElement(By.xpath("(//a[@id='requesturl'])/b")).getText();
System.out.println(reqNo);


	}

}
