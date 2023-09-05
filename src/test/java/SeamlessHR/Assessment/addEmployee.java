package SeamlessHR.Assessment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import SeamlessHR.Assessment.PageObjects.AddEmployee;
import io.github.bonigarcia.wdm.WebDriverManager;

public class addEmployee {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{
			String url =  "https://opensource-demo.orangehrmlive.com";
			WebDriverManager.chromedriver().setup();
			WebDriver driver= new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			
			AddEmployee addEmployee= new AddEmployee(driver);
			
			addEmployee.loginPage("Admin", "admin123");
			
			addEmployee.addEmployee();
			
			
			
			driver.quit();
			
		}
	}

}
