package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TSC15_AddToCart_All_WishlistItems {

	 WebDriver driver;

	    @BeforeMethod
		void login() throws InterruptedException {
			
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://magento.softwaretestingboard.com/");
			
			driver.findElement(By.xpath("(//li[@class='authorization-link']//a)[1]")).click();
			
			driver.findElement(By.id("email")).sendKeys("sharapowers123@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("Shara@123");
			driver.findElement(By.xpath("//button[@class='action login primary']//span")).click();

			
	    }
	    @AfterMethod
	    public void teardown() {
	    
	        driver.quit();
	    } 

	    @Test
		void shareWishList() throws InterruptedException {
	    	Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[@class='counter qty'])[1]")).click();
			driver.findElement(By.xpath("//button[@title='Add All to Cart']")).click();
	    }
}
