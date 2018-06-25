package loginscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestspotLogin {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://testpot.com/");
		driver.findElement(By.xpath("//a[.='Login / Register ']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='login_email']")).sendKeys("sabrisait786@gmail.com");
		driver.findElement(By.xpath("//input[@id='login_password']")).sendKeys("sabrisait");
		driver.findElement(By.xpath("//button[@id='login_btn']")).click();
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("Testpot.com | Free Mock Tests Online Tests and more..."))
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

