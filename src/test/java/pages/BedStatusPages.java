package pages;

import org.openqa.selenium.By;

public class BedStatusPages {

    private static final By receptionistButton =By.xpath("//button[normalize-space()='Receptionist']");
    private static final By signInButton =By.xpath("//form//child::button[@type='submit']");
    private static final By appointmentButton =
            By.xpath("//span[normalize-space()='Appointment']");
    private static final By bedStatusButton =
            By.xpath("//i[contains(@class,'fa-bed')]/parent::a");
    private static final By room =
            By.xpath("(//div/child::i[contains(@class,'fa-bed')])[5]");
    private static final By gender =
            By.xpath("//td[contains(text(),'Gender')]/following-sibling::td");
    public static By getReceptionistButton() {
        return receptionistButton;
    }
    public static By getSignInButton() {
        return signInButton;
    }
    public static By getAppointmentButton() {
        return appointmentButton;
    }
    public static By getBedStatusButton() {
        return bedStatusButton;
    }
    public static By getRoom() {
        return room;
    }
    public static By getGender() {
        return gender;
    }
}