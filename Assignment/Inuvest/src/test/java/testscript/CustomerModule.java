package testscript;

import org.testng.annotations.Test;

import genric.BaseClass;
import pom.LoginPage;
import pom.SignupPage;

public class CustomerModule extends BaseClass {
	
@Test
 public void testCreateCustomer() {
  LoginPage n = new LoginPage(driver);
  n.loginClick().click();

 
  SignupPage s = new SignupPage(driver);
   s.SignUpClick().click();
 

}
}