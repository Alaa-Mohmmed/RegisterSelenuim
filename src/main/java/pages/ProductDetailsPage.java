package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends PageBase
{
	public ProductDetailsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css="strong.itemTitle")
	public WebElement productNamebreadCrumb; 


	
	@FindBy(xpath = "//*[@id=\"addItemToCart\"]/input[8]")
	WebElement addToCartBtn ; 

	

	public void AddToCart() 
	{
		clickButton(addToCartBtn);
	}

}
