package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {
	
	@FindBy(xpath="//a[@class='nav-link dropdown-toggle waves-light text-white waves-effect']")
	private WebElement Accountclick;
	
	@FindBy(xpath="//a[.='Logout']")
	private WebElement lgout;
	
	
	public LogOutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setLogout() {
		Accountclick.click();
		lgout.click();
	}
	
	

}
