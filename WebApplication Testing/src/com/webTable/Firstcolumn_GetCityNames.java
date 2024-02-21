package com.webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Firstcolumn_GetCityNames extends BaseTest {
	
	@Test(description= "Capturing FirstColumn City Names of the WorldClock WebTable")
	public void firstColumn_CityNames() {
		for(int rowIndex = 1; rowIndex<=36; rowIndex++) 
		{
			///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
			///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]
		  By  firstColumn_CityNameProperties=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+rowIndex+"]/td[1]");
		  
		  WebElement CityNames=driver.findElement(firstColumn_CityNameProperties);
		String  cityName_Text=CityNames.getText();
		System.out.println("The City Name is :-"+ cityName_Text);
		  
		  
		}
		
	}
	
	

}
