package SeamlessHR.Assessment.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployee {

	
	
	
WebDriver driver;
	
	public AddEmployee(WebDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//WebElement username= driver.findElement(By.cssSelector("input[name='username']"));;
	
	@FindBy(css="input[name='username']")
	WebElement userName;
	
	//WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
	@FindBy(xpath="//input[@name='password']")
	WebElement pswrd;
	
	//driver.findElement(By.cssSelector("button[type='submit']"));
	@FindBy(css="button[type='submit']")
	WebElement loginbtn;
	
	//WebElement pimMod=driver.findElement(By.cssSelector("a[href*='viewPimModule']"))
	@FindBy(css="a[href*='viewPimModule']")
	WebElement pimMod;
	
	//driver.findElement(By.xpath("//button[normalize-space()='Add']"));
	
	@FindBy(xpath="//button[normalize-space()='Add']")
	WebElement sbtBtn;
	
	
	
	
	
	
	
	


public void loginPage( String name, String password)
{
	userName.sendKeys(name);
	pswrd.sendKeys(password);
	loginbtn.click();
	
}


public void addEmployee()

{
	pimMod.click();
	sbtBtn.click();
}
}

