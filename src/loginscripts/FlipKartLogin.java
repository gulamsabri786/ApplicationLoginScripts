
package loginscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartLogin {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@class='_2zrpKA']")).sendKeys("sabrisait786@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sabrisait");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		String titl=driver.getTitle();
		System.out.println(titl);
	    String url	=driver.getCurrentUrl();
	    System.out.println(url);
	    if(titl.equals("Online Shopping Site for Mobiles, Fashion, Books, Electronics, Home Appliances and More"))
	    {
	    	System.out.println("Pass:Home page is displayed");
	    }
	    else
	    {
	    	System.out.println("Fail:Home page is not displayed");
	    }
	    driver.close();
	}

}

