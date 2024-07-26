package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TSR24_Change_Password {

	

	WebDriver driver;
	
	@Test
	void changePassword() throws InterruptedException {
		Thread.sleep(3000);
		WebElement act=driver.findElement(By.xpath("(//button[@type='button'])[1]"));
		act.click();
		driver.findElement(By.xpath("(//ul[@class='header links']//a)[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='box-actions']//a)[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("current_password")).sendKeys("Shartim@22");
		driver.findElement(By.name("password")).sendKeys("Shara@222");
		driver.findElement(By.name("password_confirmation")).sendKeys("Shara@222");
		driver.findElement(By.xpath("//button[@class='action save primary']")).click();
	}
	
	@BeforeMethod
	void login() throws InterruptedException {
		System.out.println("Log into the application");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//li[@class='authorization-link']//a)[1]")).click();
		
		driver.findElement(By.id("email")).sendKeys("shartim22@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Shartim@22");
		driver.findElement(By.xpath("//button[@class='action login primary']//span")).click();

		
		
	}
	@AfterMethod
	void logOut() throws InterruptedException {
		
		driver.quit();
		

	}
}
