package com.Amazon.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMClass {
	WebDriver driver;
	
	@FindBy(xpath="(//a[@class='nav-a nav-a-2   nav-progressive-attribute'])[1]")
	private WebElement clickloginpage;
	
	public void clickLoginPage()
	{
		clickloginpage.click();
	}
	
	@FindBy(xpath="//input[@id='ap_email']")
	private WebElement username;
	
	public void sendUserName()
	{
		username.sendKeys("sadiksheikh560@gmail.com");
	}
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement clickusername;
	
	public void clickContinueUsesrUame()
	{
		clickusername.click();
	}
	
	@FindBy(xpath="//input[@id='ap_password']")
	private WebElement password;
	
	public void sendPassword()
	{
		password.sendKeys("84213338768sdk");
	}
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	private WebElement signinbutton;
	
	public void clickSigninButton()
	{
		signinbutton.click();
	}
	
	public LoginPOMClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	
	
}
