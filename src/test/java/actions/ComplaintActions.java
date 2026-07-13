package actions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.ComplaintFoPages;
import utilities.HelperClass;

public class ComplaintActions extends BaseAction {

    WebDriverWait wait;
    WebDriver driver;

    public ComplaintActions(WebDriver driver) {
        super(driver);
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    public void clickrescp() {
        try {
            HelperClass.logger.info("Clicking reception button");
            click(ComplaintFoPages.getReceptionistButton());

            HelperClass.logger.info("Clicking signin button");
            click(ComplaintFoPages.getSignInButton());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void clkfo() {
        try {
            HelperClass.logger.info("Clicking front office button");
            click(ComplaintFoPages.getFrontOffice());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void clkcom() {
        try {
            HelperClass.logger.info("Clicking complaint button");
            click(ComplaintFoPages.getComplaint());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void addcomp() {
        try {
            HelperClass.logger.info("Clicking add complaint button");
            click(ComplaintFoPages.getAddComplaint());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void compdet(String complainttype,
                        String source,
                        String phone,
                        String description) {

        try {

            Select complaintDropdown =
                    new Select(driver.findElement(
                            ComplaintFoPages.getComplaintType()));

            complaintDropdown.selectByVisibleText(complainttype);


            Select sourceDropdown =
                    new Select(driver.findElement(
                            ComplaintFoPages.getSource()));

            sourceDropdown.selectByVisibleText(source);


            sendKeys(
                    ComplaintFoPages.getPhone(),
                    phone);


            sendKeys(
                    ComplaintFoPages.getDescription(),
                    description);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void savebtn() {
        try {
            HelperClass.logger.info("Clicking save button");
            click(ComplaintFoPages.getSaveButton());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public String checklistcom() {

        try {
            HelperClass.logger.info("Checking complaint list");

            return getText(
                    ComplaintFoPages.getComplaintList());

        } catch (Exception e) {

            e.printStackTrace();
            return "";
        }
    }


    public void emptyfields() {

        try {

            HelperClass.logger.info(
                    "Checking whether required fields validation is displayed");

            isDisplayed(
                    ComplaintFoPages.getEmptyFields());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}