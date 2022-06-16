package Assignments;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithAmazon {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("https://www.flipkart.com/");
	
	String parent = driver.getWindowHandle();
	driver.findElement(By.xpath("//button[contains(@class,'doB')]")).click();
	WebElement target = driver.findElement(By.xpath("//input[contains(@title,'Search for products, brands and more')]"));
	target.sendKeys("nokia g20");
	Actions act = new Actions(driver);
	act.sendKeys(target,Keys.ENTER).build().perform();
	driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
	Set<String> handles = driver.getWindowHandles();
	for(String s:handles) {
		if(s.equals(parent)==false)
			driver.switchTo().window(s);
	}
	String price = driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']")).getText();
	System.out.println("Nokia G20 QTY 1 price "+price);
	Thread.sleep(7000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
	Thread.sleep(7000);
	Actions action=new Actions(driver);
	action.sendKeys(Keys.PAGE_DOWN);
	Thread.sleep(2000);
	action.sendKeys(Keys.PAGE_DOWN);
	Thread.sleep(4000);
    WebElement QT=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
    QT.sendKeys(Keys.CONTROL+"A");
    QT.sendKeys("2");
    String price2 = driver.findElement(By.xpath("//span[@class='_2-ut7f _1WpvJ7']")).getText();
	System.out.println("Nokia G20 QTY 2 price "+price2);
}


}

