package com.cgcx.scripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.cgcx.pageobject.*;
import com.cgcx.generic.BaseLib;

public class historyTest extends BaseLib {

	@Test( priority = 1,description = "Navigated to the History Page")
	@Parameters({"baseurl" })

	public void history( String url) throws InterruptedException {
		History his = new History(driver);
		his.NavigateToHistory();
		Thread.sleep(2000);
		String actual = driver.getCurrentUrl();
		String expected = url+"history";
		Assert.assertEquals(actual, expected);
		Reporter.log("Navigated to the History Page successfully",true);
	}
}
