
package loginscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CodingBatLogin {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://codingbat.com/java");
		driver.findElement(By.name("uname")).sendKeys("sabrisait786@gmail.com");
		driver.findElement(By.name("pw")).sendKeys("sabrisait");
		driver.findElement(By.name("dologin")).click();
	    String tit=	driver.getTitle();
	    System.out.println(tit);
	    if(tit.equals("CodingBat Java"))
		{
				System.out.println("Pass:home page is displayed");
		}
			else
		{
				System.out.println("home page is not displayed");		}
	 driver.close();
		
		
		
		
	}

}

