package com.StepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Utility.Log;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks 
{
	public static WebDriver driver;

@Before
 public static void setUp()
 {
	 System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
	 driver = new ChromeDriver();

	 Log.info(" *** Chrome Browser launched Successfully *****");
	 }
	

@After
public static void tearDown() {
    // Code to close the browser
    driver.quit();
    Log.info("*********** chrome Browser got closed **********");
}


 }
	

