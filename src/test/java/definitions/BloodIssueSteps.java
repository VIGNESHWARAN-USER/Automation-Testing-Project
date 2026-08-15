package definitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.DriverFactory;
import actions.PathologistAction;
import actions.BloodIssueAction;
import utilities.HelperClass;
import org.testng.Assert;

public class BloodIssueSteps {
	
	private final PathologistAction pathologyAction = new PathologistAction(DriverFactory.getDriver());
	private final BloodIssueAction issueAction = new BloodIssueAction(DriverFactory.getDriver());
	
	@Given("the user navigates to the admin login page")
	public void the_user_navigates_to_the_admin_login_page() {
		HelperClass.logger.info("Navigating to admin login page");
        pathologyAction.navigateToAdminLogin();
	}
	@When("the user logs in as a Pathologist")
	public void the_user_logs_in_as_a_pathologist() {
		HelperClass.logger.info("Clicking Pathologist button and signing in");
        pathologyAction.clickPathologistBtn();
        pathologyAction.clickSignIn();
	}
	@Then("the Pathologist dashboard should be displayed")
	public void the_pathologist_dashboard_should_be_displayed() {
	    //issueAction.clickAccImg();
	    String actual = issueAction.getAccName();
	    Assert.assertTrue(
	            actual.equalsIgnoreCase("Pathologist"),
	            "Expected Pathologist but found " + actual
	        );
	}
	@When("the user clicks the Blood Bank menu")
	public void the_user_clicks_the_blood_bank_menu() {
		issueAction.clickBloodBank();
	}
	@When("the user opens the Blood Status page")
	public void the_user_opens_the_blood_status_page() {
	    issueAction.isDisplayedStatus();
	}
	@When("the user stores the blood bag number from the Blood table")
	public void the_user_stores_the_blood_bag_number_from_the_blood_table() {
	   issueAction.clickBlood();
	}
	@When("the user clicks the Issue button for that blood bag")
	public void the_user_clicks_the_issue_button_for_that_blood_bag() {
	    issueAction.clickIssueBtn();
	}
	@Then("the Blood Issue form should be displayed")
	public void the_blood_issue_form_should_be_displayed() {
	    issueAction.isDisplayedForm();
	}
}