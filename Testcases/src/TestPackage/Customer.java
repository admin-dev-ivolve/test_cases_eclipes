package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Customer {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver","D:\\\\Selenium\\\\geckodriver-v0.31.0-win64\\\\geckodriver.exe"); 
		WebDriver driver = new FirefoxDriver();

		WebElement person = driver.findElement(By.id("wrapped-tab-1"));
		person.click();

		WebElement customer = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[2]/ul/div[1]/div/div/div[2]"));
		customer.click();

		Thread.sleep(2000);
		WebElement create = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[1]/div/div/div[1]/div/div[2]/div/div/div[2]/button"));
		create.click();
	 
		Thread.sleep(2000);
		WebElement Oraganization = driver.findElement(By.xpath("//*[@id=\"wrapped-tabpanel-userManagement\"]/div/p/div/div/div/div/div/form/div[1]/div/div/div/div/div/input"));
		Oraganization.sendKeys("Tesla_Technolgy");

		WebElement Username = driver.findElement(By.xpath("//*[@id=\"wrapped-tabpanel-userManagement\"]/div/p/div/div/div/div/div/form/div[2]/div/div/div/div/div/input"));
		Username.sendKeys("Fakar");

		WebElement CreaP = driver.findElement(By.xpath("//*[@id=\"wrapped-tabpanel-userManagement\"]/div/p/div/div/div/div/div/form/div[3]/div/div/div/div/div/input"));
		CreaP.sendKeys("Zaman@!212");
		WebElement First = driver.findElement(By.xpath("//*[@id=\"wrapped-tabpanel-userManagement\"]/div/p/div/div/div/div/div/form/div[4]/div/div/div/div/div/input"));
		First.sendKeys("Zaman");

		//JavascriptExecutor js = (JavascriptExecutor) driver;  
		//js.executeScript("window.scrollBy(5,2000)", "");
		WebElement Last = driver.findElement(By.name("last_name"));
		Last.sendKeys("Fakar");

		WebElement Email = driver.findElement(By.name("email"));
		Email.sendKeys("zaman@gmail.com");

		WebElement lis = driver.findElement(By.id("mui-component-select-country"));
		lis.sendKeys(Keys.ENTER);
		Thread.sleep(10000);

		WebElement countryDropown = driver.findElement(By.xpath("//*[@id=\"menu-country\"]/div[3]/ul/li[170]"));
		countryDropown.click();

		WebElement Province = driver.findElement(By.name("state"));
		Province.sendKeys("sindh");

		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("Karachi");

		WebElement Phone = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div/div/div/div/div/div/div/p/div/div/div/div/div/form/div[10]/div/div/div/input"));
		Phone.sendKeys("34500000");

		WebElement Done = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div/div/div/div/div/div/div/p/div/div/div/div/div/form/div[12]/div/div/div/button"));
		Thread.sleep(20000);
		Done.click();

		WebElement arrow = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div[1]/div[1]/div/div[2]/div[1]/div[2]/svg/path"));
		Thread.sleep(20000);
		arrow.click();
	}

}
