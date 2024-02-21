package com.OrangeHRM;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_login {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./DriverFiles1/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
	
	//<input name="txtUsername" id="txtUsername" type="text">
/*<           -tag,
 * input      -tag name
 * name       -attribute/locator
 * txtUsername-corresponding value/selector
 * id         -attribute/locator
 * txtUsername-corresponding value/selector
 * type       -attribute/its not a locator of Web driver
 * text       -corresponding value/selector

 */
/*
	//identifying the elements of web page -done using the properties
	chromebrowser.findElementById("txtUsername").sendKeys("pardhu1998");
	//<input name="txtPassword" id="txtPassword" auto complete="off" type="password">
	chromebrowser.findElementById("txtPassword").sendKeys("Livetech@143");
	//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
	chromebrowser.findElementByClassName("button").click();
	chromebrowser.quit();     */
	
String userNameTestData="pardhu1998"; //TestData.
By userNameProperty=By.name("txtUsername");  //property of an element is identified and assign to a variable.
WebElement userName=driver.findElement(userNameProperty);  //finding the WebElement with the property in current webpage.
userName.sendKeys(userNameTestData);   //performing the operation on the identified WebElement.



String passWordTestData="Livetech@143";
By passwordProperty=By.name("txtPassword");
WebElement passWord=driver.findElement(passwordProperty);
passWord.sendKeys(passWordTestData);

By loginProperty=By.name("Submit");
WebElement login=driver.findElement(loginProperty);
login.click();
/*
	//driver.close();
	
	//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
	By WelcomeButtonProperty=By.className("panelTrigger");
	 WebElement WelcomeButton=driver.findElement(WelcomeButtonProperty);
	 WelcomeButton.click();
	
	//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>

	// Thread.sleep(5000);
	// By LogoutProperty=By.linkText("Logout");
	//WebElement Logout=driver.findElement(LogoutProperty);
	//Logout.click();
	*/
	
//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewPimModule" id="menu_pim_viewPimModule" class="firstLevelMenu"><b>PIM</b></a>
Thread.sleep(3000);
By	PimProperty=By.id("menu_pim_viewPimModule");
WebElement Pim=driver.findElement(PimProperty);
Pim.click();

Thread.sleep(2000);
//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/addEmployee" id="menu_pim_addEmployee">Add Employee</a>

By addEmployeeProperty=By.linkText("Add Employee");
WebElement AddEmployee=driver.findElement(addEmployeeProperty);
AddEmployee.click();

//<input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">
String firstNameTestData="Pardhu01";
By FirstNameProperties=By.id("firstName");
WebElement FirstName=driver.findElement(FirstNameProperties);
FirstName.sendKeys(firstNameTestData);
//<input class="formInputText" maxlength="30" type="text" name="middleName" id="middleName">
//<input class="formInputText" maxlength="30" type="text" name="lastName" id="lastName">
Thread.sleep(1000);
String MiddleNameTestData="Pedada";
By MiddleNameProperties=By.name(MiddleNameTestData);
WebElement MiddleName=driver.findElement(MiddleNameProperties);
MiddleName.sendKeys(MiddleNameTestData);
Thread.sleep(2000);
String LastNameTestData="lastName";
By LastNameProperties=By.id(LastNameTestData);
WebElement LastName=driver.findElement(LastNameProperties);
LastName.sendKeys(LastNameTestData);
Thread.sleep(2000);
//<input type="checkbox" name="chkLogin" value="1" id="chkLogin">
By CheckBoxProperties=By.id("chkLogin");
WebElement CheckBox=driver.findElement(CheckBoxProperties);
CheckBox.click();






}
}
