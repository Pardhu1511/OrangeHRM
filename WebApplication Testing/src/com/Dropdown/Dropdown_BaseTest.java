package com.Dropdown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dropdown_BaseTest {
	WebDriver driver;
	 String applicationURLAddress="https://www.osmania.ac.in/";
	 @BeforeTest
	 public void setup() {
		 
		 System.setProperty("webdriver.chrome.driver", "./DriverFiles1/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get(applicationURLAddress);
		 driver.manage().window().maximize();
		 
		 
		 
	 }
	 @AfterTest
	 public void teardown() 
	 {
		 driver.quit();
	 }

}
