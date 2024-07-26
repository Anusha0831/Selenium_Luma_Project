package Project1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TSC10_Delete_WishListItems {

	

WebDriver driver;
	
	@BeforeMethod
	void login() throws InterruptedException {
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://magento.softwaretestingboard.com/");
		
		driver.findElement(By.xpath("(//li[@class='authorization-link']//a)[1]")).click();
		
		driver.findElement(By.id("email")).sendKeys("sharapowers123@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Shara@123");
		driver.findElement(By.xpath("//button[@class='action login primary']//span")).click();

		
		
	}
	@AfterMethod
	void logOut() throws InterruptedException {
		driver.quit();
		

	}
	@Test
	void deleteWishList() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@class='action switch'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//li[@class='link wishlist']//a)[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='Remove Item']")).click();
	}	
}
