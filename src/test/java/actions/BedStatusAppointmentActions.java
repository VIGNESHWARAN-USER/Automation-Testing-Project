package actions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.BedStatusPages;
import utilities.HelperClass;

public class BedStatusAppointmentActions extends BaseAction {

    public BedStatusAppointmentActions(WebDriver driver) {
        super(driver);
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickrecp() {
        try {
            HelperClass.logger.info("Clicking reception button");
            click(BedStatusPages.getReceptionistButton());
        } catch (Exception e) {
            HelperClass.logger.error("Error clicking reception button", e);
        }
    }

    public void signin() {
        try {
            HelperClass.logger.info("Clicking Sign In");
            click(BedStatusPages.getSignInButton());
        } catch (Exception e) {
            HelperClass.logger.error("Error clicking Sign In button", e);
        }
    }

    public void appointment() {
        try {
            HelperClass.logger.info("Clicking Appointment button");
            click(BedStatusPages.getAppointmentButton());
        } catch (Exception e) {
            HelperClass.logger.error("Error clicking Appointment button", e);
        }
    }

    public void clickbed() {
        try {
            HelperClass.logger.info("Clicking Bed Status");
            click(BedStatusPages.getBedStatusButton());
        } catch (Exception e) {
            HelperClass.logger.error("Error clicking Bed Status", e);
        }
    }

    public void clickroom() {
        try {
            HelperClass.logger.info("Clicking Room");
            click(BedStatusPages.getRoom());
        } catch (Exception e) {
            HelperClass.logger.error("Error clicking Room", e);
        }
    }

    public boolean check() {
        try {
            HelperClass.logger.info("Checking bed details");
            return isDisplayed(BedStatusPages.getGender());
        } catch (Exception e) {
            HelperClass.logger.error("Error checking bed details", e);
            return false;
        }
    }
}