package loginscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CrafsvillaLogin {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.craftsvilla.com/");
	driver.findElement(By.xpath("//span[.='Sign In']")).click();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@id='emailId']")).sendKeys("sabrisait786@gmil.com");
	driver.findElement(By.xpath("//div[.='CONTINUE']")).click();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sabrisait");
	
	driver.findElement(By.xpath("//div[@id='loginCheck']")).click();
	String title=driver.getTitle();
	System.out.println(title);

	 if(title.equals("Ethnic Wear - Buy Ethnic Wear in Latest Designs Online at Craftsvilla"))
		{
				System.out.println("Pass:home page is displayed");
		}
			else
		{
				System.out.println("home page is not displayed");		
				
		}
	 
		driver.close();
			
			
}

}
