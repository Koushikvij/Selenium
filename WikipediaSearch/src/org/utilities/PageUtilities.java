package org.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageUtilities {

	WebDriver driver;
	
	public PageUtilities(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void waitForVisible(WebElement element, int timeOut)
	{
		WebDriverWait wait=new WebDriverWait(driver,timeOut);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		if(!element.isDisplayed())
		{
			System.out.println("Element is not displayed on the page");
		}
	}
	
	public void click(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		if(element.isDisplayed())
		{
			scrollIntoView(element);
			element.click();
		}
		else
		{		
			System.out.println("Element is not displayed on the page");
		}
	}
	
	public void scrollIntoView(WebElement element)
	{
		Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();
		
	}
}
