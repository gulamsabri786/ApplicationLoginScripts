package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHubLoginPage {
	
	@FindBy(xpath="//input[@type='text']")       //declaration
    private WebElement unTB;
	
	@FindBy(xpath="//input[@type='password']")   //declaration
    private WebElement pwTB;
	
	@FindBy(xpath="//input[@type='submit']")     //declaration
    private WebElement login;
	
	public GitHubLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);  //initialization
	}
	
	public void setUserName(String un)           //utilization
	{
		unTB.sendKeys(un);
	}
   
	public void setPassword(String pw)           //utilization
	{
		pwTB.sendKeys(pw);
	}
	public void login()                  //utilization
	{
		login.click();
	}

	
		
	}
