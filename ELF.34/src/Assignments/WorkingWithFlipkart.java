package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithFlipkart {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.flipkart.com/");
	
	String parent = driver.getWindowHandle();
	driver.findElement(By.xpath("//button[contains(@class,'doB')]")).click();
	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Nokia G20");
	
			
}
}
