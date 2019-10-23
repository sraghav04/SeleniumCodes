package seleniumplus.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import seleniumplus.DriverUtiltity;
import seleniumplus.pages.LoginPageDemoWebShop;
import seleniumplus.pages.RegisterPageDemoWebShop;
import seleniumplus.pages.WelcomePageDemoWebShop;

public class TestDemoWebShopLogin {
	WebDriver driver;
	WelcomePageDemoWebShop wp;
	RegisterPageDemoWebShop rp;
	LoginPageDemoWebShop lp;
	@BeforeTest
	public void beforeTest()
	{
		driver=DriverUtiltity.getDriverInstance("chrome");
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		wp=PageFactory.initElements(driver, WelcomePageDemoWebShop.class);
		rp=PageFactory.initElements(driver, RegisterPageDemoWebShop.class);
		lp=PageFactory.initElements(driver, LoginPageDemoWebShop.class);
	}
	@AfterTest
	public void afterTest()
	{
		
	}
	@Test(dependsOnMethods = "testLoginLink")
	public void testLoginInfo()
	{
		WebElement logout=lp.loginInfo();
		Assert.assertTrue(logout.isDisplayed());
		logout.click();
	}
	@Test
	public void testLoginLink()
	{
		String url=wp.clickLoginLink();
		Assert.assertTrue(url.contains("login"));
	}

}
