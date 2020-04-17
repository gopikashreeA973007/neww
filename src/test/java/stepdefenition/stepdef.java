package stepdefenition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdef {
	@Given("user launches the chrome browser")
	public void user_launches_the_chrome_browser() {
	    System.out.println("user enters the chrome browser");
	}

	@When("User navigates to registration page")
	public void user_navigates_to_registration_page() {
	    System.out.println("user enters the registration page");
	}

	@When("User enters the username")
	public void user_enters_the_username() {
		System.out.println("user enters the username");
	}
	    
	

	@When("User enters the password")
	public void user_enters_the_password() {
	   System.out.println("user enters the password");
	}

	@When("User enters the confirm pawwsord")
	public void user_enters_the_confirm_pawwsord() {
	   System.out.println("user enters the confirm password ");
	}

	@When("User clicks on submit button")
	public void user_clicks_on_submit_button() {
	   System.out.println("user click the subbmit button");
	}

	@Then("verify registration success")
	public void verify_registration_success() {
	   System.out.println("verificatio successful");
	}

}
