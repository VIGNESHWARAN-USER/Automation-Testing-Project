package actions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.ChatAppointmentPages;
import utilities.HelperClass;

public class ChatAppointmentActions extends BaseAction {

    WebDriver driver;
    WebDriverWait wait;

    public ChatAppointmentActions(WebDriver driver) {

        super(driver);

        this.driver = driver;

        wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(10));
    }

    public void clickrecp() {

        HelperClass.logger.info("Clicking receptionist");

        click(ChatAppointmentPages.getReceptionistButton());
    }


    public void clicksignin() {

        HelperClass.logger.info("Clicking signin");

        click(ChatAppointmentPages.getSignInButton());
    }


    public void clickappointment() {

        HelperClass.logger.info("Clicking appointment section");

        click(ChatAppointmentPages.getAppointmentButton());
    }


    public void clickchaticon() {

        HelperClass.logger.info("Clicking chat icon");

        click(ChatAppointmentPages.getChatButton());
    }


    public void selectdoctor() {

        HelperClass.logger.info("Selecting doctor");

        click(ChatAppointmentPages.getPerson());
    }


    public void sendmessage() {

        HelperClass.logger.info("Sending message");

        sendKeys(
                ChatAppointmentPages.getMessage(),
                "Hello Doctor");

        click(ChatAppointmentPages.getSendMessage());
    }


    public boolean verifymessage() {

        HelperClass.logger.info("Verifying message");

        return isDisplayed(ChatAppointmentPages.getCheck());
    }
}