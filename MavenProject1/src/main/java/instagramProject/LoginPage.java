package instagramProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{				//Declaration
	@FindBy (xpath= "//input[@name='username']") 
	private WebElement user;
	@FindBy (xpath= "//input[@name='password']")
	private WebElement pass;
	@FindBy (xpath="//button[@class='sqdOP  L3NKy   y3zKF     ']")
	private WebElement login;
	
	       		//initialization
	public LoginPage(WebDriver driver123)
	{
		PageFactory.initElements(driver123, this);
	}
	
	public void submit(){
		user.sendKeys("abhijeet@instagram.com");
		pass.sendKeys("hsaghhasb");
		login.click();
	}
	
	
}
