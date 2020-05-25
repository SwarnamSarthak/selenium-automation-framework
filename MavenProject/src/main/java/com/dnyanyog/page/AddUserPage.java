package com.dnyanyog.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.dnyanyog.common.WebDriverFactory;

public class AddUserPage {

	
	@FindBy(id="systemUser_userType")
	WebElement UserRole;
	
	@FindBy(id="systemUser_employeeName_empName")
	WebElement EmployeeName;
	
	@FindBy(id="systemUser_userName")
	WebElement Username;
	
	@FindBy(id="systemUser_status")
	WebElement Status;
	
	@FindBy(id="systemUser_password")
	WebElement Password;
	
	@FindBy(id="systemUser__csrf_token")
	WebElement ConfirmPassword;
	
	@FindBy(id="btnSave")
	WebElement Save;
	
	public AddUserPage()
	{
		PageFactory.initElements(WebDriverFactory.dr, this);
	}
	
	public void AddUser(int inttUserRole, String strEmployeeName, String strUsername, String strStatus, String strPassword, String strConfirmPassword)
	{
		Select Userroledropdown = new Select(UserRole);
		Userroledropdown.selectByIndex(inttUserRole);
		EmployeeName.sendKeys(strEmployeeName);	
		Username.sendKeys(strUsername);
		Select Statusdropdown = new Select(Status);
		Statusdropdown.selectByVisibleText(strStatus);
		Password.sendKeys(strPassword);
		ConfirmPassword.sendKeys(strConfirmPassword);
		Save.click();
			
		
	}
}
