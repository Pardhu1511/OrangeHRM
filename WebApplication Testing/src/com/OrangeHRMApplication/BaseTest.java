package com.OrangeHRMApplication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.Utility.Log;
public class BaseTest {
	WebDriver driver;
	 String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	 
	 @BeforeTest
	 public void setUp()
	 {
		 System.setProperty("webdriver.chrome.driver",  "./DriverFiles1/chromedriver.exe");
		 driver=new ChromeDriver();
		 Log.info("Chrome launced successfully");
		 driver.get(applicationUrlAddress);
		 driver.manage().window().maximize();
	 }
	 
	 @AfterTest
	 
public void TearDown()
{
	driver.quit();
}

}
