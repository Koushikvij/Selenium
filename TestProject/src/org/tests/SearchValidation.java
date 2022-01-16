package org.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.utilities.*;
import org.pages.*;

public class SearchValidation {
	
	public static void main(String args[])
	{
		WebDriver driver;
		
		//Initiating the driver
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver=new ChromeDriver();		
		driver.manage().window().maximize();
		
		//Initiating the page variables
		Home homePage=new Home(driver);
		SearchResult searchResultPage=new SearchResult(driver);
		
		//test data
		String searchText="Father of OKRs";
		
		//code to search for the string
		driver.get("http://www.wikipedia.org");
		homePage.verifyHomePage();
		homePage.searchText(searchText);
		searchResultPage.verifySearchText(searchText);
		
		//close driver
		driver.quit();
	}
}
