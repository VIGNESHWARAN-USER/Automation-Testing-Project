package actions;

import org.openqa.selenium.WebDriver;
import pages.PathologistPage;

public class PathologistAction extends BaseAction {

    public PathologistAction(WebDriver driver) {
        super(driver);
    }
    
    public void navigateToAdminLogin() {
        driver.get("https://demo.smart-hospital.in/site/login");
    }
    
    public void clickPathologistBtn() {
        waitForVisibility(PathologistPage.getPathologistBtn());
        click(PathologistPage.getPathologistBtn());
    }

    public void clickSignIn() {
        waitForVisibility(PathologistPage.getSignInBtn());
        click(PathologistPage.getSignInBtn());
    }

    public void clickPathologist() {
        click(PathologistPage.getPathologist());
    }

    public void clickmsg() {
        waitForVisibility(PathologistPage.getMessaging());
        click(PathologistPage.getMessaging());
    }

    public void clickSms() {
        click(PathologistPage.getSendSms());
    }

    public void enterTitle(String title) {
        waitForVisibility(PathologistPage.getTitle());
        sendKeys(PathologistPage.getTitle(), title);
    }

    public void enterTempId(String tempId) {
        sendKeys(PathologistPage.getTempId(), tempId);
    }

    public void sendthrough() {
        click(PathologistPage.getSms());
        click(PathologistPage.getMobileApp());
    }

    public void enterMessage(String message) {
        waitForVisibility(PathologistPage.getMessage());
        sendKeys(PathologistPage.getMessage(), message);
    }

    public void msgTo() {
        click(PathologistPage.getDtr());
        click(PathologistPage.getNurse());
    }

    public void clickSend() {
        click(PathologistPage.getSend());
    }

    public String getSuccessMsg() {
        try {
            return getText(PathologistPage.getSuccessMessage());
        } catch (Exception e) {
            System.out.println("Success message not found: " + e.getMessage());
            return null;
        }
    }
    
    public String getErrorMsg() {
        try {
            waitForVisibility(PathologistPage.getEmptyError());
            return getText(PathologistPage.getEmptyError());
        } catch (Exception e) {
            System.out.println("Error toast not found: " + e.getMessage());
            return null;
        }
    }

    public String getMissingFieldMsg() {
        try {
            waitForVisibility(PathologistPage.getMissingFieldError());
            return getText(PathologistPage.getMissingFieldError());
        } catch (Exception e) {
            System.out.println("Missing field toast not found: " + e.getMessage());
            return null;
        }
    }
}