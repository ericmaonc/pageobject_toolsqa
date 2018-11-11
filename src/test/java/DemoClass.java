import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class DemoClass {
  
	private static WebDriver driver = null;
	
	@Test
	public void testLogin() throws Exception {
		
		//System.setProperty("webdriver.chrome.driver", "/Users/a419449/selenium_driver/chromedriver");
		System.setProperty("webdriver.chrome.driver", "d:\\yifei\\selenium_webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.store.demoqa.com");

        // Find the element that's ID attribute is 'account'(My Account) 

        driver.findElement(By.xpath(".//*[@id='account']/a")).click();

        // Find the element that's ID attribute is 'log' (Username)
 
        // Enter Username on the element found by above desc.
 
        driver.findElement(By.id("log")).sendKeys("javier"); 
 
        // Find the element that's ID attribute is 'pwd' (Password)
 
        // Enter Password on the element found by the above desc.
 
        driver.findElement(By.id("pwd")).sendKeys("javier");
 
        // Now submit the form. WebDriver will find the form for us from the element 
 
        driver.findElement(By.id("login")).click();
 
        // Print a Log In message to the screen
        Thread.sleep(2000);
        
        System.out.println("Login Successfully");
 
        // Find the element that's ID attribute is 'account_logout' (Log Out)
 
        driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
 
        // Print a Log In message to the screen
 
        System.out.println("LogOut Successfully");
        
        driver.quit();
	}
	
	
	

}
