package definitions;

import actions.IPDSearchAction;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.IPDSearchPage;
import utilities.DriverFactory;

public class IPDSearchStepDefinition extends DriverFactory {

    IPDSearchAction searchAction;

    public IPDSearchStepDefinition() {

    	searchAction = new IPDSearchAction(DriverFactory.getDriver());
    }

    @When("the user enters {string} in the search box")
    public void the_user_enters_in_the_search_box(String patientName) {

    	searchAction.clickIPDModule();

    	searchAction.enterPatientName(patientName);
    }

    @Then("matching patient records should be displayed")
    public void matching_patient_records_should_be_displayed() {

        System.out.println("Matching records displayed");
    }

    @Then("no matching patient records should be displayed")
    public void no_matching_patient_records_should_be_displayed() {

        System.out.println("No matching records");
    }
}