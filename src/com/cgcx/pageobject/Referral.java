package com.cgcx.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cgcx.generic.WebdriverCommonLib;

public class Referral {
	WebDriver driver;
	WebdriverCommonLib wlib= new WebdriverCommonLib(driver);

	@FindBy(xpath="//*[@class=\"pg-sidebar__toggler  true\"]")
	private WebElement Menu;


	@FindBy(xpath="//*[@href=\"/referral-dashboard/dashboard\"]")
	private WebElement Referral;

	public Referral (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void NavigateToReferral() throws InterruptedException
	{
		Thread.sleep(5000);
		Menu.click();
		Thread.sleep(2000);
		Referral.click();
		Thread.sleep(4000);
	}
}
