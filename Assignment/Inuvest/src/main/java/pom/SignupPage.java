package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {
	
	//https://inuvest.tech/auth/signup
	
	@FindBy(xpath="//strong[.='Sign up']")
	private WebElement SignUpOption;
	
	@FindBy(xpath="//input[@placeholder='First Name']")
    private WebElement firstname;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	private WebElement lastname;
	
	@FindBy(xpath="//input[@placeholder='Mobile']")
	private WebElement mobile;
	
	@FindBy(xpath="(//input[@placeholder='Email'])[1]")
	private WebElement email;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement password;
	
	@FindBy(xpath="//button[.='Sign Up']")
	private WebElement signup;
	
	public SignupPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setSignUp(String fn , String ln , String mo , String em , String pd ) {
		
		firstname.sendKeys(fn);
		lastname.sendKeys(ln);
		mobile.sendKeys(mo);
		email.sendKeys(em);
		password.sendKeys(pd);
		signup.click();
		
			
	}
	
	public WebElement SignUpClick()
	{
		return SignUpOption;
	}
}
