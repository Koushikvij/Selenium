package org.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.PageUtilities;

public class Search {
	
	WebDriver driver;
	PageUtilities pageUtil;
	
	@FindBy(id="firstHeading") WebElement searchHeaderText;
	@FindBy(xpath="//button[@type='submit']//span[contains(text(),'Search')]") WebElement searchBtn;
	@FindBy(xpath="//a[contains(@aria-controls,'advancedSearch-expandable-options')]//span[contains(@class,'down')]") WebElement expandAdvSearchOptions;
	@FindBy(xpath="//div[@class='oo-ui-fieldsetLayout-group']//div[@id='advancedSearchField-phrase']//input") WebElement exactlyThisText;
	@FindBy(xpath="//div[@class='mw-advancedSearch-fieldContainer']//label") List<WebElement> searchField;
	
	public Search(WebDriver driver)
	{
		this.driver=driver;
		pageUtil=new PageUtilities(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void verifySearchPage()
	{
		pageUtil.waitForVisible(searchHeaderText, 20);
		String searchPageText=searchHeaderText.getText().trim();
		if(searchPageText.equalsIgnoreCase("search"))
		{
			System.out.println("Search Page is displayed");
		}
		else
		{
			System.out.println("Search Page is NOT displayed");
		}
	}
	
	public void expandAdvancedSearchOptions()
	{
		pageUtil.waitForVisible(expandAdvSearchOptions, 20);
		pageUtil.click(expandAdvSearchOptions);
	}
	
	public void searchExactText(String searchFieldText,String text)
	{
		int i;

		pageUtil.waitForVisible(searchField.get(0), 20);
		
		for(i=0;i<searchField.size();i++)
		{
			String fieldText=searchField.get(i).getText().trim();
			if(fieldText.equalsIgnoreCase(searchFieldText.trim()))
			{
				break;
			}
		}
		
		pageUtil.click(searchField.get(i));
		searchField.get(i).sendKeys(text);
		pageUtil.click(searchBtn);
	}	
}
