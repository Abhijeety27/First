package instagramTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import instagramProject.LoginPage;
import junit.framework.Assert;

public class InstagramTestNg {
	private WebDriver driver;
	private LoginPage loginn;
	
	@BeforeClass
	public void beforeclass()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Selenium\\Webdriver Chromedriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void beforemethod() throws InterruptedException
	{
		 loginn=new LoginPage(driver);
		 loginn.userFill();
		 loginn.passFill();
		 loginn.clicklogin();
//		 Thread.sleep(3000);
//		 loginn.clicksignup();
	}
	
	@Test (priority=1)
	public void test()
	{
		System.out.println("test");
		Assert.assertEquals(loginn.enabled(), true);
//		String url=driver.getCurrentUrl();
//		Assert.assertEquals(url, "https://www.instagram.com/accounts/login/");
	}
	
	@Test (priority = 2)
	public void test2()
	{		
		System.out.println("test2");
		String title=driver.getTitle();

		System.out.println("test2");
		Assert.assertEquals(title, "Login • Instagram");

	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("After method");

	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("after class");
//		driver.quit();
	}
	
	
}
