package com.EchoEchoApplicationRadioButtons;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.BaseTest.BaseTest;

import jdk.internal.org.jline.utils.Log;

public class RadioButtonsTesting1  extends BaseTest{
	//<input type="radio" name="group1" value="Milk">
			//<input type="radio" name="group1" value="Butter" checked="">
			//<input type="radio" name="group1" value="Cheese">
			
			//<input type="radio" name="group2" value="Water">
			//<input type="radio" name="group2" value="Beer">
			//<input type="radio" name="group2" value="Wine" checked="">
	@Test
	
	
	public void radioButtonsTesting() throws InterruptedException 
	{
	By grouplradiobuttonProperty = By.name("group1");
	List<WebElement> grouplradiobutton = driver.findElements(grouplradiobuttonProperty);
	By group2radiobuttonProperty = By.name("group2");
	List<WebElement> group2radiobutton = driver.findElements(group2radiobuttonProperty);
	int grouplradiobuttoncount = grouplradiobutton.size();
	int group2radiobuttoncount = group2radiobutton.size();
	System.out.println("The number of radio button Groupl are:"+grouplradiobuttoncount+"| Group2 are :"+group2radiobuttoncount);
	System.out.println();
	List<WebElement> allRadioButtons = new ArrayList<>();
	allRadioButtons.addAll(grouplradiobutton);
	allRadioButtons.addAll(group2radiobutton);
	
for (WebElement radioButton : allRadioButtons)
{
String	radiobuttonName= radioButton.getAttribute("value");
radioButton.click();
Thread.sleep(3000);

if (grouplradiobutton.contains(radioButton))
{System.out.println("Group1 RadioButtons Status "+radiobuttonName);
for (WebElement radioButtonstatus : grouplradiobutton)
{
	System.out.println(radioButtonstatus.getAttribute("value")+ "|"+radioButtonstatus.getAttribute("checked"));
	
}
	
}
else if (group2radiobutton.contains(radioButton))
{
	System.out.println("Group2 RadioButtons Status"+radiobuttonName);
	for (WebElement radioButtonstatus : group2radiobutton)
	{
		System.out.println(radioButtonstatus.getAttribute("value")+"|"+radioButtonstatus.getAttribute("checked"));
	}
	
}

}

}
}
