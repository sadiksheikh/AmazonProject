package com.Amazon.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import com.Amazon.POMClasses.HomePOMClass;
import com.Amazon.POMClasses.LoginPOMClass;

public class TC02_VerifyLogoutFunctionality {
	
	@Test
	
	public void verifyLogoutFunctionality()
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\selenium\\Drivers\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		System.out.println("Browser Open");
		
		driver.manage().window().maximize();
		System.out.println("Maxmize Window");
		
		driver.get("https://www.amazon.in/");
		System.out.println("Amazon Site Open");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Apply Wait Successfully");
		
		LoginPOMClass loginpomclass = new LoginPOMClass(driver);
		loginpomclass.clickLoginPage();
		loginpomclass.sendUserName();
		loginpomclass.clickContinueUsesrUame();
		loginpomclass.sendPassword();
		loginpomclass.clickSigninButton();
		
		
		HomePOMClass homepomclass = new HomePOMClass(driver);
		homepomclass.moveArrowtologinpage();
		homepomclass.clickLogOutButton();
		
		
		String expectedresult = "Amazon Sign In";
		
		String actualresult = driver.getTitle();
		System.out.println(actualresult);
		
		
		System.out.println("Apply Validation");
		
		if(expectedresult.equals(actualresult))
		{
			System.out.println("TC02_VerifyLogoutFunctionality Test Case is Pass");
		}
		else
		{
			System.out.println("TC02_VerifyLogoutFunctionality Test Case is Fail");
		}
		
		
		driver.quit();
		System.out.println("End Of Program");
		
	}
	
	
	

}
