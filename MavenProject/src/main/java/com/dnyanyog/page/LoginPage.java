package com.dnyanyog.page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dnyanyog.common.WebDriverFactory;

public class LoginPage {

	@FindBy(id="txtUsername")
	WebElement userName;
	
	@FindBy(id="txtPassword")
	WebElement userPassword;
	
	@FindBy(id="btnLogin")
	WebElement loginButton;
	
	@FindBy(tagName="a")
	List<WebElement> links;
	
	public LoginPage printLinks()
	{
		for(WebElement link : links)
		{
			System.out.println("Link on page : " +link.getAttribute("href"));
		}
		
		return this;
	}
	
	
	//Constructor --> method and classname same ,no returntype
	public LoginPage()
	{
	PageFactory.initElements(WebDriverFactory.dr, this);
	}
	
	
	public HomePage login(String strUserName,String strPassword)
	{
		userName.sendKeys(strUserName);
		userPassword.sendKeys(strPassword); 
		loginButton.click();
		HomePage hp = new HomePage();
		return hp ;
	}
	
	public LoginPage navigateToLoginPage()
	{
		WebDriverFactory.dr.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		return this;
	}
	
}
