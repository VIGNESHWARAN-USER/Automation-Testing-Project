package definitions;

import actions.ChangeLanguageActions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ChangeLanguageStep {

    ChangeLanguageActions action = new ChangeLanguageActions();

    @When("the user clicks on the language option")
    public void the_user_clicks_on_the_language_option() {
        action.clickLanguageOption();
    }

    @When("the user selects {string} from the list of available languages")
    public void the_user_selects_from_the_list_of_available_languages(String language) {
        action.selectLanguage(language);
    }

    @Then("the application language should be changed to Hindi")
    public void the_application_language_should_be_changed_to_hindi() {

        Assert.assertTrue(action.isLanguageChanged());

    }
}