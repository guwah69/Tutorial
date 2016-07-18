package com.cucumber.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBLoginPageFactory {
	WebDriver driver;
	
	@FindBy(id="email")
	WebElement FBemail;
	
	@FindBy(id="pass")
	WebElement FBpass;
	
	@FindBy(xpath=".//*[@id='u_0_m']")
	WebElement FBlogbtn;
	
	
	public FBLoginPageFactory(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setFBemail(String email){
		FBemail.sendKeys(email);
	}

	public void setFBpass(String pass){
		FBpass.sendKeys(pass);
	}

	public void clickLoginTab() {
		
		FBlogbtn.click();
		
		
		
	}
	
}
