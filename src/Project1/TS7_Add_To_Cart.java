package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TS7_Add_To_Cart {


	
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
		driver.quit();
		

	}
	@Test
	void search() throws InterruptedException {
		System.out.println("Search the application");
		Thread.sleep(3000);
		driver.findElement(By.id("search")).sendKeys("Tops");
		driver.findElement(By.xpath("(//span[@class='product-image-wrapper']//img)[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='swatch-option text'])[3]")).click();
		driver.findElement(By.xpath("(//div[@class='swatch-option color'])[3]")).click();
		driver.findElement(By.id("product-addtocart-button")).click();

	}
	@Test
	void advSearch() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(By.id("search")).sendKeys("jackets");
		
	}
}
