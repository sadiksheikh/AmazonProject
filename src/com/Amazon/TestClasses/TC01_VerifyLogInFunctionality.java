package com.Amazon.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import com.Amazon.POMClasses.LoginPOMClass;

public class TC01_VerifyLogInFunctionality {
	
	@Test//(invocationCount=4)
	public void verifyLogInFunctionality()
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\selenium\\Drivers\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		System.out.println("Browser Open");
		
		driver.manage().window().maximize();
		System.out.println("Window Maximize");
		
		driver.get("https://www.amazon.in/");
		System.out.println("Amazon Site Open");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Wait Apply Successfully");
		
		LoginPOMClass loginpomclass = new LoginPOMClass(driver);
		loginpomclass.clickLoginPage();
		loginpomclass.sendUserName();
		loginpomclass.clickContinueUsesrUame();
		loginpomclass.sendPassword();
		loginpomclass.clickSigninButton();
		System.out.println("Successfully Login");
		
		String expectedresult = "https://www.amazon.in/ap/signin";
		
		String actualresult = driver.getCurrentUrl();
		System.out.println(actualresult);
		
		System.out.println("Apply Validation");
		
		if(expectedresult.equals(actualresult))
		{
			System.out.println("TC01_VerifyLogInFunctionality Test Case Is Pass");
		}
		else
		{
			System.out.println("TC01_VerifyLogInFunctionality Test Case Is Fail");
		}
		
		driver.quit();
		System.out.println("End of Program");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
