package com.BrowserAutomation;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserAutomation {
public static void main(String[] args) {
	//Automation chrome browser
	System.setProperty("webdriver.chrome.driver","C:\\Users\\pardh\\OneDrive\\Desktop\\DEC1030AMBatch\\WebApplication Testing\\BrowserdriveFiles\\chromedriver.exe");
	//class       object
	ChromeDriver chromebrowser=new ChromeDriver();
	
	//chromebrowser.navigate().to("http://google.com");
	chromebrowser.get("http://google.com");
	//identifying the title of the current page
	
	//chromebrowser.close();//'close' method is used for singlr tab.
	//chromebrowser.quit();//'quit' method is used for single tab and multiple tabs also.
	
	String googleTitle=chromebrowser.getTitle();      //GetTitle method used to get the title of the current webpage.
	
	System.out.println("The Title of the google Current WebPage is :-"+googleTitle);
	
	
}
}
