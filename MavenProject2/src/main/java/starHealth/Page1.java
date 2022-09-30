package starHealth;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Page1 {
	
	private WebDriver driver;
	
	@FindBy (xpath="//b[text()='Close']") private WebElement close;
	@FindBy (xpath="(//input[@aria-label='customName'])[6]") private WebElement name;
	@FindBy (xpath="(//div[@id='select-insurancetype'])[6]") private WebElement insure;
	@FindBy (xpath="//LI[text()='My Family']") private WebElement family;
	@FindBy (xpath="(//span[text()=' Buy Now'])[6]") private WebElement submit;

	public Page1(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver, this);
	}
	
	public void username(String user) {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(name));
		name.sendKeys(user);
	}
	
	public void firstPage()
	{
		this.driver=driver;
//		WebDriverWait wait=new WebDriverWait(driver, 15);
//		wait.until(ExpectedConditions.visibilityOf(close));
//		close.click();
		
//		name.sendKeys("Abhijeet yadav");
		
		Actions act=new Actions(driver);
		act.moveToElement(insure).click().build().perform();
		
		family.click();
		submit.click();
		
	}
	
	
}
