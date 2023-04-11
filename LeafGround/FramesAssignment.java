package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FramesAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeOptions options = new ChromeOptions();
options.addArguments("--remote-allow-origins=*");
ChromeDriver driver = new ChromeDriver(options);
driver.manage().window().maximize();
driver.get("https://www.leafground.com/frame.xhtml");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.switchTo().frame(0);
driver.findElement(By.xpath("//button[@id='Click']")).click();
String text = driver.findElement(By.xpath("//button[@id='Click']")).getText();
System.out.println(text);
driver.switchTo().defaultContent();
driver.switchTo().parentFrame();
List<WebElement> findElements = driver.findElements(By.tagName("iframe"));
System.out.println(findElements.size());
driver.switchTo().defaultContent();
WebElement findElement = driver.findElement(By.xpath("//iframe[@src='page.xhtml']"));
driver.switchTo().frame(findElement);
driver.switchTo().frame("frame2");
driver.findElement(By.xpath("//button[@id='Click']")).click();
	}

}
