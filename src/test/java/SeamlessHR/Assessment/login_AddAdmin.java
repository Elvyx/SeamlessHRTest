package SeamlessHR.Assessment;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import SeamlessHR.Assessment.PageObjects.AddAdmin;
import io.github.bonigarcia.wdm.WebDriverManager;

public class login_AddAdmin {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		{
			String url =  "https://opensource-demo.orangehrmlive.com";
			WebDriverManager.chromedriver().setup();
			WebDriver driver= new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			
			AddAdmin landingPage= new AddAdmin(driver);
			
			landingPage.loginPage("Admin", "admin123");
			
			landingPage.addAdmin();
			
			
			
			
			
			
			
	        
	        
	        
			
			driver.quit();
			
			
			
		}
	}

}
