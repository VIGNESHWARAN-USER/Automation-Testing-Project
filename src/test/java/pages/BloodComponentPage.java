package pages;

import org.openqa.selenium.By;

public class BloodComponentPage {

    private static final By billing =
            By.xpath("//span[text()=' Billing']");

    private static final By bloodComponent =
            By.xpath("//p[text()='Blood Component Issue']");

    private static final By details =
            By.xpath("(//a[i[@class='fa fa-reorder']])[1]");

    private static final By patientPopup =
            By.xpath("//h4[text()='Blood Component Issue Details']");

    public static By getBilling() {
        return billing;
    }

    public static By getBloodComponent() {
        return bloodComponent;
    }

    public static By getDetails() {
        return details;
    }

    public static By getPatientPopup() {
        return patientPopup;
    }
}
