package actions;

import org.openqa.selenium.WebDriver;

import pages.PostalPages;
import utilities.HelperClass;

public class PostalActions extends BaseAction {

	WebDriver driver;

	public PostalActions(WebDriver driver) {

		super(driver);

		this.driver = driver;

	}

	public void clickrecp() {

		HelperClass.logger.info("clicking receptionist button");

		click(PostalPages.getReceptionistButton());
	}

	public void clksign() {

		HelperClass.logger.info("clicking sign in button");

		click(PostalPages.getSignInButton());
	}

	public void clickfrontoffice() {

		HelperClass.logger.info("clicking front office");

		click(PostalPages.getFrontOffice());
	}

	public void clickpostal() {

		HelperClass.logger.info("clicking postal button");

		click(PostalPages.getPostButton());
	}

	public void clickdispatch() {

		HelperClass.logger.info("clicking dispatch button");

		click(PostalPages.getDispatch());
	}

	public void clickadddispatch() {

		HelperClass.logger.info("clicking add dispatch button");

		click(PostalPages.getAddDispatch());
	}

	public void enterdetails() {

		try {

			waitForClickable(PostalPages.getTitle());

			sendKeys(PostalPages.getTitle(), "Automation Postal");

		}

		catch (Exception e) {

			System.out.println("Unable to enter title");
		}
	}

	public void clicksave() {

		HelperClass.logger.info("clicking save button");

		click(PostalPages.getSaveButton());
	}

	public boolean verifypostal() {

		HelperClass.logger.info("verifying postal details");

		return isDisplayed(PostalPages.getList());
	}
}