package testScripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import AdvanceSelenium.WorkingWithPropertyfile;
import TYSS.BaseTest;
import TYSS.WorkingWithDataProvider1;
import TYSS.WorkingWithMultipleread;
import pomRepository.HomePage;
import pomRepository.LoginPage;
import pomRepository.WelcomePage;

public class LoginTC extends BaseTest{
@Test(dataProvider="TestData")
public void TC_01(String email,String password) throws IOException {
driver.get(WorkingWithPropertyfile.readProperties("URL"));
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

WelcomePage welcome=new WelcomePage(driver);
welcome.LoginClick();

LoginPage login=new LoginPage(driver);
login.email(email);
login.password(password);
login.loginClick();

HomePage home=new HomePage(driver);
if(home.getLogoutLink().isDisplayed()) {
	Reporter.log("PASS : User is logged in", true);
}
}
@DataProvider(name="TestData")
public Object[][] datap() throws EncryptedDocumentException, IOException {
	return WorkingWithDataProvider1.getData("Sheet1");
}
}
