package com.cgcx.scripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.cgcx.pageobject.*;
import com.cgcx.generic.BaseLib;

public class ordersTest extends BaseLib {

	@Test( priority = 1,description = "Navigated to the Order Page")
	@Parameters({"baseurl" })

	public void orders( String url) throws InterruptedException {
		Orders ordr = new Orders(driver);
		ordr.NavigateToOrders();
		Thread.sleep(2000);
		String actual = driver.getCurrentUrl();
		String expected = url+"orders";
		Assert.assertEquals(actual, expected);
		Reporter.log("Navigated to the Order Page successfully",true);
	}
}
