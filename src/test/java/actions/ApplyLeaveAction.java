package actions;

import org.openqa.selenium.WebDriver;

import pages.ApplyLeavePage;

public class ApplyLeaveAction extends BaseAction {
	ApplyLeavePage leavePage;

    public ApplyLeaveAction(WebDriver driver) {
        super(driver);
        this.leavePage = new ApplyLeavePage(driver);
    }
    
    public void clickHumanRes() {
    	click(leavePage.humanRes);
    }
    public void clickLeaves() {
    	waitForVisibility(leavePage.leaves);
    	click(leavePage.leaves);
    }
    public void clickApply() {
    	waitForVisibility(leavePage.applyLeave);
    	click(leavePage.applyLeave);
    }
    public void clickLeaveType() {
    	click(leavePage.leaveType);
    	click(leavePage.sick);
    }
    public void clickLeaveFrom() {
    	click(leavePage.leaveFrom);
    }
    public void clickLeaveTo() {
    	click(leavePage.leaveTo);
    }
    public void enterReason(String reason) {
    	sendKeys(leavePage.reason,reason);
    }
    public void clickSave() {
    	click(leavePage.savebtn);
    }
}
