package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookMyShow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ChromeDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://in.bookmyshow.com/");
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
   driver.findElement(By.xpath("(//div[@class='sc-eNPDpu fVBwIY'])[4]")).click();
   String url = driver.getCurrentUrl();
   if(url.contains("hyderabad")) {
	   System.out.println("url is correct");
   }
	   else {
		System.out.println("Wrong url");
		
	}
   driver.findElement(By.xpath("//span[@class='sc-fcdeBU cNeUMt']")).click();
   driver.findElement(By.xpath("//input[@class='sc-hCaUpS cLnzvB']")).sendKeys("RRR");
   driver.findElement(By.xpath("(//div[@class='sc-dXfzlN iPwaRU'])[1]")).click();
   driver.findElement(By.xpath("(//span[text()='Book tickets'])[1]")).click();
   String text = driver.findElement(By.xpath("//a[@class='__venue-name'][1]")).getText();
   System.out.println(text);
   driver.findElement(By.xpath("(//div[@class='venue-info-text'])[1]")).click();
   String facility = driver.findElement(By.xpath("((//div[@class='venue-facility-item'])[4])/div[2]")).getText();
   if (facility.contains("Parking")) {
	   System.out.println("parking available");
   }
	   else {
		System.out.println("parking not available");
	}
	  driver.findElement(By.className("cross-container")).click();
	  driver.findElement(By.id("wzrk-cancel")).click();
	  driver.findElement(By.partialLinkText("10:40 AM")).click();
	  driver.findElement(By.id("btnPopupAccept")).click();
	  driver.findElement(By.xpath("//li[text()='1']")).click();
	  driver.findElement(By.id("proceed-Qty")).click();
	  driver.findElement(By.xpath("(//a[contains(text(),'3')])[7]")).click();
	  driver.findElement(By.xpath("(//a[@id='btmcntbook'])[1]")).click();
	  String total = driver.findElement(By.xpath("//span[text()='Rs.283.04']")).getText();
	  System.out.println(total);
   
   
   
   
   
	}

}
