package com.cucumber.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class newUser {
	
	@Given("^I am on the Home page$")
	public void i_am_on_the_Home_page() throws Throwable {
		System.out.println("Given Step 1");
	    
	}

	@When("^click my Account button$")
	public void click_my_Account_button() throws Throwable {
		System.out.println("When Step 2");
	   
	}

	@Then("^I see a welcome message$")
	public void i_see_a_welcome_message() throws Throwable {
		System.out.println("Then Step 3");
		
	   
	}

	@When("^I click Continue button$")
	public void i_click_Continue_button() throws Throwable {
		System.out.println("Given Step 4");
	    
	}

	@Then("^my account information page loads$")
	public void my_account_information_page_loads() throws Throwable {
		System.out.println("Given Step 5");
	    
	}

	@When("^I enter all the user data in the Registration form$")
	public void i_enter_all_the_user_data_in_the_Registration_form() throws Throwable {
		System.out.println("Given Step 6");
	   
	}

	@When("^I click the continue button$")
	public void i_click_the_continue_button() throws Throwable {
		System.out.println("Given Step 7");
	    
	}

	@Then("^my account is created$")
	public void my_account_is_created() throws Throwable {
		System.out.println("Given Step 8");
	   
	}

	@Then("^I log out$")
	public void i_log_out() throws Throwable {
		System.out.println("Given Step 9");
	   
	}


}
