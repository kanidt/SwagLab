package org.page;

import org.global.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinishPageSwag  extends BaseClass{
	
	public FinishPageSwag() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//h2[text()='THANK YOU FOR YOUR ORDER']")
	private WebElement SwagLapthankyoutText;

	@FindBy(xpath="//button[text()='Open Menu']")
	 private WebElement finishlast;
	public WebElement getFinishlast() {
		return finishlast;
	}
	
	
}

