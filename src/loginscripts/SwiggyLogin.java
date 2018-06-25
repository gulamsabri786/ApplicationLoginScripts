package loginscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwiggyLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		driver.findElement(By.xpath("//a[.='Login']")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("7899476967");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sabrisait");
		driver.findElement(By.xpath("//a[@class='a-ayg']")).click();
		String tit=driver.getTitle();
		System.out.println(tit);
		 if(tit.equals("Order food online from India's best food delivery service. Order from restaurants near you"))
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

