 package practice;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		//driver.get("https://www.flipkart.com/");
		
		driver.navigate().to("http://www.flipkaarrt.com/");
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();

	}

}

