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

public class TC05_VerifyLevisJeansAddToCartFunctionality {
	
@Test
	
	public void verifyLevisJeansAddToCartFunctionality()
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
		homepomclass.ClickAllMenuButton();
		homepomclass.clickMensFashion();
		homepomclass.clickJeans();
		homepomclass.clickLevisJeans();
		
		List<String> allpage = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(allpage.get(1));
		
		homepomclass.clickAddToCartLevisJeans();
		
		
		System.out.println("Apply Validation");
		
		String expectedresult="1";
		
		String actualresult=homepomclass.addToCartValidation();
		
		if(expectedresult.equals(actualresult))
		{
			System.out.println("TC05_VerifyLevisJeansAddToCartFunctionality is Pass");
		}
		else
		{
			System.out.println("TC05_VerifyLevisJeansAddToCartFunctionality is Fail");
		}
		
		
		driver.quit();
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
}
}