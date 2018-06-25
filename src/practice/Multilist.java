package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multilist {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Ahamed/Desktop/single.html");
		WebElement ele=driver.findElement(By.id("bbbc"));
		Select s=new Select(ele);
		 if(s.isMultiple())
			 System.out.println("It is a multi list box");
		 else
			 System.out.println("It is single list  box");
		 
		 s.selectByIndex(1);
		 s.selectByValue("2");
		
		 s.selectByVisibleText("monty");
//		 s.deselectByIndex(3);
//		 s.deselectByValue("2");
//		 s.deselectByVisibleText("monty");
		 WebElement n = s.getFirstSelectedOption();
		 System.out.println(n.getText());
		List<WebElement> a = s.getAllSelectedOptions();
		System.out.println(",,,,,,,,,,,,,,,");
		for(WebElement e:a)
		{
			String text = e.getText();
			System.out.println(text);
			
		}
		System.out.println("................");
		List<WebElement> option = s.getOptions();
		for(WebElement e:option)
		{
			String b = e.getText();
			System.out.println(b);
		}
//		 s.deselectAll();
		 
	}

}

