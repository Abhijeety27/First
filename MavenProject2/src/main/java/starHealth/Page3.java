package starHealth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page3 {
	private WebDriver driver;
	@FindBy (xpath="//input[@name='dob']") private WebElement dob;
	@FindBy (xpath="//th[text()='June 2022']") private WebElement year1;
	@FindBy (xpath="//th[text()='2022']") private WebElement year2;

	@FindBy (xpath="(//div//table//span)[1]") private WebElement back;
	@FindBy (xpath="//td[text()='1996']") private WebElement birthyear;
	@FindBy (xpath="//td[@data-value='4']") private WebElement birthmonth;
	@FindBy (xpath="//td[text()='27']") private WebElement birthday;
	@FindBy (xpath="//div[@id='select-year']") private WebElement term;
	@FindBy (xpath="//li[@data-value='2']") private WebElement no;
	@FindBy (xpath="//span[text()='Next']") private WebElement next;
	
	public Page3(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver, this);
	}

	public void birthdate() {
		dob.click();
		year1.click();
		year2.click();

			
	}
	

//	
	public void birthdate2() {
		back.click();		
		back.click();
		back.click();
	}
	
	
	public void birthdate3() {
		birthyear.click();
		birthmonth.click();
		birthday.click();
	}
	
	public void selectterm() {
		term.click();
		no.click();
	}
	
	public void nextpage() {
		next.click();
	}
	
	
	
	
}
