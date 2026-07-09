package actions;

import java.util.List;

import org.jspecify.annotations.NonNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import pages.PathalogyPage;
import utilities.HelperClass;

public class PathalogyAction extends BaseAction {


    public PathalogyAction(WebDriver driver) {
        super(driver);
    }
    
   //for search
    
    public String getCurrentUrl() {
        wait.until(ExpectedConditions.not(
            ExpectedConditions.urlContains("userlogin")));
        return driver.getCurrentUrl();
    }
    
    public void clickLogin() {
    	click(PathalogyPage.getLogin());
    }

    public void clickUserlog() {
        click(PathalogyPage.getUserLogin());
        waitForVisibility(PathalogyPage.getSignup());
    }

    public void clickSignup() {
    	
        waitForVisibility(PathalogyPage.getSignup());
        click(PathalogyPage.getSignup());
    }

    public void clickPathology() {
        click(PathalogyPage.getPathologyMenu());
    }

    public void searchreport(String billNo) {
        sendKeys(PathalogyPage.getSearch(), billNo);
    }

    public void isRecDisplayed(String billNo) {

        wait.until(ExpectedConditions.visibilityOfElementLocated(PathalogyPage.getTable()));
        List<WebElement> rows = driver.findElements(PathalogyPage.getTable());
        int actualRows = rows.size();

        if (actualRows <= 1) {
            System.out.println("No records found");
        } else {
            System.out.println("Records found: " + (actualRows - 1));
        }

        wait.until(ExpectedConditions.presenceOfElementLocated(PathalogyPage.getBillNumber(billNo)));
        boolean isPresent = driver.getPageSource().contains(billNo);
        Assert.assertTrue(isPresent, "Bill number not displayed in results");
    }
    
    public void invalidSearch(String BillNo) {
    	sendKeys(PathalogyPage.getSearch(),BillNo);
    }
    
    public String getErrorTxt() {
    	return getText(PathalogyPage.getNotFound());
    }
    
    //for payment
    
    public void clickpay() {
    	waitForVisibility(PathalogyPage.getPayButton());
        click(PathalogyPage.getPayButton());
    }
    
    public void enterAmt(String amt) {
    	sendKeys(PathalogyPage.getPayAmount(), amt);
    }
    
    public void clickadd() {
    	click(PathalogyPage.getAdd());
    }
    
    public void ensure_makepay() {
        click(PathalogyPage.getMakePayment());
        switchToFrame(PathalogyPage.getFrame());
    }
      
    public void enterMob(String mobile) {
    
        try {
            sendKeys(PathalogyPage.getMobile(),mobile);
        } catch (org.openqa.selenium.TimeoutException e) {
        	System.out.println("Mobile field not displayed");
        }
    }

    public void clickContinue() {

        try {
            click(PathalogyPage.getContinueButton());
        } catch (org.openqa.selenium.TimeoutException e) {
        	 System.out.println("Continue button not clickable");
        }
    }
    
    public void chooseUpi() {
    	click(PathalogyPage.getUpi());
    }
    
    public void sendUpiId(String upiId) {
    	sendKeys(PathalogyPage.getEmail(),upiId);
    }
    
    public void clickVerify() {
    	click(PathalogyPage.getVerify());
    }
    
    public String getSuccessTxt() {
        try {
            driver.switchTo().defaultContent();
        } catch (Exception e) {
            System.out.println("Already on main page");
        }
        try {
            return getText(PathalogyPage.getSuccess());
        } catch (org.openqa.selenium.TimeoutException e) {
            if (driver.getPageSource().contains("Thank you for your payment")) {
                return "Thank you for your payment";
            }
            System.out.println("Success message not found on page");
            return "";
        }
    }
    
    public String getPayErrorTxt() {
        try {

            return getText(PathalogyPage.getPayError()).trim();
        } catch (org.openqa.selenium.TimeoutException e) {
            String pageSource = driver.getPageSource();
            boolean hasExceed = pageSource.contains("Amount Should Not Be Greater Than Balance");
            boolean hasInvalid = pageSource.contains("Invalid Amount");
            if (hasExceed) return "Amount Should Not Be Greater Than Balance";
            if (hasInvalid) return "Invalid Amount";
            return "";
        }
    }
}
