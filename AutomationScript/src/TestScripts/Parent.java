package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent {
	private static WebDriver driver;
	
	private Parent() {
        // Private constructor to prevent instantiation
    }
	
	public static WebDriver getInstance() {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
        if (driver == null) {
            // Initialize the WebDriver instance (e.g., ChromeDriver, FirefoxDriver, etc.)
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        return driver;
    }

//	    @BeforeMethod
//	    public void BrowserOpen() {
//	    	if(driver == null) {
//	    		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
//		        driver = new ChromeDriver();
//		        driver.manage().window().maximize();
//	    	}
//	    }
//	    @AfterMethod
//	 	public void close() {
//		 Customer.setDriver(driver);
		 //Close the browser windows
//	 		driver.close();
//	}
}
