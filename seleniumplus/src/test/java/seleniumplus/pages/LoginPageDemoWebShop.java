package seleniumplus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageDemoWebShop {
	WebDriver driver;
	@FindBy(how = How.ID,using = "Email")
	WebElement email;
	@FindBy(how = How.ID,using = "Password")
	WebElement password;
	@FindBy(how = How.LINK_TEXT,using = "Forgot password?")
	WebElement forgotPassword;
	@FindBy(how = How.CSS,using = "input[value='Log in']")
	WebElement loginButton;
	@FindBy(how = How.LINK_TEXT,using = "Log out")
	WebElement logout;
	public LoginPageDemoWebShop(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public WebElement loginInfo()
	{
		email.sendKeys("askmail@email.com");
		password.sendKeys("abc123");
		loginButton.click();
		return logout;
	}

}
