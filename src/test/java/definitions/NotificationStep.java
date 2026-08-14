package definitions;

import actions.NotificationActions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class NotificationStep {

    NotificationActions action = new NotificationActions();


    @When("the user clicks on the notification option")
    public void the_user_clicks_on_the_notification_option() {

        action.clickNotificationOption();
    }


    @When("the user searches for {string} in the notification search field")
    public void the_user_searches_for_in_the_notification_search_field(String notification) {

        action.searchNotification(notification);
    }


    @Then("the IPD related notification should be displayed")
    public void the_ipd_related_notification_should_be_displayed() {

        Assert.assertTrue(
                action.isIPDNotificationDisplayed(),
                "IPD related notification was not displayed"
        );
    }
}