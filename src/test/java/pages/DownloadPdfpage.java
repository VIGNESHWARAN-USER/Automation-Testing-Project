package pages;

import org.openqa.selenium.By;

public class DownloadPdfpage {

    private static final By receptionistButton =
            By.xpath("//a[normalize-space()='Receptionist']");

    private static final By signInButton =
            By.xpath("//button[@type='submit']");

    private static final By appointmentButton =
            By.xpath("//span[normalize-space()='Appointment']");

    private static final By todayAppointment =
            By.xpath("(//ul[@class='nav nav-tabs navlistscroll']//li)[1]");

    private static final By upcomingAppointment =
            By.xpath("(//ul[@class='nav nav-tabs navlistscroll']//li)[2]");

    private static final By oldAppointment =
            By.xpath("(//ul[@class='nav nav-tabs navlistscroll']//li)[3]");

    private static final By todayExcel =
            By.xpath("(//a[@title='Excel'])[1]");

    private static final By upcomingCsv =
            By.xpath("(//a[@title='CSV'])[1]");

    private static final By oldPdf =
            By.xpath("(//a[@title='PDF'])[1]");


    public static By getReceptionistButton() {
        return receptionistButton;
    }

    public static By getSignInButton() {
        return signInButton;
    }

    public static By getAppointmentButton() {
        return appointmentButton;
    }

    public static By getTodayAppointment() {
        return todayAppointment;
    }

    public static By getUpcomingAppointment() {
        return upcomingAppointment;
    }

    public static By getOldAppointment() {
        return oldAppointment;
    }

    public static By getTodayExcel() {
        return todayExcel;
    }

    public static By getUpcomingCsv() {
        return upcomingCsv;
    }

    public static By getOldPdf() {
        return oldPdf;
    }
}