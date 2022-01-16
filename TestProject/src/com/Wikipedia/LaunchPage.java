package com.Wikipedia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LaunchPage {
	
	WebDriver driver;
	@FindBy(xpath="//*[@class=\"central-textlogo-wrapper\"]//div[contains(text(),'Wikipedia'") public WebElement homePageText;
	
	public LaunchPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getHomePageLogoText()
	{
		System.out.println(homePageText.getText());
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(homePageText));
		return homePageText.getText();
	}
}
