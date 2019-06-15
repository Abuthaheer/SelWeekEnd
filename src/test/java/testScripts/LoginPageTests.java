package testScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.LoginPageObject;

public class LoginPageTests {
	
	
	LoginPageObject lg;
	
	public LoginPageTests() {
		lg = new LoginPageObject();
	}
	
	
	@Test
	public void verifyUserName(){
		lg.setTxtUserName("Admin");
		String value = lg.getEnteredUserName();
		Assert.assertTrue(value.equals("Admin"), "Failed: Login Failed");
		
	}

}
