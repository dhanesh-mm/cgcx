package com.cgcx.scripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.cgcx.pageobject.*;
import com.cgcx.generic.BaseLib;

public class marketTest extends BaseLib {

	@Test( priority = 1,description = "Navigated to the Market Page")
	public void market() throws InterruptedException {
		Market mar = new Market(driver);
		mar.NavigateToMarket();
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.xpath("//h1[text()='Market']")).isDisplayed());
		Reporter.log("Navigated to the Market Page successfully",true);
		driver.navigate().back();
		Thread.sleep(2000);
	}
}
