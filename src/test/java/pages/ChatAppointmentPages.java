package pages;

import org.openqa.selenium.By;

public class ChatAppointmentPages {

    private static final By receptionistButton =
            By.xpath("//div[contains(@class,'lp-demo-grid')]/descendant::button[normalize-space()='Receptionist']");

    private static final By signInButton =
            By.xpath("//form[.//input[@name='ci_csrf_token']]/descendant::button[normalize-space()='Sign In']");

    private static final By appointmentButton =
            By.xpath("//a[@data-tooltip='Appointment']");

    private static final By chatButton =
    		By.xpath( "//ul[contains(@class,'dropdown-menu') and contains(@class,'show')]//a[contains(@href,'/admin/chat')]");
    
    private static final By person =  By.xpath(
    	    "//li[contains(@class,'contact')]//p[contains(@class,'name') and normalize-space()='Super Admin (Staff)']"
    		);
           
    private static final By message =
            By.xpath("//div[@class='wrap relative']/child::input");

    private static final By sendMessage =
            By.xpath("//button[@class='submit input_submit']");

    private static final By check =
            By.xpath("//div[@class='messages']");


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