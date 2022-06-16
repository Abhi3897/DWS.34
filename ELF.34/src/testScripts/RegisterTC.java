package testScripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TYSS.BaseTest;
import TYSS.WorkingWithDataProvider1;
import pomRepository.RegisterPage;
import pomRepository.WelcomePage;

public class RegisterTC extends BaseTest{
@Test(dataProvider="TestData")
public void TC_02(String firstname,String lastname,String email,String password,String confirmpassword) {
	driver.get("http://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	WelcomePage welcome=new WelcomePage(driver);
	welcome.RegisterClick();
	
	RegisterPage register=new RegisterPage(driver);
	register.firstname(firstname);
	register.lastname(lastname);
	register.email(email);
	register.password(password);
	register.confirmpassword(confirmpassword);
	register.registerClick();
	
	WelcomePage welcome1=new WelcomePage(driver);
	if(welcome1.getCartLink().isDisplayed()) {
		Reporter.log("PASS : User is registered", true);
	}
	
	
	
}@DataProvider(name="TestData")
public Object[][] datap() throws EncryptedDocumentException, IOException {
	return WorkingWithDataProvider1.getData("Sheet2");
}


}
