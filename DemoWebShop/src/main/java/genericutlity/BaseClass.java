package genericutlity;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import objectrepository.HomePage;
import objectrepository.LoginPage;
import objectrepository.WelcomePage;

public class BaseClass {
	public static WebDriver driver;
	
	public JavaUtility jutil = new JavaUtility();
	public WebdriverUtility wutil = new WebdriverUtility();
	public FileUtility futil = new FileUtility();
	public ExcelUtility eutil = new ExcelUtility();
	
	@BeforeClass
	public void openbrowser() {
		driver = new ChromeDriver();
		wutil.maximize(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@BeforeMethod
	public void login() throws IOException {
		WelcomePage wp = new WelcomePage(driver);
		wp.getLoginlink().click();
		
		LoginPage lp =new LoginPage(driver);
		lp.getEmailtextfield().sendKeys(futil.getDataFromPrperty("email"));
		lp.getPasswordtextfield().sendKeys(futil.getDataFromPrperty("pass"));
		lp.getLoginbtn().click();
	}
	
	/*@AfterMethod
	public void logout() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		Thread.sleep(2000);
		hp.getLogoutLink().click();
	}
	
	@AfterClass
	public void closeBroswer() {
		driver.quit();
	}*/
	
}
