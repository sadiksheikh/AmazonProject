package com.Amazon.TestClasses;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import com.Amazon.POMClasses.HomePOMClass;
import com.Amazon.POMClasses.LoginPOMClass;

public class TC03_VerifyAddToCartFunctionality {
	
	@Test
	public void verifyAddToCartFunctionality()
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\selenium\\Drivers\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		System.out.println("Browser Open");
		
		driver.manage().window().maximize();
		System.out.println("Maximize Window");
		
		driver.get("https://www.amazon.in/");
		System.out.println("Amazon Site Open");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Wait Apply");
		
		LoginPOMClass loginpomclass = new LoginPOMClass(driver);
		loginpomclass.clickLoginPage();
		loginpomclass.sendUserName();
		loginpomclass.clickContinueUsesrUame();
		loginpomclass.sendPassword();
		loginpomclass.clickSigninButton();
		
		
		HomePOMClass homepomclass = new HomePOMClass(driver);
		homepomclass.sendKeySearchTab("iphone");
		homepomclass.clickSearchButton();
		homepomclass.clickIphone();
		
		List<String> alladdress = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(alladdress.get(1));
		
		homepomclass.clickAddToCart();
		
		System.out.println("Apply Validation");
		
		String expectedresult = "4";
		
		String actualresult = homepomclass.addToCartValidation();
		System.out.println(actualresult);
		
		if(expectedresult.equals(actualresult))
		{
			System.out.println("TC03_VerifyAddToCartFunctionality Test Case Pass");
		}
		else
		{
			System.out.println("TC03_VerifyAddToCartFunctionality Test Case Fail");
		}
		
		driver.quit();
		System.out.println("End Of Program");
		
	}
	

}
