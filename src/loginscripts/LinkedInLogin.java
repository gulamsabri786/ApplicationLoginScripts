package loginscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedInLogin {
	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.linkedin.com/uas/login");
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sabrisait786@gmail.com");
            driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sabrisait786");
            driver.findElement(By.xpath("//input[@type='submit']")).click();
         String   tit=driver.getTitle();
         System.out.println(tit);
         if(tit.equals("LinkedIn"))
 		{
 				System.out.println("Pass:home page is displayed");
 		}
 			else
 		{
 				System.out.println("home page is not displayed");		}
 			
		
		
		
		
		}

}
