package com.ALERTS;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TsRts_Alerts extends BaseTest {  //	//id="searchBtn" class="chkavailabilityBtn" 
@Test
	public void tsrtcAlertMessage() throws InterruptedException
	{
  By	checkAvailability_Properties=By.id("searchBtn");
  WebElement checkAvailability=driver.findElement( checkAvailability_Properties);
  
 checkAvailability.click();
Thread.sleep(5000);
Alert tsRtc_Alert=driver.switchTo().alert();

String expected_windowMessage="Please select start place.";
System.out.println("The Expected Message is :-"+expected_windowMessage);
   
 String actual_windowMessage = tsRtc_Alert.getText();
 System.out.println("The Actual message is :-"+actual_windowMessage);
 
  if(actual_windowMessage.equals(expected_windowMessage))
  {
	  System.out.println("Message exist :- PASS");
	  
  }
  else
  {
	 System.out.println("No message found :- FAIL"); 
  }
	  
  tsRtc_Alert.accept();//Accepting the 'OK' button on the Alert window
  
//tsRtc_Alert.dismiss();//Is used  to work with 'cancel' button
//tsRtc_Alert.sendKeys(("Hyderabad");// Sending the data into alert window
	}


	}
	 

