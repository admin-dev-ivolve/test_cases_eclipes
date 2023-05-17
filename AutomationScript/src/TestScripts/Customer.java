package TestScripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Customer {
	
	private WebDriver driver;
	 
	 @BeforeClass
	    public void setUp() {
	        driver = Parent.getInstance();
	    }
	
//	static WebDriver driver;pa
//	
//	
//	// Setter method for the driver
//    public static void setDriver(WebDriver driver) {
//        driver = driver;
//    }
//	@BeforeMethod
//	  public void BrowserOpen() {
//		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
//		driver = new ChromeDriver();
//	  }
  @Test(priority=2, enabled=true)
  public void PerformAction() throws InterruptedException {
	  	  
	  //Fill the From according to the given fields
	 
	  WebElement person = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[1]/div/div/button[2]/span[1]/span"));
	  person.click();


	  WebElement customer = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[2]/ul/div[1]/div/div/div[2]/div/span"));
	  customer.click();

	

	  Thread.sleep(2000);
	  WebElement create = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[1]/div/div/div[1]/div/div[2]/div/div/div[2]/button/span[1]"));
	  create.click();

	  Thread.sleep(2000);
	  WebElement Oraganization = driver.findElement(By.xpath("//*[@id=\"wrapped-tabpanel-userManagement\"]/div/p/div/div/div/div/div/form/div[1]/div/div/div/div/div/input"));
	  Oraganization.sendKeys("Huawei Cloud Customer");

	 
	  WebElement Username = driver.findElement(By.xpath("//*[@id=\"wrapped-tabpanel-userManagement\"]/div/p/div/div/div/div/div/form/div[2]/div/div/div/div/div/input"));
	  Username.sendKeys("Huawei Customer");


	  WebElement Password = driver.findElement(By.xpath("//*[@id=\"wrapped-tabpanel-userManagement\"]/div/p/div/div/div/div/div/form/div[3]/div/div/div/div/div/input"));
	  Password.sendKeys("User@123");
	  WebElement First = driver.findElement(By.xpath("//*[@id=\"wrapped-tabpanel-userManagement\"]/div/p/div/div/div/div/div/form/div[4]/div/div/div/div/div/input"));
	  First.sendKeys("Hanzala");

	  
	  //JavascriptExecutor js = (JavascriptExecutor) driver;��
	  //js.executeScript("window.scrollBy(5,2000)", "");
	  WebElement Last = driver.findElement(By.name("last_name"));
	  Last.sendKeys("Rahiim");


	  WebElement Email = driver.findElement(By.name("email"));
	  Email.sendKeys("hanzala@ivolve.io");

	  
	  WebElement lis = driver.findElement(By.id("mui-component-select-country"));
	  lis.sendKeys(Keys.ENTER);
	  Thread.sleep(10000);



	  WebElement countryDropown = driver.findElement(By.xpath("//*[@id=\"menu-country\"]/div[3]/ul/li"));
	  countryDropown.click();

	  
	  WebElement Province = driver.findElement(By.name("state"));
	  Province.sendKeys("sindh");

	 
	  WebElement city = driver.findElement(By.name("city"));
	  city.sendKeys("Karachi");

	

	  WebElement Phone = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div/div/div/div/div/div/div/p/div/div/div/div/div/form/div[10]/div/div/div/input"));
	  Phone.sendKeys("3122403150");

	  
	  WebElement Done = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div/div/div/div/div/div/div/p/div/div/div/div/div/form/div[12]/div/div/div/button"));
	  Thread.sleep(20000);
	  Done.click();



	  WebElement arrow = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div[1]/div[1]/div/div[2]/div[1]/div[2]/svg/path"));
	  Thread.sleep(20000);
	  arrow.click();
  }
  
  @AfterMethod
  public void close() {
		 //Close the browser window
	 		//driver.close();
  }
}
