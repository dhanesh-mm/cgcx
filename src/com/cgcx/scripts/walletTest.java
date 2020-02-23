package com.cgcx.scripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.cgcx.pageobject.*;
import com.cgcx.generic.BaseLib;

public class walletTest extends BaseLib {

	@Test( priority = 1,description = "Navigated to the Wallet Page")
	@Parameters({"baseurl" })

	public void wallet( String url) throws InterruptedException {
		Wallet wal = new Wallet(driver);
		wal.NavigateToWallet();
		Thread.sleep(2000);
		String actual = driver.getCurrentUrl();
		String expected = url+"wallets";
		Assert.assertEquals(actual, expected);
		Reporter.log("Navigated to the Wallet Page successfully",true);
	}
}
