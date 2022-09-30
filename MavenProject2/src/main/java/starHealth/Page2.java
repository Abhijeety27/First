package starHealth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page2 {
	private WebDriver driver;
	
	@FindBy (xpath="//input[@id='name']") private WebElement name;
	@FindBy (xpath="//input[@id='mobile']") private WebElement mob;
	@FindBy (xpath="//input[@id='email']") private WebElement email;
	@FindBy (xpath="//input[@id='dndConsent']") private WebElement checked;
	@FindBy (xpath="//span[text()='Next']") private WebElement next1;
	
	public Page2(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver,this);
		
	}
	
	
	
	public void sendname(String username2) {
		name.sendKeys(username2);
	}
	
	public void info() {
		mob.sendKeys("9699198181");
		email.sendKeys("abhijeety@gmail.com");
	}
	
	
	public boolean ischeched() {
		boolean c=checked.isSelected();
		return c;
	}
	
	public void nextpage()
	{
		next1.click();
	}
}
