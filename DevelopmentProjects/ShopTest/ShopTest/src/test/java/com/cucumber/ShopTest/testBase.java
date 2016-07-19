package com.cucumber.ShopTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class testBase {
	public static WebDriver driver;

		  public WebDriver getDriver(){ 
		  if(driver == null){	    
				System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
				driver = new ChromeDriver();
			  }
		return driver; 
		 }
}
