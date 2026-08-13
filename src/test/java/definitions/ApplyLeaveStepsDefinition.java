package definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.DriverFactory;
import actions.ApplyLeaveAction;

public class ApplyLeaveStepsDefinition {
	
	private final ApplyLeaveAction leaveAction =
            new ApplyLeaveAction(DriverFactory.getDriver());
	
	@Then("the user should be redirected to the Pathologist dashboard")
	public void the_user_should_be_redirected_to_the_pathologist_dashboard() {
	    
	}

	@When("the user clicks the Human Resource menu")
	public void the_user_clicks_the_human_resource_menu() {
	    
	}

	@When("the user clicks the Leaves option")
	public void the_user_clicks_the_leaves_option() {
	    
	}

	@When("the user clicks the Apply Leave option")
	public void the_user_clicks_the_apply_leave_option() {
	    
	}

	@When("the user selects the leave type")
	public void the_user_selects_the_leave_type() {
	    
	}

	@When("the user selects the Leave From Date")
	public void the_user_selects_the_leave_from_date() {
	    
	}

	@When("the user selects the Leave To Date")
	public void the_user_selects_the_leave_to_date() {
	    
	}

	@When("the user enters {string}")
	public void the_user_enters(String string) {
	    
	}

	@When("the user attaches the document")
	public void the_user_attaches_the_document() {
	    
	}

	@When("the user clicks the Save button")
	public void the_user_clicks_the_save_button() {
	    
	}

	@Then("the {string} message should appear")
	public void the_message_should_appear(String string) {
	    
	}
}
