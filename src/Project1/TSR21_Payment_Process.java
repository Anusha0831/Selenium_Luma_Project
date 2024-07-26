package Project1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TSR21_Payment_Process {

WebDriver driver;
	
	
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
    @Test
    void paymentProcess() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='action showcart']")).click();
        driver.findElement(By.xpath("//button[@class='action primary checkout']")).click();

        // Fill shipping details
        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.clear();
        firstName.sendKeys("Pra");

        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.clear();
        lastName.sendKeys("P");

        driver.findElement(By.name("company")).sendKeys("ABC");

        driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("US");
        driver.findElement(By.name("city")).sendKeys("YourCity");

        WebElement regionDropdown = driver.findElement(By.name("region_id"));
        Select regionSelect = new Select(regionDropdown);
        regionSelect.selectByVisibleText("Florida");

        driver.findElement(By.name("postcode")).sendKeys("33035");

        driver.findElement(By.name("telephone")).sendKeys("123456790");

        driver.findElement(By.xpath("(//td[@class='col col-method']//input)[1]")).click();
    
        driver.findElement(By.xpath("(//button[@class='button action continue primary']//span)")).click(); 
        
        Thread.sleep(5000);
       driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[@type='submit']//span)[3]")).click();
        
       
        

    }
}
