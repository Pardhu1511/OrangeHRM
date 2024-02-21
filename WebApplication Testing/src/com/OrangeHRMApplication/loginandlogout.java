package com.OrangeHRMApplication;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.Utility.Log;
import com.gettitle.GetTitle;

public class loginandlogout  extends BaseTest{
	FileInputStream propertiesfile;
	Properties Properties;
@Test
public void looginTest() throws InterruptedException, IOException
{
	propertiesfile =new FileInputStream("./src/com/Config/OrangeHRMApplicationProperties");
	Properties= new Properties();
	Properties.load(propertiesfile);
	//Validating page Title
	String expected_OrhrmTitle="OrangeHRM";
	Log.info("The Expected OrangeHrm Title is :-"+expected_OrhrmTitle);
	
	String actual_OrhrmTitle=driver.getTitle();
	System.out.println("The actual OrangeHrm Title is :-"+actual_OrhrmTitle);
	
	if (actual_OrhrmTitle.contains(expected_OrhrmTitle))
	{
		Log.info("Succesfully Navigated to the login page :- PASS");
		
	}
	else
	{
		Log.info("Failed to navigate to the login page :- FAIL");
	}
	
	{
		
	}
	//Validating the URL Address
	String expected_UrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	Log.info("The expected OrangeHRM Url Address :-"+expected_UrlAddress);
	
String	actual_UrlAddress=driver.getCurrentUrl();
	Log.info("The actual OrangeHRM Url Address :-"+actual_UrlAddress);
	
	if(actual_UrlAddress.equals(expected_UrlAddress))
	{
		Log.info("Successfully Navigated to LoginPage Url Address :- PASS");
		
	}
	else
	{
		Log.info("Failed to navigate LoginPage Url Address :- FAIL");
		
	}
	//<div id="logInPanelHeading">LOGIN Panel</div>
	//Validating LoginPanel text
	String expectedPanelTitle="LOGIN Panel";
	Log.info("The expected title of the login panel :-"+expectedPanelTitle);
	
	
	
	By loginPanelProperty=By.id(Properties.getProperty("orangeHrmLogInPagePanelProperty")  );
	WebElement loginpageText=driver.findElement(loginPanelProperty);
	String actualPanelText=loginpageText.getText();
	Log.info("The actual title of the login panel :-"+actualPanelText);
	
	if(actualPanelText.equals(expectedPanelTitle))
	{
		Log.info("Successfully Navigated to login page text :- PASS");
		
	}
	else {
		Log.info("Failed to navigate to login page text :- FAIL");
	}
	
	//<input name="txtUsername" id="txtUsername" type="text">
	//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
	
String	userNameTestData="Pardhu1998";
	By userNameProperty=By.id(Properties.getProperty("orangeHrmLogInPageUserNameProperty")  );
	WebElement userName=driver.findElement(userNameProperty);
	userName.sendKeys(userNameTestData);
	
	String passWordTestData="Livetech@143";
By passwordProperty=By.id(Properties.getProperty("orangeHrmLogInPagePasswordProperty") );
WebElement password=driver.findElement(passwordProperty);
 password.sendKeys(passWordTestData);
 Thread.sleep(2000);
 //<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
 By loginButtonProperty=By.id(Properties.getProperty("orangeHrmLogInPageLogInButtonProperty") );
 WebElement loginButton=driver.findElement(loginButtonProperty);
 loginButton.click();
 //<a href="#" id="welcome" class="panelTrigger activated-welcome">Welcome Admin</a>
 /*
 By welcomeAdminProperty=By.id("welcome");
 WebElement welcomeAdmin=driver.findElement(welcomeAdminProperty);
 welcomeAdmin.click();
 //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
 //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
 Thread.sleep(2000);
 By logoutProperty= By.linkText("Logout");
WebElement logout=driver.findElement(logoutProperty);
logout.click();

String expected_loginPanelText="LOGIN Panel";
System.out.println("The expected login Panel Text : -"+expected_loginPanelText);

By loginPanelPropertty=By.id("logInPanelHeading");
WebElement loginpanel1=driver.findElement(loginPanelPropertty);
String  actualPanelText1=loginpanel1.getText();
System.out.println("The Actual login panel text :-"+loginpanel1);
if(actualPanelText1.equals(expected_loginPanelText))
{
	System.out.println("Sucessfully navigated to the login panel text :- PASS");
	
}
else {
	System.out.println("Failed to navigate to the login panel text :- FAIL");
}
*/
//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewPimModule" id="menu_pim_viewPimModule" class="firstLevelMenu"><b>PIM</b></a>

By pimProperty=By.id( Properties.getProperty("orangeHrmHomePagePIMProperty"));
WebElement pim=driver.findElement(pimProperty);
pim.click();

//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/addEmployee" id="menu_pim_addEmployee">Add Employee</a>
By pimAddEmployeeProperty=By.id(Properties.getProperty("orangeHrmHomePagePIMAddEmployeeProperty"));
WebElement addEmployee=driver.findElement(pimAddEmployeeProperty);
addEmployee.click();

//<input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">
String firstNameTestData="Pardhu111";
By firstNameProperty=By.id(Properties.getProperty("orangeHrmAddEmployeePageFirtstNameProperty") );
WebElement firstName=driver.findElement(firstNameProperty);
firstName.sendKeys(firstNameTestData);

//Working with the keys of the keyboard
 Actions keyBoardActions=new Actions(driver);
 keyBoardActions.sendKeys(Keys.TAB).build().perform();
 //MiddleName
 keyBoardActions.sendKeys("P111").build().perform();
 //LastName
 keyBoardActions.sendKeys(Keys.TAB).build().perform();
 keyBoardActions.sendKeys("Lastname111").build().perform();
 Thread.sleep(2000);
 //Employee id
 keyBoardActions.sendKeys(Keys.TAB).build().perform();
 //photograph
 keyBoardActions.sendKeys(Keys.TAB).build().perform();
 //Enter key of keyboard
 keyBoardActions.sendKeys(Keys.ENTER).build().perform();
 Thread.sleep(5000);
 java.lang.Runtime.getRuntime().exec("./TestNg_Scripts/testng script.exe");
 
 
 

 Thread.sleep(2000);
 
 //<input type="button" class="" id="btnSave" value="Save">
 By saveButtonProperty=By.id(Properties.getProperty("orangeHrmAddEmployeePageSaveButtonProperty") );
	WebElement saveButton=driver.findElement(saveButtonProperty);	
	saveButton.click();
	//<a href="#" id="welcome" class="panelTrigger activated-welcome">Welcome Admin</a>
	
	 By welcomeAdminProperty=By.id(Properties.getProperty("orangeHrmHomePageWelcomeAdminProperty") );
	 WebElement welcomeAdmin=driver.findElement(welcomeAdminProperty);
	 welcomeAdmin.click();
	 //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
	 //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
	 Thread.sleep(2000);
	 By logoutProperty= By.linkText(Properties.getProperty("orangeHrmHomePageLogOutProperty") );
	WebElement logout=driver.findElement(logoutProperty);
	logout.click();
/*
	String expected_loginPanelText="LOGIN Panel";
	System.out.println("The expected login Panel Text : -"+expected_loginPanelText);

	By loginPanelPropertty=By.id("logInPanelHeading");
	WebElement loginpanel1=driver.findElement(loginPanelPropertty);
	String  actualPanelText1=loginpanel1.getText();
	System.out.println("The Actual login panel text :-"+actualPanelText1);
	if(actualPanelText1.equals(expected_loginPanelText))
	{
		System.out.println("Sucessfully navigated to the login panel text :- PASS");
		
	}
	else {
		System.out.println("Failed to navigate to the login panel text :- FAIL");
//	}*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	





}

}
