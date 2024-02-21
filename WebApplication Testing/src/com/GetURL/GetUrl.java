package com.GetURL;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrl {
	
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","./BrowserdriveFiles/chromedriver.exe");
ChromeDriver chromebrowser=new ChromeDriver();
chromebrowser.get("http://google.com");
 String googleCurrentwebpageURLAddress=chromebrowser.getCurrentUrl();
 System.out.println("The current URL Address of the webpage is :-"+googleCurrentwebpageURLAddress);
 chromebrowser.quit();
}
}
