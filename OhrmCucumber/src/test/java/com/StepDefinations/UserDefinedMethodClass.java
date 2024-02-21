package com.StepDefinations;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserDefinedMethodClass {

	WebDriver driver;

	@Given("User Should open Browser in the system")
	public void user_should_open_browser_in_the_system() {
		System.out.println("Browser opened");
	}

	@When("User enters OrangeHRM application URL Address")
	public void user_enters_orange_hrm_application_url_address() {
		System.out.println("Url opened");
	}

	@Then("User should be Navigated to the OrangeHRM loginPage")
	public void user_should_be_navigated_to_the_orange_hrm_login_page() {
		System.out.println("login page opened");
	}

	@Then("User should close the OrangeHRM application Along with Browser")
	public void user_should_close_the_orange_hrm_application_along_with_browser() {
		System.out.println("close browser");

	}

}
