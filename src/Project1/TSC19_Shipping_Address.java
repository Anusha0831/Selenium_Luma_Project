package Project1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TSC19_Shipping_Address {

WebDriver driver;
	
	@Test
	void shippingAddress() throws InterruptedException {
		
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//a[@class='action showcart']")).click();
	       driver.findElement(By.xpath("//button[@id='top-cart-btn-checkout']")).click();
	       Thread.sleep(3000);
	      WebElement ship= driver.findElement(By.name("firstname"));
	      ship.clear();
	      ship.sendKeys("Pra");
	      Thread.sleep(3000);
	      WebElement last=driver.findElement(By.name("lastname"));
	      last.clear();
	      last.sendKeys("P");
	      Thread.sleep(2000);
	      driver.findElement(By.name("company")).sendKeys("ABC");
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("(//input[@class='input-text'])[6]")).sendKeys("US");
	      driver.findElement(By.name("city")).sendKeys("US");
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("(//select[@class='select'])[1]")).sendKeys("Florida");
	     
	      driver.findElement(By.xpath("(//input[@class='input-text'])[11]")).sendKeys("33034");
	    
	      driver.findElement(By.xpath("(//select[@class='select'])[2]")).sendKeys("United States");
	    
	      driver.findElement(By.name("telephone")).sendKeys("8888888888");
	      
	      driver.findElement(By.xpath("(//td[@class='col col-method']//input)[1]")).click();
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	
	}
	
	@BeforeMethod
	void login() throws InterruptedException {
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
