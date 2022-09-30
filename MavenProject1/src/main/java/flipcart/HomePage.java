package flipcart;

import org.apache.batik.apps.rasterizer.Main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
		//Declaration
	@FindBy (xpath="//button[@class='_2KpZ6l _2doB4z']") 
	private WebElement cancel;
	
	@FindBy (xpath="//input[@class='_3704LK']") 
	private WebElement search;
	
	@FindBy (xpath="//button[@class='L0Z3Pu']")
	private WebElement submit;
	
	//Initilization
	public HomePage(WebDriver driver123) {
		PageFactory.initElements(driver123,this);
	}
	
	
//	public void cancelbutton() {
//		cancel.click();
//	}
//	
//    
//	
//	public void searchwindow() {
//		search.sendKeys("iphone 12");
//	}
//	
//	
//	public void submitclick() {
//		submit.click();
//	}
						
					//or
public void toMainPage() {
	cancel.click();
	search.sendKeys("iphone 12");
	submit.click();

	}


	


	
	
	
}
