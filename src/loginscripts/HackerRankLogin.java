package loginscripts;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
	

public class HackerRankLogin {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hackerrank.com/dashboard");
		driver.findElement(By.xpath("//button[@class='login pull-right btn btn-dark btn-default mmT']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sabrisait786@gmail.com");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sabrisait");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String title=driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Dashboard | HackerRank"))
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

