package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
	 
public class HomePage {
	 
	final WebDriver driver;
 
	@FindBy(how = How.XPATH, using = ".//*[@id='account']/a")
	public WebElement lnk_MyAccount;
 
	@FindBy(how = How.XPATH, using = ".//*[@id='account_logout']/a")
	public WebElement lnk_LogOut;

	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
}