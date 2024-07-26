package Project1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TSR22_AdvanceSearch {

	WebDriver driver;
	
	@Test
	void advSearch() throws InterruptedException {
		driver.findElement(By.xpath("(//li[@class='nav item']//a)[3]")).click();
		driver.findElement(By.id("name")).sendKeys("Circe Hooded Ice Fleece");
		driver.findElement(By.id("sku")).sendKeys("WH12");
		driver.findElement(By.id("description")).sendKeys("Full-zip front");
		driver.findElement(By.id("short_description")).sendKeys("Welt hand pockets");
		driver.findElement(By.id("price")).sendKeys("68");
		driver.findElement(By.xpath("//button[@class='action search primary']//span")).click();
	    
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//img[@class='product-image-photo'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='swatch-option text'])[3]")).click();
		driver.findElement(By.xpath("(//div[@class='swatch-option color'])[1]")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	
	
	
	}
	
	
	@BeforeMethod
	void login() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
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
