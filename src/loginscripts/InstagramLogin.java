package loginscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("sabrisait786@gmail.com");
driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sabrisaitsmd");
driver.findElement(By.xpath("//button[text()='Log in']")).click();
	String tit=driver.getTitle();
	System.out.println(tit);
		if(tit.equals("Login • Instagram"))
		{
				System.out.println("Pass:home page is displayed");
		}
			else
		{
				System.out.println("home page is not displayed");		}
			
		driver.close();
}
}

