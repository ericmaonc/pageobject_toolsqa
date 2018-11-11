package automationFramework;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class LoginPageTest {
	static WebDriver driver;
	 
	public static void main(String[] args) throws InterruptedException{
		driver = new ChromeDriver();
		//driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://www.store.demoqa.com");

		// This is to Instantiate Home Page and LogIn Page class  

		HomePage homePage = PageFactory.initElements(driver, HomePage.class);

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

		// Once both classes Initialised, use their Web Element Objects

		homePage.lnk_MyAccount.click();

		loginPage.txtbx_UserName.sendKeys("javier");

		loginPage.txtbx_Password.sendKeys("javier");

		loginPage.btn_Login.click();

		System.out.println(" Login Successfully, now it is the time to Log Off buddy.");

		homePage.lnk_LogOut.click();

		driver.quit();

	}

}
