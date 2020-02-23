package com.cgcx.scripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.cgcx.pageobject.*;
import com.cgcx.generic.BaseLib;

public class logoutTest extends BaseLib {

	@Test( priority = 1,description = "Logout from application")
	public void logout() throws InterruptedException {
		Logout log = new Logout(driver);
		log.LogOut();
		Thread.sleep(2000);
		//		Assert.assertTrue(driver.findElement(By.xpath("")).isDisplayed());
		//		Reporter.log("",true);
	}
}
