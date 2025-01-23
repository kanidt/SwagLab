package org.page;

import org.global.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourCardPageSwag extends BaseClass {
	
	public YourCardPageSwag() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[text()='login_logo']")
    private WebElement SwagLabsText;
public WebElement getSwagLabsText() {
	return SwagLabsText;
}
@FindBy(xpath="//a[text()='CHECKOUT']")
private WebElement checkout;

public WebElement getChechout() {
	return checkout;
}


}
