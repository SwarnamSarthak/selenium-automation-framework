package com.dnyanyog.common;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementList {

	public static void main(String args[])
	{
		
	//DataType variableName = value
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("https://opensource-demo.orangehrmlive.com/");
	List<WebElement> links = dr.findElements(By.tagName("a"));
	for(WebElement link : links)
	{
	
		
		System.out.println("Link on page : " +link.getAttribute("href"));
	}
	
	}
	
}
