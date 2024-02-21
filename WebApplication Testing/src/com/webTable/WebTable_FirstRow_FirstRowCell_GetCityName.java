package com.webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebTable_FirstRow_FirstRowCell_GetCityName extends BaseTest   {

	
	@Test
	public void WebTable_getCityName()
	/*    Xpath is of 2 types
	 * 1.Absolute
	 * 2.Relative
	 *  
	 *  Xpath - The locator of the webdriver
	 *  
	 *  Any Xpath Expression is startin with /html tag - is an Absolute Xpath
	 *  
	 *  Xpath expression - Selector
	 */
	
	{
		///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
		
	By CityNameProperties=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]");
	
	WebElement cityName=driver.findElement(CityNameProperties);
	String cityName_Text=cityName.getText();
	System.out.println("The City Name is :"+cityName_Text);
	
	
	}
}
