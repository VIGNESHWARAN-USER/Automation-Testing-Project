package pages;

import org.openqa.selenium.By;

public class AddPatientPage {

    private static final By inPatientMenu =
            By.xpath("//span[normalize-space()='IPD - In Patient']");

    private static final By addPatientButton =
            By.xpath("//a[@id='addp']");

    private static final By newPatientButton =
            By.xpath("//span[normalize-space()='New Patient']");

    private static final By patientName =
            By.xpath("//input[@id='name']");

    private static final By guardianName =
            By.xpath("//div[@class='col-lg-6 col-md-6 col-sm-6']//input[@name='guardian_name']");

    private static final By genderDropdown =
            By.xpath("//select[@id='addformgender']");

    private static final By dobField =
            By.xpath("//input[@id='birth_date']");

    private static final By phoneField =
            By.xpath("//input[@id='number']");

    private static final By emailField =
            By.xpath("//input[@id='addformemail']");

    private static final By addressField =
            By.xpath("//input[@name='address']");

    private static final By saveButton =
            By.xpath("//button[@id='formaddpabtn']");

    private static final By successMessage =
            By.xpath("//div[@class='toast-message']");

    private static final By validationMessage =
            By.xpath("//div[@class='toast toast-error']");

    public static By getInPatientMenu() {
        return inPatientMenu;
    }

    public static By getAddPatientButton() {
        return addPatientButton;
    }

    public static By getNewPatientButton() {
        return newPatientButton;
    }

    public static By getPatientName() {
        return patientName;
    }

    public static By getGuardianName() {
        return guardianName;
    }

    public static By getGenderDropdown() {
        return genderDropdown;
    }

    public static By getDobField() {
        return dobField;
    }

    public static By getPhoneField() {
        return phoneField;
    }

    public static By getEmailField() {
        return emailField;
    }

    public static By getAddressField() {
        return addressField;
    }

    public static By getSaveButton() {
        return saveButton;
    }

    public static By getSuccessMessage() {
        return successMessage;
    }

    public static By getValidationMessage() {
        return validationMessage;
    }
}