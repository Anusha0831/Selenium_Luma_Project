package Project1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TSC18_ChangeLastName {


	WebDriver driver;
	
	  @Test
	    void deleteCart() throws InterruptedException {
	        // Click on the cart icon to open the cart
	    	driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//ul[@class='header links']//a)[1]")).click();
			driver.findElement(By.xpath("(//li[@class='nav item']//a)[5]")).click();
			driver.findElement(By.id("lastname")).clear();
			driver.findElement(By.id("lastname")).sendKeys("P");
			driver.findElement(By.xpath("(//button[@type='submit']//span)[2]")).click();
}

		@BeforeMethod
		void login() throws InterruptedException {
			System.out.println("Log into the application");
			
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().window().maximize();
			driver.get("https://magento.softwaretestingboard.com/");
			driver.findElement(By.xpath("(//li[@class='authorization-link']//a)[1]")).click();
			
			driver.findElement(By.id("email")).sendKeys("sharapowers123@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("Shara@123");
			driver.findElement(By.xpath("//button[@class='action login primary']//span")).click();
	  
	  
		}
		@AfterMethod
		void logOut() {
			driver.quit();
		}
	  
}
