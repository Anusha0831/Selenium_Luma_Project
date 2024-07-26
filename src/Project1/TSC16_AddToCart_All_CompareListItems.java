package Project1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TSC16_AddToCart_All_CompareListItems {


	
WebDriver driver;
	
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
	
	@Test
	void compareListItems() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='Compare Products']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type='submit']//span)[2]")).click();
	
	
	
	}
	@AfterMethod
	void logOut() {
		driver.quit();
	}
}
