package pages;

import org.openqa.selenium.By;

public class ComplaintFoPages {

    private static final By receptionistButton =
            By.xpath("//a[normalize-space()='Receptionist']");

    private static final By signInButton =
            By.xpath("//button[@type='submit']");

    private static final By frontOffice =
            By.xpath("//span[text()='Front Office']");

    private static final By complaint =
            By.xpath("//a[contains(text(),'Complain')]");

    private static final By addComplaint =
            By.xpath("//a[contains(@class,'complain')]");

    private static final By complaintType =
            By.xpath("//select[@name='complaint']");

    private static final By source =
            By.xpath("//select[@name='source']");

    private static final By phone =
            By.xpath("//input[@name='contact']");

    private static final By description =
            By.xpath("//textarea");

    private static final By saveButton =
            By.xpath("//button[@id='formaddbtn']");

    private static final By complaintList =
            By.xpath("//h3[contains(@class,'titlefix')]");

    private static final By emptyFields =
            By.xpath("//*[contains(text(),'required')]");


    public static By getReceptionistButton() {
        return receptionistButton;
    }

    public static By getSignInButton() {
        return signInButton;
    }

    public static By getFrontOffice() {
        return frontOffice;
    }

    public static By getComplaint() {
        return complaint;
    }

    public static By getAddComplaint() {
        return addComplaint;
    }

    public static By getComplaintType() {
        return complaintType;
    }

    public static By getSource() {
        return source;
    }

    public static By getPhone() {
        return phone;
    }

    public static By getDescription() {
        return description;
    }

    public static By getSaveButton() {
        return saveButton;
    }

    public static By getComplaintList() {
        return complaintList;
    }

    public static By getEmptyFields() {
        return emptyFields;
    }
}