package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.cloud7.com:31792/");
		driver.manage().window().maximize();

		WebElement name = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[2]/div[2]/div[1]/div[1]/form/div[1]/div/div/input"));
		name.sendKeys("cloud-admin");

		//driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[2]/div/div[2]/div[1]/div[1]/form/div[2]/div/div/input"));
		WebElement Password = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[2]/div[2]/div[1]/div[1]/form/div[2]/div/div/input"));
		Password.sendKeys("123");
		Thread.sleep(30000);

		WebElement Login = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[2]/div[2]/div[1]/div[1]/form/div[5]/button/span[1]"));
		Login.click();
		Thread.sleep(2000);
	}

}
