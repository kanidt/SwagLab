package org.page;

import org.global.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPageSwag extends BaseClass {
	    public ProductsPageSwag() {
		PageFactory.initElements(driver, this);
	}   
	    @FindBy(xpath="//div[text()='login_logo']")
	    private WebElement SwagLabsText;
	public WebElement getSwagLabsText() {
		return SwagLabsText;
	}
	@FindBy(xpath="//button[text()='ADD TO CART']")
	private WebElement Addtocard;
	
	public WebElement getAddtocard() {
		return Addtocard;
	}
	@FindBy(xpath="//span[@class='fa-layers-counter shopping_cart_badge']")
	private WebElement button;
	
	public WebElement getButton() {
		return button;
	}

}
