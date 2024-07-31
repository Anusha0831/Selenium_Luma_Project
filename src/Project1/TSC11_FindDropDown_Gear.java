package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TSC11_FindDropDown_Gear {


WebDriver driver;
	
	@BeforeMethod
	void login() throws InterruptedException {
		System.out.println("Log into the application");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		
		
		driver.findElement(By.xpath("(//li[@class='authorization-link']//a)[1]")).click();
		
		driver.findElement(By.id("email")).sendKeys("sharapowers123@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Shara@123");
		driver.findElement(By.xpath("//button[@class='action login primary']//span")).click();

		
		
	}

	
	@Test
	void dropDown() throws InterruptedException {
		
 		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e'])[7]")).click();
		driver.findElement(By.xpath("(//li[@class='item']//a)[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='product-image-wrapper']//img)[7]")).click();
		driver.findElement(By.id("qty")).clear();
		driver.findElement(By.id("qty")).sendKeys("2");
		
		driver.findElement(By.xpath("//button[@title='Add to Cart']")).click();
		
	}
	
//	@AfterMethod
//	void closeApplication() {
//		driver.quit();
//	}
}
