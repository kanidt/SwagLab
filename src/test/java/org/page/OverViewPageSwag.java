package org.page;

import org.global.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverViewPageSwag extends BaseClass {
	
	public OverViewPageSwag() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@name='app_logo']")
	private WebElement SwagLapsText;
	public WebElement getSwagLapsText() {
		return SwagLapsText;
	}
	@FindBy(xpath="//a[text()='FINISH']")
	private WebElement finishlast;
	public WebElement getFinishlast() {
		return finishlast;
	}
	@FindBy(id="inventory_sidebar_link")
	private  WebElement AllIteams;
	public WebElement getAllIteams() {
		return AllIteams;
	}
	
}
