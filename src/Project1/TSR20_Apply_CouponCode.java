package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TSR20_Apply_CouponCode {

	 WebDriver driver;

	    @BeforeMethod
	    void login() throws InterruptedException {
	   
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://magento.softwaretestingboard.com/\n");

	        driver.findElement(By.xpath("(//li[@class='authorization-link']//a)[1]")).click();

	        driver.findElement(By.id("email")).sendKeys("sharapowers123@gmail.com");
	        driver.findElement(By.id("pass")).sendKeys("Shara@123");
	        driver.findElement(By.xpath("//button[@class='action login primary']//span")).click();

	        // Wait for login to complete
	        Thread.sleep(3000); 	    }

	    @Test
	    void deleteCart() throws InterruptedException {
	        WebElement cartIcon = driver.findElement(By.xpath("//a[@class='action showcart']"));
	        cartIcon.click();
	        driver.findElement(By.xpath("//a[@class='action viewcart']")).click();
	        driver.findElement(By.id("block-discount-heading")).click();
	        driver.findElement(By.name("coupon_code")).sendKeys("FIRSTONE");
	        driver.findElement(By.xpath("(//button[@type='button']//span)[6]")).click();
}
	    @AfterMethod
	    void logOut() {
	    	driver.quit();
	    }
}
