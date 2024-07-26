package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TS4_Register {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Create an Account")).click();
		
		driver.findElement(By.id("firstname")).sendKeys("Shara");
		driver.findElement(By.id("lastname")).sendKeys("Powers");
		
		Thread.sleep(3000);
		driver.findElement(By.id("email_address")).sendKeys("sharapowers123@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Shara@123");
		Thread.sleep(3000);
		driver.findElement(By.id("password-confirmation")).sendKeys("Shara@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@title='Create an Account']")).click();


	}

}
