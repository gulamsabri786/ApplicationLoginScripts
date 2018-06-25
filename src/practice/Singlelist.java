package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Singlelist {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Ahamed/Desktop/single.html");
		WebElement ele=driver.findElement(By.id("bc"));
		Select s=new Select(ele);
		 if(s.isMultiple())
			 System.out.println("It is a multi list box");
		 else
			 System.out.println("It is single list  box");
		
		s.selectByIndex(2);
//		s.selectByValue("3");
//		s.selectByVisibleText("arsh");

}
}
