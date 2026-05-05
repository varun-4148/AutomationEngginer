package books;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericutlity.BaseClass;
import objectrepository.Books;
import objectrepository.HomePage;

public class DWS_TestCase_01 extends BaseClass {
	@Test
	public void clickOnBooks() throws IOException {
		HomePage hp = new HomePage(driver);
		hp.getBooklink().click();
		
		Books bp = new Books(driver);
		bp.getSortByDropdown().click();
		wutil.selectDropdown(futil.getDataFromPrperty("Hightolow"), bp.getSortByDropdown());
		Reporter.log("Bookspage has been sorted",true);
		
		
	}

}
