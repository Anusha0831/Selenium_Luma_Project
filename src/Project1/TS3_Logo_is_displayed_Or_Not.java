package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TS3_Logo_is_displayed_Or_Not {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
	
		
		WebElement img=driver.findElement(By.xpath("//a[@class='logo']//img"));
		System.out.println("The logo is :"+img.isDisplayed());


	}

}
