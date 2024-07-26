package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TSC12_WomenDropDown_SelectJackets {


WebDriver driver;
	
	@BeforeMethod
	void login() throws InterruptedException {
		System.out.println("Log into the application");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//li[@class='authorization-link']//a)[1]")).click();
		
		driver.findElement(By.id("email")).sendKeys("sharapowers123@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Shara@123");
		driver.findElement(By.xpath("//button[@class='action login primary']//span")).click();

		
		
	}
	@AfterMethod
	void logOut() throws InterruptedException {
		System.out.println("logout the application");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		driver.findElement(By.xpath("(//li[@class='authorization-link']//a)[1]")).click();
		
		driver.quit();
		
	}
	@Test
	void womenDropDown() {
		
		driver.findElement(By.xpath("(//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e'])[1]")).click();
		driver.findElement(By.xpath("(//li[@class='item']//a)[4]")).click();
		driver.findElement(By.xpath("(//img[@class='product-image-photo'])[10]")).click();
		driver.findElement(By.xpath("(//div[@class='swatch-option text'])[3]")).click();
		driver.findElement(By.xpath("(//div[@class='swatch-option color'])[3]")).click();
		driver.findElement(By.xpath("(//a[@class='action towishlist']//span)[1]")).click();
		}
}
