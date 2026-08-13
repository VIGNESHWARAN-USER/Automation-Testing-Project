package pages;

import org.openqa.selenium.By;

public class LoginPage {

    private static final By emailInput =
            By.xpath("//input[@id=\"al-username\"]");

    private static final By passwordInput =
            By.xpath("//input[@id=\"al-password\"]");

    private static final By signInButton =
            By.xpath("//button[@type=\"submit\"]");

    private static final By superAdmin =
            By.xpath("//button[text()=\"Super Admin\"]");

    private static final By admin =
            By.xpath("//button[text()=\"Admin\"]");

    private static final By doctor =
            By.xpath("//button[text()=\"Doctor\"]");

    private static final By pharmacist =
            By.xpath("//button[text()=\"Pharmacist\"]");

    private static final By pathologist =
            By.xpath("//button[text()=\"Pathologist\"]");

    private static final By radiologist =
            By.xpath("//button[text()=\"Radiologist\"]");

    private static final By accountant =
            By.xpath("//button[text()=\"Accountant\"]");

    private static final By receptionist =
            By.xpath("//button[text()=\"Receptionist\"]");

    private static final By nurse =
            By.xpath("//button[text()=\"Nurse\"]");

    private static final By usernameErrorMessage =
            By.xpath("//input[@name='username']/parent::div/descendant::p");

    private static final By passwordErrorMessage =
            By.xpath("//input[@name='password']/parent::div/descendant::p");

    private static final By invalidErrorMessage =
            By.xpath("//div[@class=\"alert alert-danger mt-3\"]");


    public static By getEmailInput() {
        return emailInput;
    }

    public static By getPasswordInput() {
        return passwordInput;
    }

    public static By getSignInButton() {
        return signInButton;
    }

    public static By getSuperAdmin() {
        return superAdmin;
    }

    public static By getAdmin() {
        return admin;
    }

    public static By getDoctor() {
        return doctor;
    }

    public static By getPharmacist() {
        return pharmacist;
    }

    public static By getPathologist() {
        return pathologist;
    }

    public static By getRadiologist() {
        return radiologist;
    }

    public static By getAccountant() {
        return accountant;
    }

    public static By getReceptionist() {
        return receptionist;
    }

    public static By getNurse() {
        return nurse;
    }

    public static By getUsernameErrorMessage() {
        return usernameErrorMessage;
    }

    public static By getPasswordErrorMessage() {
        return passwordErrorMessage;
    }

    public static By getInvalidErrorMessage() {
        return invalidErrorMessage;
    }
}