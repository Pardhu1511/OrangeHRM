package com.webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Getting_AllCity_Names extends BaseTest {
	@Test
	
	public void allColumn_CityNames()
	{
		///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
		///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[7]
		for(int rowIndex=1;rowIndex<=36;rowIndex++)
		{
			for(int rowOfCellsIndex=1;rowOfCellsIndex<=7;rowOfCellsIndex++)
				
			{
		By cityNameproperties=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+rowIndex+"]/td["+rowOfCellsIndex+"]");
	WebElement	webTableData=driver.findElement(cityNameproperties);
	String cityName=webTableData.getText();
	System.out.println(cityName);
	
	
			}
		}
	}
}

