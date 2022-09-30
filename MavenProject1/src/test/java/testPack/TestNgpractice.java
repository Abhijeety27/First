package testPack;


import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.basetestNG;
import flipcart.HomePage;
import flipcart.ProductPage;

public class TestNgpractice extends basetestNG{
	private WebDriver driver;
	private HomePage homepage;
	private ProductPage productexecution;

	
	@Parameters("browser")
	
	@BeforeTest
	public void beforeTest(String browserName)
	{
		System.out.println("browserName");
		
		if(browserName.equals("Chrome"))
		{
			driver=openchrome();
		}
		
		if(browserName.equals("Firefox")) {
			driver=openfirefox();
		}
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Before class");
		homepage=new HomePage(driver);
		productexecution =new ProductPage(driver);
	}
	
	@BeforeMethod
	public void beforemethod() throws InterruptedException
	{
		System.out.println("Before method");
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(5000);
		
		homepage.toMainPage();
		
		Thread.sleep(5000);

		productexecution.phoneClick();
		
		Thread.sleep(5000);
		
		ArrayList <String> switching= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(switching.get(1));
		
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		productexecution.cartClick();
	}
	
	@Test
	public void test()
	{
		System.out.println("test1");
	}
	
//	@Test
//	public void test2()
//	{
//		System.out.println("Test2");
//	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("After method");
	}

	
	@AfterClass
	public void afterclass()
	{
		System.out.println("After class");
		homepage=null;
		productexecution=null;
	}

	
	@AfterTest
	public void aftertest()
	{
		System.out.println("after test");
//		driver.quit();
		driver=null;
		System.gc();     //garbage collector
	}
	

}
