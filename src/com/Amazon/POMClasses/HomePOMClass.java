package com.Amazon.POMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePOMClass {
	
	WebDriver driver;
	Actions actions;
	@FindBy(xpath="//span[text()='Sign Out']")
	private WebElement logoutbutton;
	
	public void clickLogOutButton()
	{
		actions.click(logoutbutton).perform();
	}
	
	
	
	@FindBy(xpath="//a[@class='nav-a nav-a-2 nav-truncate   nav-progressive-attribute']")
	private WebElement clickloginpage;
	
	public void moveArrowtologinpage()
	{
		actions.moveToElement(clickloginpage).perform();
	}
	
	
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement searchtab;
	
	public void sendKeySearchTab(String massage)
	{
		searchtab.sendKeys(massage);
	}
	
	
	
	@FindBy(xpath="(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")
	private WebElement iphone;
	
	public void clickIphone()
	{
		iphone.click();
	}
	
	
	
	@FindBy(xpath="//span[@class='a-size-medium a-color-base a-text-normal']")
	private List<WebElement> alliphone;
	
	public void selectAllIphones()
	{
		for(WebElement phones : alliphone)
		{
			phones.click();
		}
	}
	
	
	
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	private WebElement addtocartbutton;
	
	public void clickAddToCart()
	{
		addtocartbutton.click();
	}
	
	
	
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	private List <WebElement> alladdtocart;
	
	public void clickAllAddToCart()
	{
		for (WebElement alladd : alladdtocart)
		{
			alladd.click();
		}
	}
	
	
	
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	private WebElement clicksearchbutton;
	
	public void clickSearchButton()
	{
		clicksearchbutton.click();
	}
	
	
	
	@FindBy(xpath="//span[@id='nav-cart-count']")
	private WebElement addtocartGetText;
	
	public String addToCartValidation()
	{
		String text = addtocartGetText.getText();
		return text;
	}
	
	
	@FindBy(xpath="//a[@id='nav-hamburger-menu']")
	private WebElement allMenuButton;
	
	public void ClickAllMenuButton()
	{
		allMenuButton.click();
	}
	
	
	
	@FindBy(xpath="//a[@data-menu-id='10']")
	private WebElement mensfashion;
	
	public void clickMensFashion()
	{
		mensfashion.click();
	}
	
	
	
	@FindBy(xpath="//a[text()='Jeans']")
	private WebElement jeans;
	
	public void clickJeans()
	{
		jeans.click();
	}
	
	
	
	@FindBy(xpath="(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")
	private WebElement levismensjeans;
	
	public void clickLevisJeans()
	{
		levismensjeans.click();
	}
	
	
	
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	private WebElement addtocart;
	
	public void clickAddToCartLevisJeans()
	{
		addtocart.click();
	}
	
	
	
	
	
	
	public HomePOMClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		actions=new Actions(driver);
	}
	
	

}
