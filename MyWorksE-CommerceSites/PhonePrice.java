package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class PhonePrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
ChromeDriver driver = new ChromeDriver(options);
driver.get("https://www.amazon.in/");
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone");
driver.findElement(By.id("nav-search-submit-button")).click();
List<WebElement> price = driver.findElements(By.className("a-price-whole"));
System.out.println(price.size());
List<Integer> list = new ArrayList<Integer>();
for (int i = 0; i < price.size(); i++) {
	String text = price.get(i).getText();
	text.replaceAll(",", text);
int parseInt = Integer.parseInt(text);
list.add(parseInt);
Collections.sort(list);
}
System.out.println(list);

//for (WebElement phone : price) {
	//String allPriceText = each.getText();//6,499
	//System.out.println(phone.getText());
	//System.out.println();
}
	}


