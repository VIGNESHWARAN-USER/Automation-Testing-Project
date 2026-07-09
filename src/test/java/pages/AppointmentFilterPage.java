package pages;

import org.openqa.selenium.By;

public class AppointmentFilterPage {

    private static final By receptionistButton =
            By.xpath("//div[@class='form-bottom']//a[text()='Receptionist']");

    private static final By submitButton =
            By.xpath("//button[@type='submit']");

    private static final By appointmentMenu =
            By.xpath("//li//a//span[text()='Appointment']");

    private static final By todayAppointmentFilter =
            By.xpath("//ul[contains(@class,'navlistscroll')]//a[normalize-space()='Today Appointment']");

    private static final By upcomingAppointmentFilter =
            By.xpath("//ul[contains(@class,'navlistscroll')]//a[normalize-space()='Upcoming Appointment']");

    private static final By oldAppointmentFilter =
            By.xpath("//ul[contains(@class,'navlistscroll')]//a[normalize-space()='Old Appointment']");

    private static final By appointmentRows =
            By.xpath("//table/tbody/tr");

    private static final By verify =
            By.xpath("//span[@class='logo-lg']");

    public static By getReceptionistButton() {
        return receptionistButton;
    }

    public static By getSubmitButton() {
        return submitButton;
    }

    public static By getAppointmentMenu() {
        return appointmentMenu;
    }

    public static By getTodayAppointmentFilter() {
        return todayAppointmentFilter;
    }

    public static By getUpcomingAppointmentFilter() {
        return upcomingAppointmentFilter;
    }

    public static By getOldAppointmentFilter() {
        return oldAppointmentFilter;
    }

    public static By getAppointmentRows() {
        return appointmentRows;
    }

    public static By getVerify() {
        return verify;
    }
}