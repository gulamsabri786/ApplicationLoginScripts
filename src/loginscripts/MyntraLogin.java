package loginscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraLogin {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.myntra.com/login?referer=https://www.myntra.com/");
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sabrisait786@gmail.com");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sabrisait");
	driver.findElement(By.xpath("//button[.='Log in']")).click();
	String t=driver.getTitle();
	System.out.println(t);
	if(t.equals("Login"))
	{
		System.out.println("Pass:Hompe page is displayed");
	}
	else
	{
		System.out.println("Fail:Hompe page is  not displayed");
	}
	driver.close();
}
}

