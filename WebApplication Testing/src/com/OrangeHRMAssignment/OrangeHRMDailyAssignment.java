package com.OrangeHRMAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

public class OrangeHRMDailyAssignment {
public static void main(String[] args) {
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login\\";
	
	System.setProperty("webdriver.chrome.driver","./DriverFiles1/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get(applicationUrlAddress);
	//driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login\"");
	/*
	//identifying the elements of webpage -done using the properties
	chromebrowser.findElementById("txtUsername").sendKeys("pardhu1998");
	//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
	chromebrowser.findElementById("txtPassword").sendKeys("Livetech@143");
	//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
	chromebrowser.findElementByClassName("button").click();
	chromebrowser.quit();     */
String expected_OrangeHRMLoginPageTitle="OrangeHRM";
System.out.println("The expected Orange HRM Login page title is :-"+expected_OrangeHRMLoginPageTitle);
String actual_OrangeHRMLoginPageTitle=driver.getTitle();
System.out.println("The actual Orange HRM login page title is :- "+actual_OrangeHRMLoginPageTitle);

if (actual_OrangeHRMLoginPageTitle.equals(expected_OrangeHRMLoginPageTitle)) 
{System.out.println("Successfully naviagated to Orange HRM Application login webpage-PASS");

	
}
else {
	System.out.println("Failed to navigate to the Orange HRM login webpage- FAIL");
}
//driver.findElement(By.id("txtUsername")).sendKeys("pardhu1998");
//driver.findElementByName("txtPassword").sendKeys("Livetech@143");
//driver.findElementByClassName("button").click();
String userNametestData="pardhu1998";
By UsernameProperty=By.id("txtUsername");
WebElement userName=driver.findElement(UsernameProperty);
userName.sendKeys(userNametestData);

String passWordTestData="Livetech@143";
By passWordProperty=By.name("txtPassword");
WebElement passWord=driver.findElement(passWordProperty);
passWord.sendKeys(passWordTestData);

By loginProperty=By.name("button");
WebElement login=driver.findElement(loginProperty);
login.click();





	
	
}
}
