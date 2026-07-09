package pages;

import org.openqa.selenium.By;

public class AddVisitorPages {

    private static final By frontOffice =
            By.xpath("//span[normalize-space()='Front Office']");

    private static final By addVisitorBtn =
            By.xpath("//a[contains(@class,'addvisitor')]");

    private static final By select =
            By.xpath("//form[@id='formadd']//select[@name='purpose']");

    private static final By visitorName =
            By.xpath("(//input[@type='text'])[1]");

    private static final By phoneNumber =
            By.xpath("(//input[@type='text'])[2]");

    private static final By purpose =
            By.xpath("(//select)[1]");

    private static final By personToVisit =
            By.xpath("(//select)[2]");

    private static final By checkinDate =
            By.xpath("//input[contains(@id,'date')]");

    private static final By noOfPersons =
            By.xpath("//input[contains(@id,'pepple')]");

    private static final By idCard =
            By.xpath("//input[contains(@id,'id_card')]");

    private static final By note =
            By.xpath("//textarea");

    private static final By saveBtn =
            By.xpath("//button[@type='submit']");

    private static final By successMsg =
            By.xpath("//*[contains(text(),'Record Saved Successfully')]");

    private static final By validationMessage =
            By.xpath("//*[contains(@class,'text-danger')]");

    public static By getFrontOffice() {
        return frontOffice;
    }

    public static By getAddVisitorBtn() {
        return addVisitorBtn;
    }

    public static By getSelect() {
        return select;
    }

    public static By getVisitorName() {
        return visitorName;
    }

    public static By getPhoneNumber() {
        return phoneNumber;
    }

    public static By getPurpose() {
        return purpose;
    }

    public static By getPersonToVisit() {
        return personToVisit;
    }

    public static By getCheckinDate() {
        return checkinDate;
    }

    public static By getNoOfPersons() {
        return noOfPersons;
    }

    public static By getIdCard() {
        return idCard;
    }

    public static By getNote() {
        return note;
    }

    public static By getSaveBtn() {
        return saveBtn;
    }

    public static By getSuccessMsg() {
        return successMsg;
    }

    public static By getValidationMessage() {
        return validationMessage;
    }
}