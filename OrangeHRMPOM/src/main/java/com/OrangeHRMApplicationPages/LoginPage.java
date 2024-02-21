package com.OrangeHRMApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseTest.BaseTest;
import com.Utility.Log;

public class LoginPage  extends BaseTest{
	
	
	// Object Repository Class

    //<div id="logInPanelHeading">LOGIN Panel</div>
	
	//@FindBy - is an annotation - works similar to findElement method
	
	public LoginPage() // Constructor - When a Class Name is similar to the Method Name
	{

	PageFactory.initElements(driver,this );
	}

	
	
	@FindBy(id="logInPanelHeading") //  1 .Identification of webelements
	WebElement loginpanelText;
	
	// 2.Performing Operation on webelements-Business Logics(user defined method)
	public void orangeHRMApplicationLoginPage_loginpanelTextValidation()
	{
	String	expected_orangeHRMApplicationLoginPage_loginpanelText="LOGIN Panel";
	Log.info("The Expected Text of the Login Panel"+expected_orangeHRMApplicationLoginPage_loginpanelText);
	
	String actual_orangeHRMApplicationLoginPage_loginpanelText=loginpanelText.getText();
	Log.info("The Actual Text of the Login Panel"+actual_orangeHRMApplicationLoginPage_loginpanelText);
	if (actual_orangeHRMApplicationLoginPage_loginpanelText.equals(expected_orangeHRMApplicationLoginPage_loginpanelText))
	{
	Log.info("Login Panel Text Validation Successful :- PASS");
	
	}
	else {
		Log.info("Login Panel Text Validation NOT Successful :- FAIL");
	}
	}
	///html/body/div[1]/div/div[2]/div/img
	@FindBy(xpath =" /html/body/div[1]/div/div[2]/div/img")
	WebElement loginpageLogo;
	public void orangeHRMApplicationLoginPage_logoValidation() 
	{
	boolean	flag=loginpageLogo.isDisplayed();
	
	if (flag)
	{
		Log.info("OrangeHRM Application Login Page Logo Found :- PASS");
	}
	else
	{
		Log.info("OrangeHRM Application Login Page Logo NOT Found :- FAIL");
	}
	}
	//<input name="txtUsername" id="txtUsername" type="text">
	//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
	//<input type="button" value="Login" name="openIdLogin" id="openIdLogin" disabled="disabled">
	@FindBy(id="txtUsername")
	WebElement userName;
	
	@FindBy(name="txtPassword")
	WebElement password;
	
	@FindBy(id="openIdLogin")
	WebElement loginButton;
	
	
	public void orangeHRMApplicationLoginPage_ValidatingLoginFunctinality(String UserName,String PassWord) 
	{
		userName.sendKeys(UserName);
		
		password.sendKeys(PassWord);
		loginButton.click();
		{
			{
				
			}
			
		}
	}
	
	
	
	
	
	
	
	
	
}