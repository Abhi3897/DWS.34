package testScripts;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import TYSS.BaseTest;
import pomRepository.HomePage;
import pomRepository.WelcomePage;

public class HomeTC extends BaseTest{
@Test
	public void TC_03() {
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
WelcomePage welcome=new WelcomePage(driver);
welcome.LoginClick();

	HomePage home=new HomePage(driver);
	home.booksClick();
	home.computersClick();
	home.electronicsClick();
	home.digitalClick();
	home.apparelClick();
	home.jewelryClick();
	
}	
}
