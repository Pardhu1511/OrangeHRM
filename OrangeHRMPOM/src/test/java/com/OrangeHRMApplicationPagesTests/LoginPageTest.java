package com.OrangeHRMApplicationPagesTests;

import org.testng.annotations.Test;

import com.BaseTest.BaseTest;
import com.OrangeHRMApplicationPages.LoginPage;

public class LoginPageTest  extends BaseTest{
	@Test(priority=1,description="Validating OrangeHRM Login Panel Text")
public void orangeHRMApplicationLOginPage_loginpanelTextTest()
{
	LoginPage loginPage = new LoginPage();
	loginPage.orangeHRMApplicationLoginPage_loginpanelTextValidation();
}
	@Test(priority=2,description="Validating OrangeHRM LoginPage logo")
	public void orangeHRMApplicationLOginPage_loginpageLogoTest()
	{
		LoginPage loginPage = new LoginPage();
		loginPage.orangeHRMApplicationLoginPage_logoValidation();
	}
	@Test(priority=3,description="Validating Login Functionality")
	public void orangeHRMApplicationLOginPage_loginTest()
	{
		LoginPage loginPage= new LoginPage();
		loginPage.orangeHRMApplicationLoginPage_ValidatingLoginFunctinality("Pardhu1998", "Livetech@143");
	}
}
