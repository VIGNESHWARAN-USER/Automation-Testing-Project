package pages;

import org.openqa.selenium.By;

public class PatientCertificatePage {

    // MENU

    private static final By certificateMenu =
            By.xpath("//span[contains(text(),'Certificate')]");

    private static final By certificateSubMenu =
            By.xpath("//a[@href='https://demo.smart-hospital.in/admin/generatecertificate']");


    // DROPDOWNS

    private static final By moduleDropdown =
            By.id("module");

    private static final By patientStatusDropdown =
            By.id("patient_status");

    private static final By certificateTemplateDropdown =
            By.id("certificate_template");


    // BUTTONS

    private static final By searchButton =
            By.xpath("//button[contains(text(),'Search')]");

    private static final By pdfButton =
            By.xpath("//button[contains(text(),'PDF')]");


    // TABLE

    private static final By patientRows =
            By.xpath("//table/tbody/tr");


    public static By getCertificateMenu() {
        return certificateMenu;
    }

    public static By getCertificateSubMenu() {
        return certificateSubMenu;
    }

    public static By getModuleDropdown() {
        return moduleDropdown;
    }

    public static By getPatientStatusDropdown() {
        return patientStatusDropdown;
    }

    public static By getCertificateTemplateDropdown() {
        return certificateTemplateDropdown;
    }

    public static By getSearchButton() {
        return searchButton;
    }

    public static By getPdfButton() {
        return pdfButton;
    }

    public static By getPatientRows() {
        return patientRows;
    }
}