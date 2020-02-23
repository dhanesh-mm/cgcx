package com.cgcx.scripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.cgcx.pageobject.*;
import com.cgcx.generic.BaseLib;

public class loginTest extends BaseLib {

	@Test( priority = 1,description = "login with valid credentials")
	@Parameters({"email", "password" })
	public void login( String Email, String Pwd) throws InterruptedException {
		Login nw = new Login(driver);
		nw.clicklogin(Email, Pwd);
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.xpath("//a[@href=\"/profile/\"]//span[text()='"+Email+"']")).isDisplayed());
		Reporter.log("Login Successfully", true);
	}
}
