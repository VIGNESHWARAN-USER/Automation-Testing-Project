package pages;

import org.openqa.selenium.By;

public class ChatAppointmentPages {

    private static final By receptionistButton =
            By.xpath("//a[normalize-space()='Receptionist']");

    private static final By signInButton =
            By.xpath("//button[@type='submit']");

    private static final By appointmentButton =
            By.xpath("//span[normalize-space()='Appointment']");

    private static final By chatButton =
            By.xpath("//i[@class='fa fa-whatsapp']");

    private static final By person =
            By.xpath("//p[contains(text(),'Super Admin')]");

    private static final By message =
            By.xpath("//input[@placeholder='Write Your Message...']");

    private static final By sendMessage =
            By.xpath("//i[@class='fa fa-paper-plane']");

    private static final By check =
            By.xpath("//p[@class='name'][contains(text(),'Super Admin')]");


    public static By getReceptionistButton() {
        return receptionistButton;
    }

    public static By getSignInButton() {
        return signInButton;
    }

    public static By getAppointmentButton() {
        return appointmentButton;
    }

    public static By getChatButton() {
        return chatButton;
    }

    public static By getPerson() {
        return person;
    }

    public static By getMessage() {
        return message;
    }

    public static By getSendMessage() {
        return sendMessage;
    }

    public static By getCheck() {
        return check;
    }
}