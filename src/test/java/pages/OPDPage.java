package pages;

import org.openqa.selenium.By;

public class OPDPage {

    private static final By opdButton =
            By.xpath("//ul[@class='sidebar-menu verttop']/li[5]/child::a");

    private static final By oldOpdTab =
            By.xpath("//ul[@class='nav nav-tabs navlistscroll']/li[3]/child::*");

    private static final By searchBox =
            By.xpath("//div[@id='DataTables_Table_1_filter']/label/input");

    private static final By patientName =
            By.xpath("//table[@id='DataTables_Table_1']/tbody/tr[1]/td[text()='Maria Taylor']");

    private static final By searchFailed =
            By.xpath("//td[@class='dataTables_empty']");


    // Report Download

    private static final By opdOutPatientNavLink =
            By.xpath("//table[@id='DataTables_Table_1']/tbody/tr[1]/td[1]/child::a");

    private static final By visitsTab =
            By.xpath("//ul[@class='nav nav-tabs border-0 navlistscroll']/li[2]/child::a");

    private static final By printIcon =
            By.xpath("//a[contains(@class,'buttons-pdf') and @aria-controls='DataTables_Table_1']");


    // Add Patient

    private static final By addPatientButton =
            By.xpath("//div[@id='tab_2']/child::div/a");

    private static final By addIcon =
            By.xpath("//div[@id='myModal']/child::div/div/div/div/div/a");

    private static final By nameField =
            By.id("name");

    private static final By genderDropdown =
            By.id("addformgender");

    private static final By yearField =
            By.id("age_year");

    private static final By monthField =
            By.id("age_month");

    private static final By dayField =
            By.id("age_day");

    private static final By saveButton =
            By.cssSelector("div.pull-right button#formaddpabtn");

    private static final By successMessage =
            By.cssSelector("div#toast-container div.toast-success");

    private static final By nameErrorMessage =
            By.cssSelector("div#toast-container div.toast-error");


    // Discharge

    private static final By revert =
            By.xpath("//div[@class='editviewdelete-icon pt8 text-center']/child::a[4]");

    private static final By dischargeIcon =
            By.xpath("//div[@class='pull-right']/div/child::a[3]");

    private static final By dateField =
            By.xpath("//form[@id='patient_discharge']/child::div[2]/child::div[1]/child::*/child::input");

    private static final By reasonDropDown =
            By.xpath("//form[@id='patient_discharge']/child::div[2]/child::div[2]/child::*/child::select");

    private static final By noteField =
            By.xpath("//textarea[@id='note']");

    private static final By operationField =
            By.xpath("//textarea[@id='operation']");

    private static final By diagnosisField =
            By.xpath("//textarea[@id='diagnosis']");

    private static final By investigationField =
            By.xpath("//textarea[@id='investigations']");

    private static final By saveDischargeButton =
            By.xpath("//div[@class='pull-right']/button[@id='add_paymentbtn']");


    public static By getOpdButton() {
        return opdButton;
    }

    public static By getOldOpdTab() {
        return oldOpdTab;
    }

    public static By getSearchBox() {
        return searchBox;
    }

    public static By getPatientName() {
        return patientName;
    }

    public static By getSearchFailed() {
        return searchFailed;
    }

    public static By getOpdOutPatientNavLink() {
        return opdOutPatientNavLink;
    }

    public static By getVisitsTab() {
        return visitsTab;
    }

    public static By getPrintIcon() {
        return printIcon;
    }

    public static By getAddPatientButton() {
        return addPatientButton;
    }

    public static By getAddIcon() {
        return addIcon;
    }

    public static By getNameField() {
        return nameField;
    }

    public static By getGenderDropdown() {
        return genderDropdown;
    }

    public static By getYearField() {
        return yearField;
    }

    public static By getMonthField() {
        return monthField;
    }

    public static By getDayField() {
        return dayField;
    }

    public static By getSaveButton() {
        return saveButton;
    }

    public static By getSuccessMessage() {
        return successMessage;
    }

    public static By getNameErrorMessage() {
        return nameErrorMessage;
    }

    public static By getRevert() {
        return revert;
    }

    public static By getDischargeIcon() {
        return dischargeIcon;
    }

    public static By getDateField() {
        return dateField;
    }

    public static By getReasonDropDown() {
        return reasonDropDown;
    }

    public static By getNoteField() {
        return noteField;
    }

    public static By getOperationField() {
        return operationField;
    }

    public static By getDiagnosisField() {
        return diagnosisField;
    }

    public static By getInvestigationField() {
        return investigationField;
    }

    public static By getSaveDischargeButton() {
        return saveDischargeButton;
    }
}