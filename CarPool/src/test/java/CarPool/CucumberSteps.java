package CarPool;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.TestCase;

public class CucumberSteps extends TestCase {

	Ride obj = new Ride();
	
	String actionButton;
	
	@Given("^user \"([^\"]*)\" enter details like \"([^\"]*)\" as source and \"([^\"]*)\" as destination and time \"([^\"]*)\"$")
	public void userInput(String name, String origin, String destination, String time) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		obj.setUserName(name);
		obj.setOrigin(origin);
		obj.setDestination(destination);
		obj.setTime(time);
	}

	
	@Given("^email id is \"([^\"]*)\" and phone number is \"([^\"]*)\"$")
	public void moreInputData(String emailId, String phoneNumber) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		obj.setEmailid(emailId);
		obj.setPhoneNumber(phoneNumber);
	}

	@When("^click on \"([^\"]*)\"$")
	public void userAction(String actionButton) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		this.actionButton = actionButton;
	}

	@Then("^data got save and message \"([^\"]*)\" get dispay with \"([^\"]*)\" button$")
	public void expectedResult(String message, String buttonName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		RideBLL rideObj = new RideBLL();
		assertEquals(message,rideObj.SaveRide(obj));
	}


	@Then("^Clicking on \"([^\"]*)\" button go to home page$")
	public void afterSavingRide(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}
	
	@Then("^Error message \"([^\"]*)\" get dispay with \"([^\"]*)\" button$")
	public void error_message_get_dispay_with_button(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		RideBLL rideObj = new RideBLL();
		assertEquals(arg1,rideObj.SaveRide(obj));
	}
}
