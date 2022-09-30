package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class basetestNG {

	public static WebDriver openchrome() 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Velocity\\Selenium\\Webdriver Chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		return driver;
	}
	
	public static WebDriver openfirefox()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Velocity\\Selenium\\Firefox driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();

		return driver;
	}
}
