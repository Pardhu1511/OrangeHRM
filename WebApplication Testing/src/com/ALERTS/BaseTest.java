package com.ALERTS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest {
	WebDriver driver;
	String tsRtc_UrlAddress="https://www.tsrtconline.in/oprs-web/";
	@BeforeTest
	
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "./DriverFiles1/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(tsRtc_UrlAddress);
		driver.manage().window().maximize();
		
	}
	@AfterTest
public void teardown()
{
	driver.quit();
}
}
