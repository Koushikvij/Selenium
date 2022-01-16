package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.PageUtilities;

public class SearchResult {

	WebDriver driver;
	PageUtilities pageUtil;
	
	@FindBy(id="firstHeading") public WebElement searchResultHeader;
	@FindBy(xpath="//*[@id='searchText']//input") public WebElement searchTextValue;
	
	public SearchResult(WebDriver driver)
	{
		this.driver=driver;
		pageUtil=new PageUtilities(driver);
		PageFactory.initElements(driver, this);
	}
	

	/*
	 * @author: Koushik
	 * @purpose: Method to valid whether the search text matches 
	 * @arguments: searchText
	 * @created on: 9/11/2020
	 */
	public void verifySearchText(String searchTxt)
	{
		pageUtil.waitTillVisible(searchResultHeader, 10);
		String actualText=searchTextValue.getAttribute("value");
		if(actualText.trim().equalsIgnoreCase(searchTxt.trim()))
		{
			System.out.println("Search Text: "+searchTxt+" is displayed on the Search Results page");
		}
		else
		{
			System.out.println("Search Text: "+searchTxt+" is NOT displayed on the Search Results page");			
		}
	}
}
