import java.util.concurrent.TimeUnit;
 
		import org.openqa.selenium.WebDriver;
 
		import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
 
	public class LogIn_TestCase {
 
		static WebDriver driver;
 
		@FindBy(how = How.XPATH, using = ".//*[@id='account']/a")
		 
		 static WebElement lnk_MyAccount;
	 
		 @FindBy(how = How.ID, using = "log")
	 
		 static WebElement txtbx_UserName;
	 
		 @FindBy(how = How.ID, using = "pwd")
	 
		 static WebElement txtbx_Password;
	 
		 @FindBy(how = How.NAME, using = "submit")
	 
		 static WebElement btn_Login ;
	 
		 @FindBy(how = How.XPATH, using = ".//*[@id='account_logout']/a")
	 
		 static WebElement lnk_LogOut;
 
	public static void main(String[] args) throws InterruptedException{
 
	    //driver = new FirefoxDriver();
	    //System.setProperty("webdriver.chrome.driver", "d:\\yifei\\selenium_webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
        // driver.get("http://store.demoqa.com/products-page/your-account/");
 
		// In order for this code to work and not throw a NullPointerException because 
 
		// the "log", "pwd" nd "submit" fields aren't instantiated, we need to initialise the PageObject
 
		//PageFactory.initElements(driver, LogIn_TestCase.class);
 
		// Once Instantiated, we can now use the above created WebElements
 
		driver.get("http://www.store.demoqa.com");
		 
        PageFactory.initElements(driver, LogIn_TestCase.class);
 
        lnk_MyAccount.click();
 
        txtbx_UserName.sendKeys("javier");
 
        txtbx_Password.sendKeys("javier");
 
        btn_Login.click();
 
        System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
 
        lnk_LogOut.click();
 
		driver.quit();
 
	}
 
}