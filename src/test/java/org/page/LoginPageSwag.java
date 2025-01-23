package org.page;

import org.global.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageSwag extends BaseClass  {
	
	public LoginPageSwag() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@class='login_logo']")
	private WebElement SwagLabstext;
	public WebElement getSwagLabstext() {
		return SwagLabstext;
}
	@FindBy(id="user-name")
	private WebElement username;
	public WebElement getUsername() {
		return username;
	}
	@FindBy(id="password")
	private WebElement password;
	public WebElement getPassword() {
		return password;
	}
	@FindBy(id="login-button")
	private WebElement Login;
	public WebElement getLogin() {
		return Login;
	}

}
