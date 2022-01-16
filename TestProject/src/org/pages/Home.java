package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.PageUtilities;

public class Home {

	WebDriver driver;
	PageUtilities pageUtil;
	
	@FindBy(xpath="//*[@class='central-textlogo']//h1//span") public WebElement headerText;
	@FindBy(id="searchInput") public WebElement searchBox;
	@FindBy(xpath="//button[@type='submit']") public WebElement searchBtn;
	
	public Home(WebDriver driver)
	{
		this.driver=driver;
		pageUtil=new PageUtilities(driver);
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * @author: Koushik
	 * @purpose: Method to verify whether the homepage is loaded
	 * @arguments: None
	 * @created on: 9/11/2020
	 */
	public void verifyHomePage()
	{
		pageUtil.waitTillVisible(headerText, 20);
		if(searchBox.isDisplayed())
		{
			System.out.println("Home Page is displayed");
		}
		else
		{
			System.out.println("Home Page is not displayed");
		}
	}
	
	/*
	 * @author: Koushik
	 * @purpose: Method to search for new text string
	 * @arguments: text
	 * @created on: 9/11/2020
	 */
	public void searchText(String text)
	{
		pageUtil.waitTillVisible(headerText,10);
		if(text!= null)
		{
			pageUtil.click(searchBox);
			searchBox.sendKeys(text);
			pageUtil.click(searchBtn);
		}
		else
		{
			System.out.println("Search Text is empty");
		}		
	}	
}
