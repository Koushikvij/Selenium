package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Wikipedia.LaunchPage;
import com.Wikipedia.SearchPage;
import com.Wikipedia.SearchResultPage;

public class WikiSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait( 2, TimeUnit.SECONDS);
		driver.get("http://wikipedia.org");		
		
		
		//Validating the home page of the web page
		LaunchPage laun=new LaunchPage(driver);
		String homePageText=laun.getHomePageLogoText();
		if(homePageText.trim().toLowerCase().contains("wikipedia"))
		{
			System.out.println("Page loaded successfully");
		}
		
		//Search with empty text
		SearchPage search=new SearchPage(driver);
		search.clickSearchButton();
		
		//Click on Advanced Search DropDown
		search.clickAdvancedSearchDropDown();
		
		//Pass the search text for exactly this text field
		String text="\"Father of OKRs\"";
		search.enterExactlyThisTextandSearch(text);
		
		//Verify Search Results Page
		SearchResultPage searchResults=new SearchResultPage(driver);
		boolean searchResultVisibility=searchResults.verifySearchResultPage();
		if(searchResultVisibility)
		{
			System.out.println("Search Result Page is displayed successfully");
		}
		else
		{
			System.out.println("Search Result Page is not displayed");			
		}
		
		//Verify the Search Results
		String[] strResults= {"okr","andrew grove"};
		String[] strResultmap = new String[strResults.length];
		int counter=0;
		for(int i=0;i<strResults.length;i++)
		{
			String lnkText=searchResults.getResultLinkText(i);
			if(lnkText.trim().equalsIgnoreCase(strResults[i]))
			{
				strResultmap[counter]="Found";
				continue;
			}
			else
			{
				strResultmap[counter]="Not Found";
			}
		}
		
		for(int i=0;i<strResultmap.length;i++)
		{
			if(strResultmap[i].trim().equalsIgnoreCase("found"))
			{
				System.out.println("Search Result: "+ strResults[i] +" is found successfully");
			}
			else
			{
				System.out.println("Search Result: "+ strResults[i] +" is NOT found");
			}
		}
	}

}
