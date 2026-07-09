package pages;

import org.openqa.selenium.By;

public class CertificatePage {

    private static final By certificateMenu =
            By.xpath("//span[normalize-space()='Certificate']");

    private static final By certificateSubMenu =
            By.xpath("//a[contains(@href,'generatecertificate')]");

    private static final By moduleDropdown =
            By.id("module");

    private static final By patientStatusDropdown =
            By.id("patient_status");

    private static final By certificateTemplateDropdown =
            By.name("certificate_id");

    private static final By searchButton =
            By.xpath("//button[contains(.,'Search')]");

    private static final By generateButton =
            By.xpath("//button[contains(@title,'generate')]");

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

    public static By getGenerateButton() {
        return generateButton;
    }
}