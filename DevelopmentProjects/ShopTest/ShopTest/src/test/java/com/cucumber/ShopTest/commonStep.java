package com.cucumber.ShopTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class commonStep extends testBase {
	
	WebDriver driver = getDriver();	
	@Given("^I am on the Home page$")
	public void I_am_on_the_Home_page() throws Throwable {
       // System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		//driver = new ChromeDriver();
		driver.navigate().to("http://www.carguruji.com/shop/");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   	    driver.manage().window().maximize();
        Thread.sleep(1000); 
	}
	
	@When("^click my Account button$")
	public void click_my_Account_button() throws Throwable {
		driver.findElement(By.cssSelector("#tdb3 > span.ui-button-text")).click();
		Thread.sleep(1000);
	}
	
	@Given("^I see a welcome message$")
	public void I_see_a_welcome_message() throws Throwable {
		Assert.assertEquals("Welcome, Please Sign In", driver.findElement(By.cssSelector("h1")).getText());
		Thread.sleep(1000);	
	}
	
	@Then("^I log out$")
	public void I_log_out() throws Throwable {
	    driver.findElement(By.linkText("Log Off")).click();
	    driver.manage().deleteAllCookies();
	}

	

}
