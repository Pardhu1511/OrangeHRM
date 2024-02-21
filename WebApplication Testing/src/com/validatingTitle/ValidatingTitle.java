package com.validatingTitle;

import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingTitle {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./BrowserdriveFiles/chromedriver.exe");
	ChromeDriver chromebrowser=new ChromeDriver();
	chromebrowser.get("http://bing.com");
	 String expected_bingHomepageTitle="Bing";
	 System.out.println("The Expected bing homepage title is :-"+expected_bingHomepageTitle);
	 
	String actual_webpageTitle=chromebrowser.getTitle();
		System.out.println("The Title of the bing webpage is :-"+actual_webpageTitle);
		if(actual_webpageTitle.equals(expected_bingHomepageTitle))
		{
			System.out.println("The Title of the homepage matched :- PASS");
		}
		else 
		{
			System.out.println("The Title of the homepage NOT matched:- FAIL");
			
		}
		chromebrowser.quit();
		
		
	
}
}
