package com.dnyanyog.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dnyanyog.common.WebDriverFactory;

public class AddEmployeePage {

	
	@FindBy(id="firstName")
	WebElement FirstName;
	
	@FindBy(id="middleName")
	WebElement MiddleName;
	

	@FindBy(id="lastName")
	WebElement LastName;
	

	@FindBy(id="employeeId")
	WebElement EmployeeID;
	

	@FindBy(id="btnSave")
	WebElement Save;
	
	public AddEmployeePage()
	{
		PageFactory.initElements(WebDriverFactory.dr, this);
	}

	public void AddEmployee(String strFirstName, String strMiddleName, String strLastName, Integer intEmployeeID)
	{
		FirstName.sendKeys(strFirstName);
		MiddleName.sendKeys(strMiddleName);
		LastName.sendKeys(strLastName);
		EmployeeID.equals(intEmployeeID);
		Save.click();
	}
}
