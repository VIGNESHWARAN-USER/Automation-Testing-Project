package actions;
import org.openqa.selenium.WebDriver;

import pages.BloodIssuePage;

public class BloodIssueAction extends BaseAction{
    BloodIssuePage issuePage;
    
    public BloodIssueAction(WebDriver driver) {
        super(driver);
        this.issuePage = new BloodIssuePage(driver);
    }
    /*public void clickAccImg() {
    	click(issuePage.profile);
    }*/
    public String getAccName() {
    	return getText(issuePage.pathologylog);
    }
    public void clickBloodBank() {
    	click(issuePage.bloodbank);
    }
    public void isDisplayedStatus() {
    	isDisplayed(issuePage.status);
    }
    public void clickBlood() {
    	click(issuePage.blood);
    }
    public void clickIssueBtn() {
    	click(issuePage.issue);
    }
    public void isDisplayedForm() {
    	isDisplayed(issuePage.form);
    }
}
