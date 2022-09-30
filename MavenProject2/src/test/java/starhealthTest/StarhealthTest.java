package starhealthTest;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import baseForstarhealth.Base;
import junit.framework.Assert;
import starHealth.Page1;
import starHealth.Page2;
import starHealth.Page3;
import starHealth.Page4;
import utils.Utility;

public class StarhealthTest extends Utility{
	private WebDriver driver;
	private Page1 firstpage;
	private Page2 secondPage;
	private Page3 thirdPage;
	private Page4 buttontest;
	boolean d;
	private String testname;
	private Date time=Calendar.getInstance().getTime();
	
	@Parameters("browser")
	@BeforeTest
	public void openbrowser(String browserName) {
		
		System.out.println("Browsername");
		
			if(browserName.equals("Chrome"))
			{
				 System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Selenium\\Webdriver Chromedriver\\chromedriver_win32\\chromedriver.exe");
					driver=new ChromeDriver();
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			}
			
			if(browserName.equals("Firefox"))
			{
				 System.setProperty("webdriver.gecko.driver", "D:\\Velocity\\Selenium\\Firefox driver\\geckodriver.exe");
					driver=new FirefoxDriver();
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			}
//			driver.manage().window().maximize();
	    }
	
	@BeforeClass
	public void objectsofPom(){
				 firstpage=new Page1(driver);
				 secondPage=new Page2(driver);
				 thirdPage=new Page3(driver);
				 buttontest=new Page4(driver);
	}
	
	@BeforeMethod
	public void callmethod() throws InterruptedException, EncryptedDocumentException, IOException
	{
		this.d=d;
		
		driver.get("https://www.starhealth.in/");

		String user=fetchdata("Sheet1",3,0);
		firstpage.username(user);
		
		firstpage.firstPage();
		Thread.sleep(3000);
		
		String username2 ="Abhijeet yadav";
		secondPage.sendname(username2);
		secondPage.info();
		Thread.sleep(3000);
		
		d=secondPage.ischeched();
		
		secondPage.nextpage();
		Thread.sleep(3000);
		
		thirdPage.birthdate();
		Thread.sleep(5000);
		
	
		thirdPage.birthdate2();
		Thread.sleep(3000);
		
		thirdPage.birthdate3();
		Thread.sleep(3000);
		
		thirdPage.selectterm();
		
		Thread.sleep(3000);
		thirdPage.nextpage();
	}
	
	@Test
	public void chechbox()
	{
		this.testname=testname;
		testname="125";
		this.d=d;
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(d, false);
		soft.assertAll();
	}
	
	@Test
	public void buttoncheck1() {
		this.testname=testname;
		testname="123";
		boolean y=buttontest.buttoncheck();
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(y, true);
		soft.assertAll();
		
	}
	
	@AfterMethod
	public void aftermethod(ITestResult result) throws IOException, InterruptedException
	{
		if(ITestResult.FAILURE==result.getStatus()) {
			Thread.sleep(3000);
			this.driver=driver;
			this.testname=testname;
			capturescreenshot(driver,testname);
		}
	
	}
	
	
	@AfterClass
	public void afterclass() {
		 firstpage=null;
		 secondPage=null;
		 thirdPage=null;
		 buttontest=null; 
	}
	
	@AfterTest
	public void afterTest()
	{
		driver.quit();
		driver=null;
		System.gc();
	}
	
}
