package com.cgcx.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cgcx.generic.WebdriverCommonLib;

public class Orders {

	WebDriver driver;
	WebdriverCommonLib wlib= new WebdriverCommonLib(driver);

	@FindBy(xpath="//*[@class=\"pg-sidebar__toggler  true\"]")
	private WebElement Menu;


	@FindBy(xpath="//*[@href=\"/orders\"]")
	private WebElement Orders;

	public Orders (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void NavigateToOrders() throws InterruptedException
	{
		Thread.sleep(5000);
		Menu.click();
		Thread.sleep(2000);
		Orders.click();

	}
}
