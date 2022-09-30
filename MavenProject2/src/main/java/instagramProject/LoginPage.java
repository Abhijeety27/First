package instagramProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy (xpath="//input[@name='username']")
	private WebElement user;
	
	@FindBy (xpath="//input[@name='password']")
	private WebElement pass;
	
	@FindBy (xpath="//button[@class='sqdOP  L3NKy   y3zKF     ']")
	private WebElement loginbutton;
	
	@FindBy (xpath="//span[text()='Sign up']")
	private WebElement signup;
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void userFill()
	{
		user.sendKeys("abhijeet@instagram.com");
	}
	
	public void passFill()
	{
		pass.sendKeys("hsaghhasb");
	}
	
	public boolean enabled() {
		Boolean a=loginbutton.isEnabled();
		return a;
	}
	
	public void clicklogin() {
		loginbutton.click();
	}
	
	public void clicksignup() {
		signup.click();
	}
	
	

}
