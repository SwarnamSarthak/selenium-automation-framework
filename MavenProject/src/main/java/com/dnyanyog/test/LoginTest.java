package com.dnyanyog.test;

import org.testng.annotations.Test;

import com.dnyanyog.common.BaseTest;
import com.dnyanyog.page.LoginPage;

public class LoginTest extends BaseTest {
	
	
	@Test(dataProvider="csvData")
	public void verifyAdminLoginSuccessful(String username, String password)
	{
		LoginPage lp = new LoginPage();
		lp.navigateToLoginPage()
		.printLinks()
			.login(username,password)
				.verifyWelcomeText("Welcome Admin");
		
		
	}
	
}
	
	

