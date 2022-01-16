package com.Wikipedia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//button[@class='pure-button pure-button-primary-progressive' and @type='submit'] | //button[@type='submit']//*[contains(text(),'Search')]") WebElement searchButton;
	@FindBy(xpath="//*[contains(@class,'mw-advancedSearch-expandablePane-button') and @aria-controls='mw-advancedSearch-expandable-options']//*[contains(@class,'indicator-down')]") WebElement advancedSearchDropDown;
	@FindBy(xpath="//div[@id='advancedSearchField-phrase']//input")WebElement exactlyThisText;
	
	
	public SearchPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickSearchButton()
	{
		driver.findElement((By) searchButton).click();
	}
	
	public void clickAdvancedSearchDropDown()
	{
		driver.findElement((By) advancedSearchDropDown).click();
	}
	
	public void enterExactlyThisTextandSearch(String text)
	{
		driver.findElement((By) exactlyThisText).sendKeys(text);
		driver.findElement((By) searchButton).click();
	}
}
