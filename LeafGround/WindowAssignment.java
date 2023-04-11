package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--remote-allow-origins=*");
    ChromeDriver driver = new ChromeDriver(options);
    driver.manage().window().maximize();
    driver.get("https://www.leafground.com/window.xhtml");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.findElement(By.xpath("//span[text()='Open']")).click();
    Set<String> windowHandles = driver.getWindowHandles();
    List<String> listWindow = new ArrayList<String>(windowHandles);
    driver.switchTo().window(listWindow.get(1));
    String title = driver.getTitle();
    System.out.println(title);
    if (title.equalsIgnoreCase("dashboard")) {
    		System.out.println(title);
		
	}
    driver.switchTo().window(listWindow.get(0));
    driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
    Set<String> windowHandles2 = driver.getWindowHandles();
    List<String> listWindow2 = new ArrayList<String>(windowHandles2);
    driver.switchTo().window(listWindow2.get(1));
    int size = listWindow2.size();
    System.out.println(size);
    driver.switchTo().window(listWindow2.get(0));
    driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
    Set<String> windowHandles3 = driver.getWindowHandles();
    List<String> listWindow3 = new ArrayList<String>(windowHandles3);
    driver.switchTo().window(listWindow3.get(1));
    driver.close();
    driver.switchTo().window(listWindow3.get(2));
    driver.close();
    driver.switchTo().window(listWindow3.get(3));
    driver.close();
    
    
    
	}

}
