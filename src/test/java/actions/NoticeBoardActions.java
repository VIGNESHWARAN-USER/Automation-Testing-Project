package actions;

import org.openqa.selenium.WebDriver;

import pages.NoticeBoardPages;
import utilities.HelperClass;

public class NoticeBoardActions extends BaseAction {

	WebDriver driver;

	public NoticeBoardActions(WebDriver driver) {

		super(driver);

		this.driver = driver;
	}

	public void clknotice() {

		HelperClass.logger.info(
				"Clicking notice");

		jsClick(NoticeBoardPages.getNotice());
	}

	public boolean noticedisplayed() {

		HelperClass.logger.info(
				"Checking Notice Board page visibility");

		return isDisplayed(NoticeBoardPages.getNoticeDisplay());
	}
}