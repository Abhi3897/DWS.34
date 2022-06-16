package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	public WebElement getMaleGender() {
		return maleGender;
	}
	public WebElement getFemaleGender() {
		return femaleGender;
	}
	public WebElement getFirstnameTF() {
		return firstnameTF;
	}
	public WebElement getLastnameTF() {
		return lastnameTF;
	}
	public WebElement getEmailTF() {
		return emailTF;
	}
	public WebElement getPasswordTF() {
		return passwordTF;
	}
	public WebElement getConfirmpasswordTF() {
		return confirmpasswordTF;
	}
	public WebElement getRegisterButton() {
		return registerButton;
	}
	public void setMaleGender(WebElement maleGender) {
		this.maleGender = maleGender;
	}
	public void setFemaleGender(WebElement femaleGender) {
		this.femaleGender = femaleGender;
	}
	public void setFirstnameTF(WebElement firstnameTF) {
		this.firstnameTF = firstnameTF;
	}
	public void setLastnameTF(WebElement lastnameTF) {
		this.lastnameTF = lastnameTF;
	}
	public void setEmailTF(WebElement emailTF) {
		this.emailTF = emailTF;
	}
	public void setPasswordTF(WebElement passwordTF) {
		this.passwordTF = passwordTF;
	}
	public void setConfirmpasswordTF(WebElement confirmpasswordTF) {
		this.confirmpasswordTF = confirmpasswordTF;
	}
	public void setRegisterButton(WebElement registerButton) {
		this.registerButton = registerButton;
	}
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
}
	@FindBy(xpath = "//input[@id='gender-male']")
	private WebElement maleGender;
	public void maleGenderButton() {
		maleGender.click();
	}
	
	@FindBy(xpath = "//input[@id='gender-female']")
	private WebElement femaleGender;
	public void femaleGenderButton() {
		femaleGender.click();
	}
	
@FindBy(name="FirstName" )
private WebElement firstnameTF;
public void firstname(String Firstname) {
firstnameTF.sendKeys(Firstname);
}

@FindBy(name="LastName")
private WebElement lastnameTF;
public void lastname(String Lastname) {
lastnameTF.sendKeys(Lastname);
}

@FindBy(name="Email" )
private WebElement emailTF;
public void email(String Email) {
emailTF.sendKeys(Email);
}

@FindBy(name="Password" )
private WebElement passwordTF;
public void password(String Password) {
passwordTF.sendKeys(Password);
}

@FindBy(name="ConfirmPassword" )
private WebElement confirmpasswordTF;
public void confirmpassword(String ConfirmPassword) {
confirmpasswordTF.sendKeys(ConfirmPassword);
}

@FindBy(xpath="//input[@id='register-button']")
private WebElement registerButton;
public void registerClick() {
	registerButton.click();
}

}
