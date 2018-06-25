package loginscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TechGigLogin {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techgig.com/register.php?tab=login");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("sabrisait786@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("sabrisait");
		driver.findElement(By.xpath("//input[@id=\"button_login\"]")).click();
		 String tit=driver.getTitle();
		 System.out.println(tit);
		 if(tit.equals("Techgig.com : My Homepage"))
	 		{
	 				System.out.println("Pass:home page is displayed");
	 		}
	 			else
	 		{
	 				System.out.println("home page is not displayed");		}
		 driver.close();
	 			
	}

}
