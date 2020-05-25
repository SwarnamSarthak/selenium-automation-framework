package com.dnyanyog.test;

import org.testng.annotations.Test;

import com.dnyanyog.common.BaseTest;
import com.dnyanyog.page.LoginPage;

public class AddUser extends BaseTest {
	
	@Test
	public void addUser()
	
	{
		LoginPage lp = new LoginPage();
		lp.navigateToLoginPage()
			.login("Admin", "Admin123")
				.verifyWelcomeText("Welcome Admin")
					.navigateToAdminPage()
						.navigateToAddUserPage()
							.AddUser(0, "Swarnam", "Swarnam","Disabled","A@123456", "A@123456");
		
		
	}

	
	
}
