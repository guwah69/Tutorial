package com.cucumber.LoginPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumber.LoginPage.FBLoginPageFactory;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FBTestCase {
	private WebDriver driver;
	private String baseUrl;
	FBLoginPageFactory loginPage;
	
	@Before
	public void beforeClass() {
		//driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Appium\\chromedriver.exe");
		driver = new ChromeDriver();
		//System.setProperty(Webdriver.chrome.driver", "C:\\Appium\\chromedriver.exe");
		baseUrl = "https://www.facebook.com/";
		loginPage = new FBLoginPageFactory(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
		
	}
		@Given("^That I am on FB home page$")
		public void that_I_am_on_FB_home_page() throws Throwable {
			loginPage.setFBemail("guwah69@hotmail.com");
	
		}

		@When("^I enter my username and password$")
		public void i_enter_my_username_and_password() throws Throwable {
			loginPage.setFBpass("almighty001");
		 
		}

		@Then("^I should be logged in$")
		public void i_should_be_logged_in() throws Throwable {
			loginPage.clickLoginTab();
		    
		}


}
