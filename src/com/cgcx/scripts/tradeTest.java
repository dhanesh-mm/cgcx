package com.cgcx.scripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.cgcx.pageobject.*;
import com.cgcx.generic.BaseLib;

public class tradeTest extends BaseLib {

	@Test( priority = 1,description = "Navigated to the Trade Page")
	@Parameters({"baseurl" })

	public void trade( String url) throws InterruptedException {
		Trade td = new Trade(driver);
		td.NavigateToTrade();
		Thread.sleep(2000);
		String actual = driver.getCurrentUrl();
		String expected = url+"exchange/cgcxusd";
		Assert.assertEquals(actual, expected);
		Reporter.log("Navigated to the Trade Page successfully", true);
	}
}
