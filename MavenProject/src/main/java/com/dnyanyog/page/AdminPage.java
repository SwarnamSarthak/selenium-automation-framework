package com.dnyanyog.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dnyanyog.common.WebDriverFactory;

public class AdminPage {
	
	
	
	@FindBy(id="btnAdd")
	WebElement Add;
	
	@FindBy(id="menu_pim_viewPimModule")
	WebElement PIM;
	
	public AdminPage()
	{
		PageFactory.initElements(WebDriverFactory.dr, this);
	}
	
	public AddUserPage navigateToAddUserPage()
	{
		
		Add.click();
		return new AddUserPage();
	}

	public AddEmployeePage navigateToAddEmployeePage()
	{
		PIM.click();
		Add.click();
		return new AddEmployeePage();
	}
}
