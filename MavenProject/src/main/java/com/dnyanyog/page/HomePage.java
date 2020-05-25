package com.dnyanyog.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.dnyanyog.common.WebDriverFactory;

public class HomePage {
	
	@FindBy(id="welcome")
	WebElement welcomeText;
	
	@FindBy(id="menu_admin_viewAdminModule")
	WebElement Admin;
	
	public HomePage()
	
	{
		PageFactory.initElements(WebDriverFactory.dr , this);
	}

	public HomePage verifyWelcomeText(String expectedWelcomeText)
	{
		Assert.assertEquals(welcomeText.getText(), expectedWelcomeText);
		return this;
		
	}
	
	public AdminPage navigateToAdminPage()
	{
		Admin.click();
		return new AdminPage();
	}
	
}


