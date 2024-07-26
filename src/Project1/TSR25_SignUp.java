package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TSR25_SignUp {


	WebDriver driver;
	
	@Test (dataProvider= "dataSet")
	public void login(String un,String pass) throws InterruptedException {
		System.out.println(un+"===>"+pass);
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/\n");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//li[@class='authorization-link']//a)[1]")).click();

		Thread.sleep(3000);
        driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@class='action login primary']//span")).click();

	}
	
	@DataProvider (name="dataSet")
	public Object[][] dpmethod(){
		return new Object[][] {
			{"sharapowers123@gmail.com","Shara@123"}
			};	
	}
	
	@AfterMethod
	void logOut() throws InterruptedException {
		System.out.println("logout the application");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		driver.findElement(By.xpath("(//li[@class='authorization-link']//a)[1]")).click();
	}
}
