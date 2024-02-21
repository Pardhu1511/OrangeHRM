package com.gettitle;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
public static void main(String[] args) {
	
		//Automation chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pardh\\OneDrive\\Desktop\\DEC1030AMBatch\\WebApplication Testing\\BrowserdriveFiles\\chromedriver.exe");
		//class       object
		ChromeDriver chromebrowser=new ChromeDriver();
		chromebrowser.get("http://google.com");
		String googleTitle=chromebrowser.getTitle();
		System.out.println("The Title of the current webpage is :-"+googleTitle);
		chromebrowser.quit();
		
		
		
		
		
		
	}
	

}

