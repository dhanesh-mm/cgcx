package com.cgcx.scripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.cgcx.pageobject.*;
import com.cgcx.generic.BaseLib;

public class referralTest extends BaseLib {

	@Test( priority = 1,description = "Navigated to the Referral Page")
	public void referral() throws InterruptedException {
		Referral ref = new Referral(driver);
		ref.NavigateToReferral();
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.xpath("//*[text()='dashboard']")).isDisplayed());
		Reporter.log("Navigated to the Referral Page successfully",true);
		driver.navigate().back();
		Thread.sleep(2000);
	}
}
