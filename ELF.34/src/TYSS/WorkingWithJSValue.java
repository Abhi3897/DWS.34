package TYSS;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithJSValue {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com/");
	WebElement TF=driver.findElement(By.xpath("//input[@class='form-control']"));
	JavascriptExecutor Js=(JavascriptExecutor)driver;
	Js.executeScript("arguments[0].value='Abhi';",TF);
	driver.close();
	
}
}

