package com.BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Utility.Log;


public class BaseTest {
 public static WebDriver driver;
String applicationURLAddresss="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
@BeforeMethod
public void setup() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
	driver = new ChromeDriver();
	Log.info("Chrome Browser Launched Successfully");

	driver.get(applicationURLAddresss);
	
	Log.info("Successfully Navigated to OrangeHRM Application LoginPage");
	driver.manage().window().maximize();
	
}
@AfterMethod
public void teardown()
{
	driver.quit();
	Log.info("ChromeBrowser along with OrangeHRM application closed Successfully");
}
}
