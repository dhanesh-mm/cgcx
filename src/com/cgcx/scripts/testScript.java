package com.cgcx.scripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.cgcx.pageobject.*;
import com.cgcx.generic.BaseLib;

public class testScript extends BaseLib {


	@Test( priority = 1,description = "login with valid credentials")
	@Parameters({"email", "password" })
	public void login( String Email, String Pwd) throws InterruptedException {
		Login nw = new Login(driver);
		nw.clicklogin(Email, Pwd);
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.xpath("//a[@href=\"/profile/\"]//span[text()='"+Email+"']")).isDisplayed());

		Reporter.log("Login Successfully", true);
	}

	@Test( priority = 2,description = "Navigated to the Trade Page")
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

	@Test( priority = 3,description = "Navigated to the Wallet Page")
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

	@Test( priority = 4,description = "Navigated to the Order Page")
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

	@Test( priority = 5,description = "Navigated to the History Page")
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

	@Test( priority = 6,description = "Navigated to the Market Page")

	public void market() throws InterruptedException {
		Market mar = new Market(driver);
		mar.NavigateToMarket();
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.xpath("//h1[text()='Market']")).isDisplayed());
		Reporter.log("Navigated to the Market Page successfully",true);
		driver.navigate().back();
		Thread.sleep(2000);
	}

	@Test( priority = 7,description = "Navigated to the Referral Page")
	public void referral() throws InterruptedException {
		Referral ref = new Referral(driver);
		ref.NavigateToReferral();
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.xpath("//*[text()='dashboard']")).isDisplayed());
		Reporter.log("Navigated to the Referral Page successfully",true);
		driver.navigate().back();
		Thread.sleep(2000);
	}
	@Test( priority = 8,description = "Logout from application")
	public void logout() throws InterruptedException {
		Logout log = new Logout(driver);
		log.LogOut();
		Thread.sleep(2000);
	}
}
