package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public WebElement getLogoutLink() {
		return logoutLink;
	}
	public void setLogoutLink(WebElement logoutLink) {
		this.logoutLink = logoutLink;
	}
	public WebElement getBooks() {
		return books;
	}
	public WebElement getComputers() {
		return computers;
	}
	public WebElement getElectronics() {
		return electronics;
	}
	public WebElement getApparel() {
		return apparel;
	}
	public WebElement getDigitaldownloads() {
		return digitaldownloads;
	}
	public WebElement getJewelry() {
		return jewelry;
	}
	public WebElement getGiftCardsLink() {
		return giftCardsLink;
	}
	public void setBooks(WebElement books) {
		this.books = books;
	}
	public void setComputers(WebElement computers) {
		this.computers = computers;
	}
	public void setElectronics(WebElement electronics) {
		this.electronics = electronics;
	}
	public void setApparel(WebElement apparel) {
		this.apparel = apparel;
	}
	public void setDigitaldownloads(WebElement digitaldownloads) {
		this.digitaldownloads = digitaldownloads;
	}
	public void setJewelry(WebElement jewelry) {
		this.jewelry = jewelry;
	}
	public void setGiftCardsLink(WebElement giftCardsLink) {
		this.giftCardsLink = giftCardsLink;
	}
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[contains(text(),'Books')])[1]")
	private WebElement books;
	public void booksClick() {
		books.click();
		}
	
	@FindBy(xpath="(//a[contains(text(),'Computers')])[1]")
	private WebElement computers;
	public void computersClick() {
		computers.click();
		}
	
	@FindBy(xpath="(//a[contains(text(),'Electronics')])[1]")
	private WebElement electronics;
	public void electronicsClick() {
		electronics.click();
		}
	
	@FindBy(xpath="(//a[contains(text(),'Apparel')])[1]")
	private WebElement apparel;
	public void apparelClick() {
		apparel.click();
		}
	
	@FindBy(xpath="(//a[contains(text(),'Digital')])[1]")
	private WebElement digitaldownloads;
	public void digitalClick() {
		digitaldownloads.click();
		}
	
	@FindBy(xpath="(//a[contains(text(),'Jewelry')])[1]")
	private WebElement jewelry;
	public void jewelryClick() {
		jewelry.click();
		}
	
	@FindBy(xpath = "//div[@class='header-menu']//a[contains(text(),'Gift Cards')]")
	private WebElement giftCardsLink;
	public void giftCardsClick() {
		giftCardsLink.click();
	}

	@FindBy(className = "ico-logout")
	private WebElement logoutLink;
	public void logoutClick() {
		logoutLink.click();
	}
}
