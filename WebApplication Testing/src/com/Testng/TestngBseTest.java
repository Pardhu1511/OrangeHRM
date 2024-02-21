package com.Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestngBseTest {
	@Test(priority = 3)
public void pardhu()
{
	
	System.out.println("good Evening");
}
	@Test(priority = 1)
	public void browser()
	{
		System.setProperty("webdriver.chrome.driver", "./DriverFiles1/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String applicationUrl="http://www.google.com";
	driver.get(applicationUrl);
			
	}
	
}
