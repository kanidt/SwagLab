package org.execute;

import java.io.IOException;

import org.global.BaseClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.manager.SwagLapPageManager;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebElement;

public class ProductsPageValidation extends BaseClass {
	

	public static BaseClass baseclass =new BaseClass();
	public static SwagLapPageManager pageManager=new SwagLapPageManager();
	
	
	@BeforeClass
	public static void BrowserLunch() {
		
		try {
			  System.out.println("@BeforeClass Test");

			baseclass.getDriver(baseclass.readExcel(1,2));
			baseclass.WindowsMax();
			
		} catch (SessionNotCreatedException  e) {
			System.out.println("error Message:"+e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("error Message:"+e.getMessage());
			e.printStackTrace();
		}
		  
		
	}

	@Before
	public void LoginPageValidation() throws IOException {
		
		System.out.println("Before Test");

		baseclass.getUrl(baseclass.readExcel(1,3));
		
		WebElement loginPageText = pageManager.getLoginPageSwag().getSwagLabstext();
		boolean displayed = loginPageText.isDisplayed();
		if(displayed==true) {
			System.out.println("user is in loginpage");
			}else {
				
			System.out.println("user is not loginpage");	
			}
		
	try {
		 WebElement username = pageManager.getLoginPageSwag().getUsername();
		baseclass.sendKeys(username,baseclass.readExcel(1,0));
		WebElement password = pageManager.getLoginPageSwag().getPassword();
		baseclass.sendKeys(password, baseclass.readExcel(1, 1));
		
		} catch (Exception e) {
			System.out.println("error Message:"+e.getMessage());
			e.printStackTrace();

	}
	try {
		WebElement login = pageManager.getLoginPageSwag().getLogin();
		baseclass.clickbutton(login);
		
	} catch (Exception e) {
         
		System.out.println("error Message:"+e.getMessage());
		e.printStackTrace();
  }
	
	
	
	try {
		if (pageManager.getLoginPageSwag().getSwagLabstext().isDisplayed()) {
			System.out.println("user sucessfully login");
			
		} else {
			System.out.println("user not sucessfully login");

		}
		
	} catch (Exception e) {
		System.out.println("error Message:"+e.getMessage());
		e.printStackTrace();
	}
	}
	@Test
	public void Productsdetails() { 
		
		try {
			WebElement addtocard = pageManager.getProductsPageSwag().getAddtocard();
			baseclass.clickbutton(addtocard);
			
			WebElement button = pageManager.getProductsPageSwag().getButton();
			baseclass.clickbutton(button);
			
		} catch (Exception e) {
			System.out.println("error Message:"+e.getMessage());
			e.printStackTrace();
		}
	
} 
	public static void Productssucessfullyvalidation() {
		try {
			if (pageManager.getProductsPageSwag().getSwagLabsText().isDisplayed()) 
			{
			System.out.println("product successful login");	
			} else {
       System.out.println("product  not successful login ");
			}
		} catch (Exception e) {
			System.out.println("error Message:"+e.getMessage());
			e.printStackTrace();
		}
	}
	
	

}
