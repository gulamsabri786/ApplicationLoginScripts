package loginscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmezzonLogin {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();

	driver.get("https://www.amazon.in/ap/signin?openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&&openid.pape.max_auth_age=0");
driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sabrisait786@gmail.com");
driver.findElement(By.id("continue")).click();

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sabrisait");
driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
driver.findElement(By.id("signInSubmit")).click();

String tit=driver.getTitle();
System.out.println(tit);


if(tit.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"))
{
	System.out.println("Pass:home page iss displayed");
}
else
{
	System.out.println("fail:home page is not displayed");
}
}}
  



