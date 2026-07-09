package actions;

import org.openqa.selenium.WebDriver;

import pages.AppointmentFilterPage;
import utilities.HelperClass;

public class AppointmentFilterAction extends BaseAction {

    WebDriver driver;

    public AppointmentFilterAction(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void recptbnclick() {
        try {
            HelperClass.logger.info("Clicking Receptionist button");
            jsClick(AppointmentFilterPage.getReceptionistButton());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void subbtn() {
        try {
            HelperClass.logger.info("Clicking Submit button");
            click(AppointmentFilterPage.getSubmitButton());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickapp() {
        try {
            HelperClass.logger.info("Clicking Appointment menu");
            jsClick(AppointmentFilterPage.getAppointmentMenu());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clicktdyapp() {
        try {
            HelperClass.logger.info("Clicking Today Appointment filter");
            click(AppointmentFilterPage.getTodayAppointmentFilter());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickupapp() {
        try {
            HelperClass.logger.info("Clicking Upcoming Appointment filter");
            click(AppointmentFilterPage.getUpcomingAppointmentFilter());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickoldapp() {
        try {
            HelperClass.logger.info("Clicking Old Appointment filter");
            click(AppointmentFilterPage.getOldAppointmentFilter());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean verifyrecord() {
        try {
            return driver.findElements(AppointmentFilterPage.getAppointmentRows()).size() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean loggedin() {
        try {
            return isDisplayed(AppointmentFilterPage.getVerify());
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}