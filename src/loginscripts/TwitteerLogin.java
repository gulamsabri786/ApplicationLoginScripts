
package loginscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwitteerLogin {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://twitter.com/login");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("sabrisait786@gmail.com");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("sabrisait");
		driver.findElement(By.xpath("(//button[@type='submit'])")).click();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
	String tit=	driver.getTitle();
	System.out.println(tit);
//	 if(tit.equals("CodingBat Java"))
//		{
//				System.out.println("Pass:home page is displayed");
//		}
//			else
//		{
//				System.out.println("home page is not displayed");		
	
 //driver.close();
		
	}
}

