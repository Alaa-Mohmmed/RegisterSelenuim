package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageBase 
{
	public SearchPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="search_value")
	WebElement searchTextBox ; 

	@FindBy(id ="searchButton")
	WebElement searchBtn ; 


	@FindBy(css="h1.itemTitle")
	WebElement productTitle; 
	

	public void ProductSearch(String productName) 
	{
		setTextElementText(searchTextBox, productName);
		clickButton(searchBtn);
	}

	public void OpenProductDetailsPage() 
	{
		clickButton(productTitle);
	}


}
