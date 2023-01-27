package genric;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import pom.LogOutPage;
import pom.LoginPage;

public class BaseClass {
	
	static {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "/Users/priyanka/eclipse-workspace/Inuvest/src/main/resources/driver/chromedriver");
	}
	public static	WebDriver driver;
	public FileLib f=new FileLib();

		@BeforeTest
		public void openBrowser() {
		Reporter.log("openBrowser",true);
		 driver=new ChromeDriver();
		WebDriverCommonLib w=new WebDriverCommonLib();
		w.waitForPageLoadImplicit(driver);
		}
		@AfterTest
		public void closeBrowser() {
			Reporter.log("closeBrowser",true);	
			driver.close();
		}
		@BeforeMethod
		public void login() throws IOException {
		Reporter.log("login",true);	
		FileLib f=new FileLib();
		String url = f.getPropertyData("url");
		String un = f.getPropertyData("email");
		String pw = f.getPropertyData("password");	
		driver.get(url);
		
		
		
		LoginPage l=new LoginPage(driver);
		l.setLogin(un, pw);
			
		}
		@AfterMethod
		public void logout() {
		Reporter.log("logout",true);	
		LogOutPage e=new LogOutPage(driver);
		e.setLogout();
		}
		
}
