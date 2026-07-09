package actions;

import org.openqa.selenium.WebDriver;

import pages.DashboardPage;
import pages.ProfilePage;
import utilities.HelperClass;


public class ProfileAction extends BaseAction {


    DashboardPage dp;
    ProfilePage pp;


    public ProfileAction(WebDriver driver) {

        super(driver);

        dp = new DashboardPage();

        pp = new ProfilePage();
    }


    public void clickProfileIcon() {

        HelperClass.logger.info(
                "Clicking profile icon");

        click(dp.getProfileIcon());
    }


    public String getRole() {

        HelperClass.logger.info(
                "Getting role");

        return getText(pp.getRole());
    }


    public void clickProfileButton() {

        HelperClass.logger.info(
                "Clicking profile button");

        click(pp.getProfileButton());
    }


    public void clickLeaveButton() {

        HelperClass.logger.info(
                "Clicking leave button");

        click(pp.getLeaveButton());
    }


    public boolean isLeaveTable() {

        HelperClass.logger.info(
                "Checking leave table");

        return !driver.findElements(
                pp.getLeaveTable()).isEmpty();
    }
}