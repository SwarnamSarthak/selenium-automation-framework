package com.dnyanyog.common;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class IInvokedMethodListenerImpl implements IInvokedMethodListener {

	@Override
	public void afterInvocation(IInvokedMethod arg0, ITestResult arg1) {
		// TODO Auto-generated method stub

		WebDriverFactory.dr.get().quit();

	}

	@Override
	public void beforeInvocation(IInvokedMethod arg0, ITestResult arg1) {
		// TODO Auto-generated method stub

		/*
		 * System.setProperty("webdriver.chrome.driver","\\C:\\Selenium\\chromedriver.exe"); 
		 * WebDriverFactory.dr.set(new ChromeDriver());
		 */
		try {

			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setBrowserName("chrome");
			capabilities.setVersion("83");
			capabilities.setPlatform(Platform.WINDOWS);
			WebDriver dr = new RemoteWebDriver(new URL("http://192.168.0.103:4444/wd/hub"), capabilities);
			WebDriverFactory.dr.set();
		} 
		
		
		catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}
}
