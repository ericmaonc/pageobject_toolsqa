package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	final WebDriver driver;
	 
	@FindBy(how = How.ID, using = "log")
	public WebElement txtbx_UserName;
 
	@FindBy(how = How.ID, using = "pwd")
	public WebElement txtbx_Password;
 
	@FindBy(how = How.NAME, using = "submit")
	public WebElement btn_Login ;
  
	public LoginPage(WebDriver driver){ 
		this.driver = driver; 
    }
}
