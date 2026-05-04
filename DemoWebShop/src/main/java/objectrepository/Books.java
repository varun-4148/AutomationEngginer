package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Books {
	@FindBy(id = "products-orderby")
	private WebElement sortByDropdown;
	
	public Books(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getSortByDropdown() {
		return sortByDropdown;
	}
	
}
