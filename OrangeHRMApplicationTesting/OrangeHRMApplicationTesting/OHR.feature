Feature: OrangeHRM Application Functionalities Testing

Background:
Given User should open Browser in the system


Scenario: Validating OrangeHRM Application LogIn page
#Given User should open Browser in the system
When User enters OrangeHRM Application URL Address
Then User should be navigated to OrangeHRM Application LogIn WebPage
Then User should be close to OrangeHRM Application along with the browser

@ReTesting
Scenario: Validating OrangHRM Application LogIn Functionality

#Given User should open Browser in the system
When User enters OrangeHRM Application URL Address
Then User should be navigated to OrangeHRM Application LogIn WebPage
Then User should enter userName and password and click on login button
Then User should be navigated to OrangeHRM Application HomePage
Then User should click on WelCome Admin and click on Logout
Then User should be navigated to OrangeHRM Application LogIn WebPage
Then User should be close to OrangeHRM Application along with the browser


Scenario Outline: Validating OrangHRM Application LogIn Functioanlity with TestData

#Given User should open Browser in the system
When User enters OrangeHRM Application URL Address
Then User should be navigated to OrangeHRM Application LogIn WebPage
Then User should enter "<userName>" and "<password>" and click on login button
Then User should be navigated to OrangeHRM Application HomePage
Then User should click on WelCome Admin and click on Logout
Then User should be navigated to OrangeHRM Application LogIn WebPage
Then User should be close to OrangeHRM Application along with the browser

Examples:
           | userName   | password     |
           | Pardhu1998 | Livetech@143 | 
           | Pardhu1998 | Cucumber     | 
           | Cucumber   | Livetech@123 | 
           | Pardhu1998 | Livetech@123 | 