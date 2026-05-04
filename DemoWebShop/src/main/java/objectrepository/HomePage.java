package objectrepository;

import java.awt.print.PageFormat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(linkText = "Log out")
	private WebElement logoutLink;
	@FindBy(partialLinkText = "BOOKS")
	private WebElement booklink;
	@FindBy(partialLinkText ="COMPUTERS")
	private WebElement computersLink;
	@FindBy(partialLinkText ="ELECTRONICS")
	private WebElement electronicslink;
	@FindBy(partialLinkText ="GIFTCARDS")
	private WebElement giftcardslink;
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		}
	public WebElement getLogoutLink() {
		return logoutLink;
	}
	public WebElement getBooklink() {
		return booklink;
	}
	public WebElement getComputersLink() {
		return computersLink;
	}
	public WebElement getElectronicslink() {
		return electronicslink;
	}
	public WebElement getGiftcardslink() {
		return giftcardslink;
	}
	
}
