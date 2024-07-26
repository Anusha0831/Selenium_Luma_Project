package Project1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TSC13_SortByDropDown {


	WebDriver driver;
	
	@Test
	void sortByDropDown() throws InterruptedException {
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@class='level-top ui-corner-all']//span)[10]")).click();
       
        driver.findElement(By.xpath("(//li[@class='item']//a)[13]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//select[@class='sorter-options'])[1]")).sendKeys("Product Name");
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//span[@class='product-image-wrapper']//img)[7]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[@type='submit']//span)[2]")).click();
    }
	
	

	@BeforeMethod
	void login() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.findElement(By.xpath("(//li[@class='authorization-link']//a)[1]")).click();
		
		driver.findElement(By.id("email")).sendKeys("sharapowers123@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Shara@123");
		driver.findElement(By.xpath("//button[@class='action login primary']//span")).click();
	}
}
