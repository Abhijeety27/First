package flipcart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	
	@FindBy (xpath="(//div[@class='_4rR01T'])[1]") private WebElement phone;
	
	
	@FindBy (xpath="//button[@class='_2KpZ6l _2U9uOA _3v1-ww']") private WebElement cart;
	
	public ProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void phoneClick() {
		phone.click();
	}
	
	public void cartClick()
	{
		cart.click();
	}

}
