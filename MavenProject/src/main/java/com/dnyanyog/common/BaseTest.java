package com.dnyanyog.common;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;

@Listeners(IInvokedMethodListenerImpl.class)
public class BaseTest {

	@DataProvider(name = "excelData")
	public String[][] getExcelData() throws Exception {
		String fileName = "C:\\Users\\jsamdus\\Desktop\\Selenium_Workspace\\selenium-automation-framework\\src\\main\\java\\com\\homework13may2020\\test\\LoginTest.xlsx";
		return ExcelReader.getExcelTableArray(fileName, "verifyAdminLogin");
	}

	
	@DataProvider(name = "loginData")
	public String[][] getLoginData()

	{

		String data[][] = {

				{ "Admin", "Admin123" }, { "Swarnam", "Swarnam123" }, { "Vats", "Vats123" } };

		return data;
	}

	
	@DataProvider(name = "csvData")
	public String[][] getCSVData() throws IOException

	{

		String csvFile = "C:\\Selenium\\CSVData.csv";
		BufferedReader br = null;
		String line = "";
		String csvSplitBy = ",";

		String data[][] = new String[3][2];
		br = new BufferedReader(new FileReader(csvFile));
		int i = 0;
		while ((line = br.readLine()) != null) {

			// use comma as separator
			String[] loginDataLine = line.split(csvSplitBy);
			System.out.println(line);
			data[i] = loginDataLine;
			i = i + 1;

		}

		return data;

	}

	/* public WebDriver dr; */ /* Global Variable --> Global Scope */

	/*
	 * @BeforeTest public void beforeEveryTestMethod()
	 * 
	 * /*{
	 * 
	 * System.setProperty("webdriver.chrome.driver",
	 * "\\C:\\Selenium\\chromedriver.exe"); dr = new ChromeDriver(); WebDriver
	 * driver = new ChromeDriver(); --> Local Variable* --> Local Scope }
	 */

	/*
	 * @AfterTest public void afterEveryTestMethod()
	 * 
	 * {
	 * 
	 * dr.quit(); }
	 */

}
