package com.expedia.Maven3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Testing Goes well");
		//String baseURL = "http://www.google.com";
		WebDriver driver;

		
		System.setProperty("webdriver.chrome.driver", "C:\\Appium\\chromedriver.exe");
		driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.facebook.com");
		

	}

}
