package Project1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TSR23_MenDropDown_SelectMaterial {

WebDriver driver;

    @Test
    void menDropDown() throws InterruptedException {
    	driver.findElement(By.xpath("//a[@id='ui-id-5']")).click();
    	WebElement ts=driver.findElement(By.xpath("(//li[@class='item']//a)[5]"));
    	
        Actions act=new Actions(driver);
		
		Thread.sleep(3000);
		//ctrl+reglink
		act.keyDown(Keys.CONTROL).click(ts).keyUp(Keys.CONTROL).perform();
		Thread.sleep(3000);
		//switch to reglink
		List<String> ids=new ArrayList(driver.getWindowHandles());
		
		Thread.sleep(3000);
		
		driver.switchTo().window(ids.get(1));
		driver.findElement(By.xpath("(//div[@class='filter-options-title'])[7]")).click();
    	driver.findElement(By.xpath("(//li[@class='item'])[18]")).click();
    	Thread.sleep(3000);
    	
    	WebElement top=driver.findElement(By.xpath("(//span[@class='product-image-wrapper']//img)[2]"));
    	top.click();
    	driver.findElement(By.xpath("//div[@id='option-label-size-143-item-168']")).click();
    	driver.findElement(By.xpath("//div[@id='option-label-color-93-item-50']")).click();
    	driver.findElement(By.xpath("//button[@id='product-addtocart-button']")).click();
    	
    	
    	Thread.sleep(3000);
		//home page
		driver.switchTo().window(ids.get(0));
		driver.findElement(By.xpath("//a[@class='action showcart']")).click();
		Thread.sleep(3000);
    
    }



	
	@BeforeMethod
	void login() throws InterruptedException {
		System.out.println("Log into the application");
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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
	
}
