package testPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import instagramProject.LoginPage;

public class TestPackInstagram {
 public static void main(String[] args) 
 {
	System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Selenium\\Webdriver Chromedriver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.instagram.com/accounts/login/");
	
	LoginPage next=new LoginPage(driver);
	next.submit();
	
}
}
