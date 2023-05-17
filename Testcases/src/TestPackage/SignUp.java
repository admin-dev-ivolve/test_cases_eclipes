package TestPackage;

//import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SignUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","D:\\\\Selenium\\\\geckodriver-v0.31.0-win64\\\\geckodriver.exe"); 
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.cloud7.com:31792/");
		driver.manage().window().maximize();

		WebElement Signup = driver.findElement(By.linkText("Signup"));
		Signup.click();
		Thread.sleep(1000);
		WebElement Organization = driver.findElement(By.name("organization"));
		Organization.sendKeys("HanzalQA");
		WebElement Username = driver.findElement(By.name("username"));
		Username.sendKeys("HanzalaQA");
		WebElement Password = driver.findElement(By.name("password"));
		Password.sendKeys("Hanzala@123");
		WebElement ConfirmPassword = driver.findElement(By.name("confirmPassword"));
		ConfirmPassword.sendKeys("Hanzala@123");
		WebElement Email = driver.findElement(By.name("email"));
		Email.sendKeys("hanzala12345@gmail.com");
		WebElement Phonenumber = driver.findElement(By.className("form-control"));
		Phonenumber.sendKeys("322221152225");
		WebElement Submit = driver.findElement(By.className("MuiButton-label"));
		Submit.click();
		Thread.sleep(80000);
		WebElement Verifys = driver.findElement(By.xpath("(//span[@class=\"MuiButton-label\"])[2]"));
		Verifys.click();
		Thread.sleep(20000);
		WebElement Next = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div/div[2]/div[3]/button[2]/span[1]"));
		Next.click();
		Thread.sleep(10000);
		WebElement Firstname = driver.findElement(By.name("first_name"));
		Firstname.sendKeys("Hanzala");
		WebElement Lastname = driver.findElement(By.name("last_name"));
		Lastname.sendKeys("Abdul Rahim");
		Thread.sleep(20000);
		WebElement Country = driver.findElement(By.id("mui-component-select-country"));
		Country.sendKeys(Keys.ENTER);
		Thread.sleep(20000);
		WebElement Countr = driver.findElement(By.xpath("//*[@id=\"menu-country\"]/div[3]/ul/li[170]"));
		Countr.click();
		WebElement State = driver.findElement(By.name("state"));
		State.sendKeys("Sindh");
		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("Karachi");
		WebElement Submitt = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div/div[2]/div[2]/button[2]/span[1]"));
		Submitt.click();
		Thread.sleep(20000);
		WebElement Login = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div/div[2]/div[2]/button/span[1]"));
		Login.click();

		Thread.sleep(15000);

		WebElement name = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[2]/div[2]/div[1]/div[1]/form/div[1]/div/div/input"));
		name.sendKeys("HanzalQA");
		//driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[1]/form/div[2]/div/div/input"));
		WebElement Passwords = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[2]/div[2]/div[1]/div[1]/form/div[2]/div/div/input"));
		Passwords.sendKeys("Hanzala@123");
		Thread.sleep(80000);
		 WebElement newLogin = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[2]/div[2]/div[1]/div[1]/form/div[5]/button/span[1]"));
		newLogin.click();
		Thread.sleep(2000);
		driver.close();
	}
	
}