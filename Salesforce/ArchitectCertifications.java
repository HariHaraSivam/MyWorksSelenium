package Marathon2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

public class ArchitectCertifications {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Leaf@123");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowList = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windowList.get(1));
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		//Alert alert = driver.switchTo().alert();
		//alert.accept();
		Shadow dom =new Shadow(driver);
		dom.findElementByXPath("//span[text()='Learning']").click();
		WebElement learning = dom.findElementByXPath("//span[text()='Learning on Trailhead']");
		Actions builder = new Actions(driver);
		builder.moveToElement(learning).perform();
		dom.findElementByXPath("//a[text()='Salesforce Certification']").click();
		driver.findElement(By.xpath("(//div[@class='roleMenu-item_text'])[2]")).click();
		String summary = driver.findElement(By.xpath("(//h1[text()='Salesforce Architect'])/following-sibling::div[1]")).getText();
		System.out.println(summary);
		WebElement scroll = driver.findElement(By.xpath("//h1[text()='What is an Architect?']"));
		builder.scrollToElement(scroll).perform();
		List<WebElement> certificates = driver.findElements(By.xpath("(//div[@class='credentials-card_title'])/a"));
		System.out.println(certificates.size());
		for (int i = 0; i < certificates.size(); i++) {
			System.out.println(certificates.get(i).getText());
		}
		Thread.sleep(3000);
		WebElement click = driver.findElement(By.xpath("//a[text()='Application Architect']"));
		driver.executeScript("arguments[0].click();", click);
		List<WebElement> certificates2 = driver.findElements(By.xpath("(//div[@class='credentials-card_title'])/a"));
		System.out.println(certificates2.size());
		for (int i = 0; i < certificates2.size(); i++) {
			System.out.println(certificates2.get(i).getText());
			
		}
	}

}
