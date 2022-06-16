package TYSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WorkingwithAssert extends BaseTest {
@Test
public void TC() {
	driver.manage().window().maximize();
	driver.get("http://demowebshop.tricentis.com/");
	WebElement RegisterLink=driver.findElement(By.className("ico-register"));
	
	SoftAssert ast=new SoftAssert();
	ast.assertEquals(RegisterLink.getText(), "Login", "PASS");

	RegisterLink.click();
	ast.assertAll();
}
}
