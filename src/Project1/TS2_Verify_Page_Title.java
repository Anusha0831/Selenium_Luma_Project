package Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TS2_Verify_Page_Title {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/\n");
		
		
		String expected_title="Home Page";
		String actual_title=driver.getTitle();
		
		if(expected_title.equals(actual_title)) {
			System.out.println("Matched");
		}
		else {
			System.out.println("Not Matched");
		}

	}

}
