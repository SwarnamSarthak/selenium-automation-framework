package com.dnyanyog.test;

import org.testng.annotations.Test;

import com.dnyanyog.common.BaseTest;
import com.dnyanyog.page.LoginPage;

public class AddEmployee extends BaseTest {

	@Test
	public void addEmployee()
	{
		
		LoginPage lp = new LoginPage();
		lp.navigateToLoginPage()
			.login("Admin", "admin123")
				.verifyWelcomeText("Welcome Admin")	
					.navigateToAdminPage()
						.navigateToAddEmployeePage()
							.AddEmployee("Rahul", "Kumar", "Shaha", 1234);	
				
	}
}
