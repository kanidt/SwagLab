package org.page;

import org.global.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutInformationPageSwag extends BaseClass{
	
	public CheckoutInformationPageSwag() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@class='app_logo']")
    private WebElement SwagLabsText;
    public WebElement getSwagLabsText() {
	return SwagLabsText;
	}
	@FindBy(id="first-name")
    private WebElement firstname;
	public WebElement getFirstname() {
		return firstname;
	}
	@FindBy(id="last-name")
	private WebElement lastname;
	public WebElement getLastname() {
		return lastname;
	}
	@FindBy(id="postal-code")
	private WebElement zipcode;
	public WebElement getZipcode() {
		return zipcode;
	}
	@FindBy (xpath="//input[@value='CONTINUE']")
	private WebElement continuebutton;
	public WebElement getContinuebutton() {
		return continuebutton;
	}

}
