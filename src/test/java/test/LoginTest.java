package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	
	WebDriver driver;
	
	@Test
	public void ValidUserShouldBeableToLogin() {
		
		driver = BrowserFactory.init();
		LoginPage loginPage = PageFactory.initElements(driver,LoginPage.class);;
		
	}

}
