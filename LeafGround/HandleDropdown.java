package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://leafground.com/select.xhtml");
WebElement select = driver.findElement(By.className("ui-selectonemenu"));
Select dropdown = new Select(select);
//dropdown.selectByIndex(2);
dropdown.selectByVisibleText("Cypress");
driver.findElement(By.id("j_idt87:country_label")).click();
driver.findElement(By.id("j_idt87:country_3")).click();
Thread.sleep(2000);
driver.findElement(By.id("j_idt87:city_label")).click();
driver.findElement(By.id("j_idt87:city_2")).click();
driver.findElement(By.xpath("//button[contains(@class,'ui-autocomplete-dropdown')]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//button[contains(@class,'ui-autocomplete-dropdown')]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//li[text()='Appium']")).click();
driver.findElement(By.id("j_idt87:lang_label")).click();
driver.findElement(By.id("j_idt87:lang_2")).click();
Thread.sleep(2000);
driver.findElement(By.id("j_idt87:value_label")).click();
driver.findElement(By.id("j_idt87:value_1")).click();



	}

}//li[text()='Selenium WebDriver']
//WebElement selenium = driver.findElement(By.xpath("//li[text()='Selenium WebDriver']"));
//selenium.click();