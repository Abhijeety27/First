package starhealthTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import starHealth.Page1;
import starHealth.Page2;
import starHealth.Page3;

public class starpractice {
	private WebDriver driver;
	private Page1 firstpage;
	private Page2 secondPage;
	private Page3 thirdPage;
	private boolean d;
	
	@BeforeClass
	public void beforeclass() {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Selenium\\Webdriver Chromedriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.starhealth.in/");
		
		
	}
	
	@BeforeMethod
	public void beforetest() throws InterruptedException
	{
		this.d=d;
		 firstpage=new Page1(driver);
		 firstpage.firstPage();
		 
		 Thread.sleep(5000);
		 
		 secondPage=new Page2(driver);
			secondPage.info();
			
			boolean d=secondPage.ischeched();
			
			secondPage.nextpage();
			
			Thread.sleep(5000);
		 
		 thirdPage=new Page3(driver);
			thirdPage.birthdate();
			Thread.sleep(3000);

			thirdPage.birthdate2();
			Thread.sleep(5000);
			
			thirdPage.birthdate3();
			Thread.sleep(5000);
			
			thirdPage.selectterm();
			Thread.sleep(3000);
			
			thirdPage.nextpage();
		 
	}
	
	@Test
	public void test()
	{
		this.d=d;
		System.out.println("test");
		Assert.assertEquals(d, false);
	}
	
	
	
}
