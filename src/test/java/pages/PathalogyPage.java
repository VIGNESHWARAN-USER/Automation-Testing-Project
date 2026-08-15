package pages;

import org.openqa.selenium.By;

public class PathalogyPage {

    private static final By login =
            By.xpath("//a[text()='Login']");

    private static final By userLogin =
            By.xpath("//a[@href='https://demo.smart-hospital.in/site/userlogin']");

    private static final By signup =
            By.xpath("//button[@type='submit'] | //button[contains(text(),'Sign')]");

    private static final By pathologyMenu =
            By.xpath("//li[@class]/a[normalize-space()='Pathology']");

    private static final By search =
            By.xpath("//div/*/input[@type='search' or @placeholder='Search...']");

    private static final By filter =
            By.xpath("//div[text()='Records: 1 to 1 of 1 (filtered from 14 total records)']");

    private static final By table =
            By.xpath("//table/tbody/tr");

    private static final By notFound =
            By.xpath("//tr[@class='odd']//td[text()='No matching records found']");


    // Payment

    private static final By payButton =
            By.xpath("//table/tbody/tr/td/div/button[@type='button']");

    private static final By payAmount =
            By.xpath("//input[@id='amount_total_paid']");

    private static final By add =
            By.xpath("//div[@class='modal-footer']//button[@id='pay_button']");

    private static final By makePayment =
            By.xpath("//button[normalize-space()='Make Payment']");

    private static final By mobile =
            By.xpath("//input[@type='tel']");

    private static final By continueButton =
            By.xpath("//div[@class='bg-surface p-4 d:mt-2 d:px-0 px-0']//button[@type='button']");

    private static final By upi =
            By.xpath("//*[self::a or self::li or self::div or self::span][normalize-space()='UPI']");

    private static final By email =
            By.xpath("//input[contains(@placeholder,'upi') or contains(@placeholder,'UPI') or contains(@placeholder,'okhdfcbank') or contains(@placeholder,'@')]");

    private static final By verify =
            By.xpath("//button[contains(normalize-space(),'Verify') or contains(normalize-space(),'Pay') or contains(normalize-space(),'verify')]");

    private static final By success =
            By.xpath("//div[@class='alert alert-success alert-dismissible']");

    private static final By payError =
            By.xpath(
            "//*[contains(text(),'Amount Should Not Be Greater Than Balance')] | " +
            "//*[contains(text(),'Invalid Amount')]");

    private static final By frame =
            By.tagName("iframe");


    public static By getLogin() {
        return login;
    }

    public static By getUserLogin() {
        return userLogin;
    }

    public static By getSignup() {
        return signup;
    }

    public static By getPathologyMenu() {
        return pathologyMenu;
    }

    public static By getSearch() {
        return search;
    }

    public static By getFilter() {
        return filter;
    }

    public static By getTable() {
        return table;
    }

    public static By getNotFound() {
        return notFound;
    }

    public static By getPayButton() {
        return payButton;
    }

    public static By getPayAmount() {
        return payAmount;
    }

    public static By getAdd() {
        return add;
    }

    public static By getMakePayment() {
        return makePayment;
    }

    public static By getMobile() {
        return mobile;
    }

    public static By getContinueButton() {
        return continueButton;
    }

    public static By getUpi() {
        return upi;
    }

    public static By getEmail() {
        return email;
    }

    public static By getVerify() {
        return verify;
    }

    public static By getSuccess() {
        return success;
    }

    public static By getPayError() {
        return payError;
    }

    public static By getFrame() {
        return frame;
    }


    public static By getBillNumber(String billNo) {
        return By.xpath("//*[contains(text(),'" + billNo + "')]");
    }
}