//package com.cucumber.ShopTest;
//
//import java.util.concurrent.TimeUnit;
//
//import junit.framework.Assert;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class steps {
//	public WebDriver driver;
//	public int ran;
//	
//	@Given("^I am on the Home page$")
//	public void I_am_on_the_Home_page() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.navigate().to("http://www.carguruji.com/shop/");
//	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	}
//
//	@When("^click my Account button$")
//	public void click_my_Account_button() throws Throwable {
//		driver.findElement(By.cssSelector("#tdb3 > span.ui-button-text")).click();
//		Thread.sleep(1000);
//	}
//
//	@Given("^I see a welcome message$")
//	public void I_see_a_welcome_message() throws Throwable {
//		Assert.assertEquals("Welcome, Please Sign In", driver.findElement(By.cssSelector("h1")).getText());
//		Thread.sleep(2000);
//	}
//
//	@When("^I click Continue button$")
//	public void I_click_Continue_Button() throws Throwable {
//		 driver.findElement(By.cssSelector("#tdb4 > span.ui-button-text")).click();
//		 Thread.sleep(1000);
//
//	}
//
//	@Then("^my account information page loads$")
//	public void my_account_information_page_loads() throws Throwable {
//		Assert.assertEquals("My Account Information", driver.findElement(By.cssSelector("h1")).getText());
//	
//	}
//
//	@When("^I enter all the user data in the Registration form$")
//	public void I_enter_all_the_user_data_in_the_Registration_form() throws Throwable {
//		driver.findElement(By.name("gender")).click();
//	    driver.findElement(By.name("firstname")).clear();
//	    driver.findElement(By.name("firstname")).sendKeys("robert");
//	    driver.findElement(By.name("lastname")).sendKeys("mike");
//	    driver.findElement(By.id("dob")).sendKeys("09/10/1983");
//	    driver.findElement(By.linkText("10")).click();
//	    
//        //**********Generating Random Email Address************
//	    ran = 100 + (int)(Math.random() * ((1000 - 1) + 1));
//	    
//        System.out.println(ran);
//        driver.findElement(By.name("email_address")).sendKeys("maxwell" + ran + "@gmail.com");
//	    Thread.sleep(1000);
//	    
//	    
//	    driver.findElement(By.name("street_address")).sendKeys("12 mole");
//	    driver.findElement(By.name("postcode")).sendKeys("se2 8eg");
//	    driver.findElement(By.name("city")).sendKeys("asdfdgf");
//	    driver.findElement(By.name("state")).sendKeys("dvfbn");
//	    new Select(driver.findElement(By.name("country"))).selectByVisibleText("United Kingdom");
//	    driver.findElement(By.name("telephone")).sendKeys("3453121215");
//	    driver.findElement(By.name("password")).sendKeys("password123");
//	    driver.findElement(By.name("confirmation")).sendKeys("password123");     
//	}
//
//	@When("^I click the continue button$")
//	public void I_click_the_continue_button() throws Throwable {
//		driver.findElement(By.id("tdb4")).click();
//		Thread.sleep(5000);
//	 
//	}
//
//	@Then("^my account is created$")
//	public void my_account_is_created() throws Throwable {
//		Assert.assertEquals("Your Account Has Been Created!", driver.findElement(By.cssSelector("h1")).getText());
//	}
//
//	@Then("^I log out$")
//	public void I_log_out() throws Throwable {
//		driver.findElement(By.cssSelector("#tdb4 > span.ui-button-text")).click();
//	}
//	
//	@When("^I enter my user email address$")
//	public void I_enter_my_user_email_address() throws Throwable {
//		driver.findElement(By.name("email_address")).sendKeys("maxwell174@gmail.com");
//	}
//
//	@When("^I enter my user password$")
//	public void I_enter_my_user_password() throws Throwable {
//		driver.findElement(By.name("password")).sendKeys("password123");
//	}
//
//	@When("^I click Login button$")
//	public void I_click_Login_button() throws Throwable {
//		driver.findElement(By.id("tdb5")).click();
//		Thread.sleep(3000);
//	}
//
//	@Then("^I am logged in$")
//	public void I_am_logged_in() throws Throwable {Assert.assertEquals("My Account Information", driver.findElement(By.cssSelector("h1")).getText());
//		
//	}
//	
//
//@When("^I enter ([^\"]*) in email field$")
//public void enterUsername(String username) throws Throwable {
// driver.findElement(By.name("email_address")).sendKeys(username);  
// 
//}
//
//@When("^I enter ([^\"]*) in password field$")
//public void enterPassword(String password) throws Throwable { 
// driver.findElement(By.name("password")).sendKeys(password);  
//}
//
//@Then("^I should see an error message$")
//public void I_should_see_an_error_message() throws Throwable {
//	String ErrorMessage = driver.findElement(By.cssSelector("td.messageStackError")).getText();
//	System.out.println(ErrorMessage);
//	 //Assert.assertEquals("Error: No match for E-Mail Address and/or Password.", driver.findElement(By.cssSelector("td.messageStackError")).getText());
//}
//
//
//
//	
//}
