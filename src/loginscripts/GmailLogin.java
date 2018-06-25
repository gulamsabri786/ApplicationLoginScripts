package loginscripts;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailLogin {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, 15);
		driver.get("http://www.gmail.com");
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sabrisait786@gmail.com");
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
	
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sssssssss");
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	String tit=driver.getTitle();
	System.out.println(tit);
	if(tit.equals("Gmail"))
	{
			System.out.println("Pass:home page is displayed");
	}
		else
	{
			System.out.println("home page is not displayed");		}
		
	}

}

