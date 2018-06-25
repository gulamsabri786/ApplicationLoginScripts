package loginscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HackerEarthLogin {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hackerearth.com/challenges/");
		driver.findElement(By.xpath("//a[.='LOGIN']")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.id("id_login")).sendKeys("sabrisait786@gmail.com");
		driver.findElement(By.id("id_password")).sendKeys("sabrisait");
		driver.findElement(By.xpath("//input[@class='button btn-blue fontawesome btn-largest weight-600 large']")).click();
		String title=driver.getTitle();
		System.out.println(title);
	
	if(title.equals("Hackathons, Programming & Coding Challenges in Jun 2018 | HackerEarth"))
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

