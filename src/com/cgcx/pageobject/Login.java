package com.cgcx.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cgcx.generic.WebdriverCommonLib;

public class Login {
	WebDriver driver;
	WebdriverCommonLib wlib= new WebdriverCommonLib(driver);

	@FindBy(xpath="//*[@href='/signin?returnUrl=https://k8.cgcx.io/']")
	private WebElement SignIn;
	
	@FindBy(xpath="//*[@type=\"email\"]")
	private WebElement EMail;


	@FindBy(xpath="//*[@type=\"password\"]")
	private WebElement Pswd;

	@FindBy(xpath="//*[@type=\"submit\"]")
	private WebElement Login;

	public Login (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clicklogin(String Email,String Pwd) throws InterruptedException
	{
		Thread.sleep(5000);
		SignIn.click();
		Thread.sleep(2000);
		wlib.enterData(EMail, Email);
		wlib.enterData(Pswd, Pwd);
		Login.click();

	}

}
