package org.runner;

import org.execute.CheckoutInformationPageSwagValidation;
import org.execute.FirstPagevalidation;
import org.execute.OverViewPageSwagvalidation;
import org.execute.ProductsPageValidation;
import org.execute.YourCardPageSwagValidation;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
@RunWith(Suite.class)
@SuiteClasses({
	FirstPagevalidation.class,
	ProductsPageValidation.class,
	YourCardPageSwagValidation.class,
	CheckoutInformationPageSwagValidation.class,
	OverViewPageSwagvalidation.class  
	
})

public class SuiteLevelExecution {

}
