package script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.GitHubLoginPage;

public class LoginTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://github.com/login");
		GitHubLoginPage g=new GitHubLoginPage(driver);
		g.setUserName("sabrisait786@gmail.com");
		g.setPassword("sabrisait786");
		g.login();
	}

}
