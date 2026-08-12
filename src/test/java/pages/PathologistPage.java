package pages;

import org.openqa.selenium.By;

public class PathologistPage {

    private static final By pathologistBtn =
            By.xpath("//a[normalize-space()='Pathologist'] | //button[normalize-space()='Pathologist']");

    private static final By signInBtn =
            By.xpath("//button[normalize-space()='Sign In']");

    private static final By pathologist =
            By.xpath("//a[@onclick=\"copy('harry@gmail.com', 'password')\"]/following-sibling::a[1]");

    private static final By messaging =
            By.xpath("//a[@href=\"https://demo.smart-hospital.in/admin/notification\"]/child::span");

    private static final By sendSms =
            By.xpath("//a[@href=\"https://demo.smart-hospital.in/admin/notification/add\"]/following-sibling::a");

    private static final By title =
            By.xpath("(//div[@class='form-group']/child::input)[1]");

    private static final By tempId =
            By.xpath("(//label[text()='Template Id']/following-sibling::input)[1]");

    private static final By sms =
            By.xpath("(//label[@class='checkbox-inline']/child::input)[1]");

    private static final By mobileApp =
            By.xpath("(//label[@class='checkbox-inline']/input[@value='push'])[1]");

    private static final By message =
            By.xpath("//label[text()='Message']/following-sibling::textarea[@name='group_message']");

    private static final By dtr =
            By.xpath("//input[@value='3']");

    private static final By nurse =
            By.xpath("//input[@value='9']");

    private static final By send =
            By.xpath("(//div[@class='pull-right']/child::button)[1]");

    private static final By successMessage =
            By.xpath("//div[text()='Record Saved Successfully']");

    private static final By emptyError =
            By.xpath("//div[@class='toast-message']//p[text()='Message To field is required']");

    private static final By missingFieldError =
            By.xpath("//div[@class='toast-message']//p[text()='Send Through field is required']");


    public static By getPathologistBtn() {
        return pathologistBtn;
    }

    public static By getSignInBtn() {
        return signInBtn;
    }

    public static By getPathologist() {
        return pathologist;
    }

    public static By getMessaging() {
        return messaging;
    }

    public static By getSendSms() {
        return sendSms;
    }

    public static By getTitle() {
        return title;
    }

    public static By getTempId() {
        return tempId;
    }

    public static By getSms() {
        return sms;
    }

    public static By getMobileApp() {
        return mobileApp;
    }

    public static By getMessage() {
        return message;
    }

    public static By getDtr() {
        return dtr;
    }

    public static By getNurse() {
        return nurse;
    }

    public static By getSend() {
        return send;
    }

    public static By getSuccessMessage() {
        return successMessage;
    }

    public static By getEmptyError() {
        return emptyError;
    }

    public static By getMissingFieldError() {
        return missingFieldError;
    }
}