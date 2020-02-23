package com.cgcx.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cgcx.generic.WebdriverCommonLib;

public class Trade {
	WebDriver driver;
	WebdriverCommonLib wlib= new WebdriverCommonLib(driver);

	@FindBy(xpath="//*[@id=\"banner-primary-btn\"]")
	private WebElement StartTrading;

	@FindBy(xpath="//*[@class=\"pg-sidebar__toggler  true\"]")
	private WebElement Menu;


	@FindBy(xpath="//*[@href=\"/exchange/\"]")
	private WebElement Trade;

	public Trade (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void NavigateToTrade() throws InterruptedException
	{
		Thread.sleep(2000);
		StartTrading.click();
		Thread.sleep(2000);
		Menu.click();
		Thread.sleep(2000);
		Trade.click();

	}
}
