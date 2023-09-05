package SeamlessHR.Assessment.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddAdmin {

	
	
	
WebDriver driver;
	
	public AddAdmin(WebDriver driver)
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
	
	//driver.findElement(By.cssSelector("a[href*='viewAdminModule']"));
	@FindBy(css="a[href*='viewAdminModule']")
	WebElement adminMod;
	
	//driver.findElement(By.xpath("driver.findElement(By.xpath("//button[normalize-space()='Add']"));));
	
	@FindBy(xpath="//button[normalize-space()='Add']")
	WebElement addbtn;
	
	
	
	
	
	
	
	


public void loginPage( String name, String password)
{
	userName.sendKeys(name);
	pswrd.sendKeys(password);
	loginbtn.click();
	
}


public void addAdmin()

{
	adminMod.click();
	addbtn.click();
}
}

