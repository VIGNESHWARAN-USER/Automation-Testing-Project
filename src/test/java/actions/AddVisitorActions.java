package actions;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.AddVisitorPages;
import utilities.HelperClass;

public class AddVisitorActions extends BaseAction {

    WebDriverWait wait;

    public AddVisitorActions(WebDriver driver) {
        super(driver);
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clkaddvistor() {
        try {
            HelperClass.logger.info("Clicking Front Office");
            jsClick(AddVisitorPages.getFrontOffice());

            HelperClass.logger.info("Clicking Add Visitor button");
            waitForVisibility(AddVisitorPages.getAddVisitorBtn());
            jsClick(AddVisitorPages.getAddVisitorBtn());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void entervalddet(Map<String, String> data) {
        try {
            HelperClass.logger.info("Entering valid visitor details");

            sendKeys(AddVisitorPages.getVisitorName(), data.get("visitorName"));
            sendKeys(AddVisitorPages.getPhoneNumber(), data.get("phoneNumber"));
            selectByVisibleText(AddVisitorPages.getPurpose(), data.get("purpose"));
            jsSendKeys(AddVisitorPages.getCheckinDate(), data.get("checkinDate"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterinvaldet(Map<String, String> data) {
        try {
            HelperClass.logger.info("Entering invalid visitor details");

            sendKeys(AddVisitorPages.getVisitorName(), data.get("visitorName"));
            sendKeys(AddVisitorPages.getPhoneNumber(), data.get("phoneNumber"));
            selectByVisibleText(AddVisitorPages.getPurpose(), data.get("purpose"));
            jsSendKeys(AddVisitorPages.getCheckinDate(), data.get("checkinDate"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clicksave() {
        try {
            HelperClass.logger.info("Clicking Save button");
            jsClick(AddVisitorPages.getSaveBtn());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getsuccess() {
        try {
            HelperClass.logger.info("Getting success message");
            return getText(AddVisitorPages.getSuccessMsg());

        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public boolean validmessage() {
        try {
            HelperClass.logger.info("Checking validation message");
            return isDisplayed(AddVisitorPages.getValidationMessage());

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}