package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.in/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags");
driver.findElement(By.xpath("//div[@aria-label='bags for boys']")).click();
String result = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
System.out.println(result);
driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
driver.findElement(By.className("a-dropdown-prompt")).click();
driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
String name = driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")).getText();
System.out.println(name);
String price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[4]")).getText();
System.out.println(price);
driver.close();






	}

}
