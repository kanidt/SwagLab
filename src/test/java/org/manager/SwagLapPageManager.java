package org.manager;

import org.global.BaseClass;
import org.page.CheckoutInformationPageSwag;
import org.page.FinishPageSwag;
import org.page.LoginPageSwag;
import org.page.OverViewPageSwag;
import org.page.ProductsPageSwag;
import org.page.YourCardPageSwag;

public class SwagLapPageManager extends BaseClass {
	
	private LoginPageSwag loginPageSwag;
	private ProductsPageSwag productsPageSwag;
	private YourCardPageSwag yourCardPageSwag;
	private CheckoutInformationPageSwag checkoutInformationPageSwag;
	private OverViewPageSwag overViewPageSwag;
	private FinishPageSwag finishPageSwag;
	
	public LoginPageSwag getLoginPageSwag() {
		return(loginPageSwag==null)?loginPageSwag=new LoginPageSwag(): loginPageSwag;
	}
	public ProductsPageSwag getProductsPageSwag() {
		return (productsPageSwag==null)?productsPageSwag=new ProductsPageSwag(): productsPageSwag;
	}
	public YourCardPageSwag getYourCardPageSwag() {
		return(yourCardPageSwag==null)?yourCardPageSwag=new YourCardPageSwag(): yourCardPageSwag;
	}
	public CheckoutInformationPageSwag getCheckoutInformationPageSwag() {
		return (checkoutInformationPageSwag==null)?checkoutInformationPageSwag=new CheckoutInformationPageSwag():checkoutInformationPageSwag;
	}
	public OverViewPageSwag getOverViewPageSwag() {
		return(overViewPageSwag==null)?overViewPageSwag=new OverViewPageSwag(): overViewPageSwag;
	}
	public FinishPageSwag getFinishPageSwag() {
		return(finishPageSwag==null)?finishPageSwag=new FinishPageSwag() : finishPageSwag;
	}

}
