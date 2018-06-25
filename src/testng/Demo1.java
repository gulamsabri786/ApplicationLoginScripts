package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo1 {
	@BeforeClass
	public void openApp()
	{
		Reporter.log("open app",true);
	}
	@AfterClass
	public void closeApp()
	{
		Reporter.log("close app",true);
	}
	@BeforeMethod
    public void login()
    {
		Reporter.log("login app",true);	
    }
	@AfterMethod
    public void logOut()
    {
		Reporter.log("logout app",true);	
    }
	
	@Test(priority=1,invocationCount=2)
	public void createUser()
	{
	Reporter.log(" creating a user ",true);	
	}
	
	@Test(priority=2,invocationCount=2)
	public void deleteUser()
	{
	Reporter.log(" creating a user",true);	
	}
}
