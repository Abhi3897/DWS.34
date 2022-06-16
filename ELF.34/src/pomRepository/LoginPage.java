package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebElement getEmailTF() {
		return emailTF;
	}
	public WebElement getPasswordTF() {
		return passwordTF;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	public WebElement getSearchTextField() {
		return searchTextField;
	}
	public WebElement getSearchButton() {
		return searchButton;
	}
	public void setEmailTF(WebElement emailTF) {
		this.emailTF = emailTF;
	}
	public void setPasswordTF(WebElement passwordTF) {
		this.passwordTF = passwordTF;
	}
	public void setLoginButton(WebElement loginButton) {
		this.loginButton = loginButton;
	}
	public void setSearchTextField(WebElement searchTextField) {
		this.searchTextField = searchTextField;
	}
	public void setSearchButton(WebElement searchButton) {
		this.searchButton = searchButton;
	}
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
@FindBy(id="Email")
private WebElement emailTF;
public void email(String Email) {
	emailTF.sendKeys(Email);
}

@FindBy(id="Password")
private WebElement passwordTF;
public void password(String Password) {
	passwordTF.sendKeys(Password);
}


@FindBy(xpath="//input[@value='Log in']")
private WebElement loginButton;
public void loginClick() {
	loginButton.click();
}
@FindBy(xpath = "//input[@id='small-searchterms']")
private WebElement searchTextField;
public void search(String value) {
	searchTextField.sendKeys(value);
}
@FindBy(xpath = "//input[@type='submit']")
private WebElement searchButton;
public void searchButtonClick() {
	searchButton.click();
}
public void searchAndClick(String value) {
	searchTextField.sendKeys(value);
	searchButton.click();
}

}
