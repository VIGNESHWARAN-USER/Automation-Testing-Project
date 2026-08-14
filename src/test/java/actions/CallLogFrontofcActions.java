package actions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import pages.CallLogFrontofcPages;
import utilities.HelperClass;

public class CallLogFrontofcActions extends BaseAction {

	WebDriverWait wait;

	public CallLogFrontofcActions(WebDriver driver) {
		super(driver);
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public void clckrecp() {
		try {
			HelperClass.logger.info("Clicking reception button");
			waitForVisibility(CallLogFrontofcPages.getReceptionistButton());
			jsClick(CallLogFrontofcPages.getReceptionistButton());
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Unable to click receptionist button");
		}
	}

	public void clksign() {
		try {
			HelperClass.logger.info("Clicking sign in button");
			waitForVisibility(CallLogFrontofcPages.getSignInButton());
			jsClick(CallLogFrontofcPages.getSignInButton());
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Unable to click sign in button");
		}
	}

	public void frontofclink() {
		try {
			HelperClass.logger.info("Clicking front office link");
			waitForVisibility(CallLogFrontofcPages.getFrontOffice());
			jsClick(CallLogFrontofcPages.getFrontOffice());
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Unable to click front office link");
		}
	}

	public void phcalllog() {
		try {
			HelperClass.logger.info("Clicking phone call log");
			waitForVisibility(CallLogFrontofcPages.getPhoneCallLog());
			jsClick(CallLogFrontofcPages.getPhoneCallLog());
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Unable to click phone call log");
		}
	}

	public void addcall() {
		try {
			HelperClass.logger.info("Clicking add call button");
			waitForVisibility(CallLogFrontofcPages.getAddLog());
			jsClick(CallLogFrontofcPages.getAddLog());
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Unable to click add call button");
		}
	}

	public void enterdet(String name, String phone, String description, String calltype, String note, String duration) {
		try {

			sendKeys(CallLogFrontofcPages.getName(), name);
			sendKeys(CallLogFrontofcPages.getPhone(), phone);
			sendKeys(CallLogFrontofcPages.getDescription(), description);

			if (calltype.equalsIgnoreCase("Incoming")) {
				jsClick(CallLogFrontofcPages.getIncoming());
			} else if (calltype.equalsIgnoreCase("Outgoing")) {
				jsClick(CallLogFrontofcPages.getOutgoing());
			}

			sendKeys(CallLogFrontofcPages.getNote(), note);
			sendKeys(CallLogFrontofcPages.getCallDuration(), duration);

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Unable to enter call details");
		}
	}

	public void clicksave() {
		try {
			HelperClass.logger.info("Clicking save button");
			waitForVisibility(CallLogFrontofcPages.getSaveButton());
			jsClick(CallLogFrontofcPages.getSaveButton());
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Unable to click save button");
		}
	}

	public String checklist() {
		try {
			HelperClass.logger.info("Checking whether list is visible");
			waitForVisibility(CallLogFrontofcPages.getChecklist());
			return getText(CallLogFrontofcPages.getChecklist());
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Checklist not visible");
			return "";
		}
	}

	public boolean errorcheck() {
		try {
			return isDisplayed(CallLogFrontofcPages.getError());
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}