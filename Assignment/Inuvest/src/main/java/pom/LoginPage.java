package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath="//a[.=' Log in '] ")
	private WebElement loginOption;

	@FindBy(xpath="//input[@placeholder='Email'])[1]")
	private  WebElement untbx;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement pwtbx;
	
	@FindBy(xpath="//button[.=' Login ']")
	private WebElement lgBtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setLogin(String un,String pw) {
		
		untbx.sendKeys(un);
		pwtbx.sendKeys(pw);
		lgBtn.click();
	}

	public WebElement loginClick(){
		return loginOption;
	}

}
