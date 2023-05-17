package TestPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class LoginTest {
	WebDriver driver;
	
	 @BeforeMethod
	  public void BrowserOpen() {
		 System.setProperty("webdriver.gecko.driver","D:\\\\Selenium\\\\geckodriver-v0.31.0-win64\\\\geckodriver.exe"); 
		 driver = new FirefoxDriver();
	  }
	 
  @Test
  public void testlogin() throws InterruptedException {
	    //Navigate to the login page
		driver.get("http://demo.cloud7.com:31792/");
		
		//Fill in the username and password field
		WebElement name = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[2]/div[2]/div[1]/div[1]/form/div[1]/div/div/input"));
		name.sendKeys("cloud-admin");

		WebElement Password = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[2]/div[2]/div[1]/div[1]/form/div[2]/div/div/input"));
		Password.sendKeys("123");
		Thread.sleep(30000);

		//click on the login button
		WebElement Login = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[2]/div[2]/div[1]/div[1]/form/div[5]/button/span[1]"));
		Login.click();
		Thread.sleep(2000);
		
  }
 

  @AfterMethod
  public void close() {
	  //Close the current browser window
	  driver.close();
  }

}
