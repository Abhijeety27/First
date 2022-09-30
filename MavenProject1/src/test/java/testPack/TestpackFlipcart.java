package testPack;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import flipcart.HomePage;
import flipcart.ProductPage;

public class TestpackFlipcart 
{
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\Velocity\\Selenium\\Webdriver Chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		
		HomePage homepage=new HomePage(driver);
		homepage.toMainPage();
		
		ProductPage productexecution =new ProductPage(driver);
		productexecution.phoneClick();
		
		ArrayList <String> switching= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(switching.get(1));
		
		driver.manage().window().maximize();
		
//		JavascriptExecutor js= (JavascriptExecutor)driver;
//		js.executeAsyncScript("window.scrollBy(0,4000)");
//		
//		Thread.sleep(3000);
		
		productexecution.cartClick();
		
		
	}
	

}
