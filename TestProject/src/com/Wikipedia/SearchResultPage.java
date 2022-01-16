package com.Wikipedia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage {
	
	WebDriver driver;
	@FindBy(xpath="//h1[contains(text(),'Search results')]") WebElement searchResultPageHeaderTxt;
	@FindBy(xpath="//div[@class='searchresults']//*[@class='mw-search-result']//a") WebElement searchResultLinks;
	
	public SearchResultPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifySearchResultPage()
	{
		return driver.findElement((By) searchResultPageHeaderTxt).isDisplayed();
	}

	public String getResultLinkText(int i)
	{	
		return driver.findElements((By) searchResultLinks).get(i).getText();
	}
}
