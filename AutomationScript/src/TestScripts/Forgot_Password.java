package TestScripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Forgot_Password {
	
	WebDriver driver;
	
	@BeforeMethod
	  public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Forgot Password");
	  }
	
  @Test (description = "Forgot_password")
  public void forgot_password() throws InterruptedException {
	  driver.get("http://demo.cloud7.com:31792/");
	  driver.manage().window().maximize();
	  WebElement forgot = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[2]/div[2]/div[1]/div[1]/form/div[3]/span"));
	  forgot.click();
	  Thread.sleep(1000);
	  WebElement email = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[2]/div/form/div[1]/div/div/input"));
	  email.sendKeys("hanzala@ivolve.io");
	  Thread.sleep(1000);
	  WebElement send = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/form/div[2]/button"));
	  send.click();
	  WebElement login = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[2]/div/form/div[3]/a"));
	  login.click();
	  }
 
  @AfterMethod
  public void afterMethod() {
	//Close the browser windwa
		//driver.close();
  }

}
