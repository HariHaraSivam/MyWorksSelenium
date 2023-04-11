package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MergeContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--remote-allow-origins=*");
    ChromeDriver driver = new 	ChromeDriver(options);
    driver.manage().window().maximize();
    driver.get("http://leaftaps.com/opentaps/control/login");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.findElement(By.id("username")).sendKeys("demosalesmanager");
    driver.findElement(By.id("password")).sendKeys("crmsfa");
    driver.findElement(By.className("decorativeSubmit")).click();
    driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
    driver.findElement(By.xpath("//a[text()='Contacts']")).click();
    driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
    driver.findElement(By.xpath("(//table[@name='ComboBox_partyIdFrom'])/following-sibling::a")).click();
    Set<String> windowHandles = driver.getWindowHandles();
    List<String> listWindow = new ArrayList<String>(windowHandles);
    driver.switchTo().window(listWindow.get(1));
    driver.findElement(By.xpath("//a[text()='10705']")).click();
    driver.switchTo().window(listWindow.get(0));
    driver.findElement(By.xpath("(//table[@name='ComboBox_partyIdTo'])/following-sibling::a")).click();
    Set<String> windowHandles2 = driver.getWindowHandles();
    List<String> listWindow2 = new ArrayList<String>(windowHandles2);
    driver.switchTo().window(listWindow2.get(1));
    driver.findElement(By.xpath("//a[text()='10710']")).click();
    driver.switchTo().window(listWindow2.get(0));
    driver.findElement(By.xpath("//a[text()='Merge']")).click();
    Alert alert = driver.switchTo().alert();
    alert.accept();
    String title = driver.getTitle();
    System.out.println(title);
    
	}

}
