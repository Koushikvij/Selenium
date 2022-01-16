package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.PageUtilities;

public class Home {

	WebDriver driver;
	PageUtilities pageUtil;
	
	@FindBy(xpath="//div[@class='central-textlogo']//span") WebElement headerText;
	@FindBy(id="searchInput") WebElement searchText;
	@FindBy(xpath="//button[contains(@class,'primary') and @type='submit']") WebElement searchBtn;
	
	public Home(WebDriver driver)
	{
		this.driver=driver;
		pageUtil=new PageUtilities(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void verifyHomePage()
	{
		pageUtil.waitForVisible(headerText, 20);
	}
	
	public void emptySearch()
	{
		verifyHomePage();
		pageUtil.click(searchBtn);
	}
}
