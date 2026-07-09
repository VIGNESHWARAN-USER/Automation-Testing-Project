package actions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.BloodComponentPage;
import utilities.HelperClass;

public class BloodComponentAction extends BaseAction {

    WebDriver driver;
    WebDriverWait wait;

    public BloodComponentAction(WebDriver driver) {
        super(driver);
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickbilling() {
        try {
            HelperClass.logger.info("Clicking Billing");
            click(BloodComponentPage.getBilling());
        } catch (Exception e) {
            HelperClass.logger.error("Error clicking Billing", e);
        }
    }

    public void clickbloodcomponent() {
        try {
            HelperClass.logger.info("Clicking Blood Component Issue");
            click(BloodComponentPage.getBloodComponent());
        } catch (Exception e) {
            HelperClass.logger.error("Error clicking Blood Component Issue", e);
        }
    }

    public void clickdetails() {
        try {
            HelperClass.logger.info("Clicking Patient Details");
            jsClick(BloodComponentPage.getDetails());
        } catch (Exception e) {
            HelperClass.logger.error("Error clicking Patient Details", e);
        }
    }

    public boolean verifydetails() {
        try {
            HelperClass.logger.info("Verifying Patient Details popup");
            return isDisplayed(BloodComponentPage.getPatientPopup());
        } catch (Exception e) {
            HelperClass.logger.error("Error verifying Patient Details popup", e);
            return false;
        }
    }
}