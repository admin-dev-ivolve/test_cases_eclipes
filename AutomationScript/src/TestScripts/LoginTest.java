package TestScripts;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;

	public class LoginTest  {
//		  WebDriver driver;
//
//		    @BeforeMethod
//		    public void BrowserOpen() {
//		    	System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
//		        driver = new ChromeDriver();
//		        driver.manage().window().maximize();
//		    }
		
		 private WebDriver driver;
		 
		 @BeforeClass
		    public void setUp() {
		        driver = Parent.getInstance();
		    }
	 @Test(priority =1, enabled=true)
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
		 		Thread.sleep(20000);
		 	

	 		}


//	 @AfterMethod
//	 	public void close() {
//		 Customer.setDriver(driver);
//		 //Close the browser window
//	 		//driver.close();
//	}

}
