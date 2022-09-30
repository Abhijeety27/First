package starHealth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page4 {
	private WebDriver driver;
@FindBy (xpath="(//input[@name='payment_mode'])[2]")private WebElement button;

public Page4(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}


public boolean buttoncheck() {
	boolean x=button.isSelected();
	return x;
}

}
