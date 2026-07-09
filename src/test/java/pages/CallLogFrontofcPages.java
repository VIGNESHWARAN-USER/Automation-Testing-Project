package pages;

import org.openqa.selenium.By;

public class CallLogFrontofcPages {

    private static final By receptionistButton =
            By.cssSelector(".btn.btn-primary.width50[href='#'][onclick=\\\"copy('maria@gmail.com', 'password')\\\"]");

    private static final By signInButton =
            By.xpath("//button[@type='submit']");

    private static final By frontOffice =
            By.xpath("//li//a//span[text()='Front Office'] | //span[contains(text(),'Front Office')] | //li/a/span[contains(.,'Front Office')]");

    private static final By phoneCallLog =
            By.xpath("//div[@class='box-tools pull-right']//a[@href='https://demo.smart-hospital.in/admin/generalcall']");

    private static final By addLog =
            By.xpath("//a[@class='btn btn-primary btn-sm call_log']");

    private static final By name =
            By.xpath("//form[@id='formadd']//input[@name='name']");

    private static final By phone =
            By.xpath("//form[@id='formadd']//input[@name='contact']");

    private static final By description =
            By.xpath("//label[text()='Description']//following-sibling::textarea[@id='description']");

    private static final By callDuration =
            By.xpath("//form[@id='formadd']//input[@name='call_dureation']");

    private static final By note =
            By.xpath("//label[text()='Note']//following-sibling::textarea[@id='description']");

    private static final By incoming =
            By.xpath("//form[@id='formadd']//input[@name='call_type' and @value='Incoming']");

    private static final By outgoing =
            By.xpath("//form[@id='formadd']//input[@name='call_type' and @value='Outgoing']");

    private static final By saveButton =
            By.xpath("//button[@id='formaddbtn']");

    private static final By checklist =
            By.xpath("//h3[@class='box-title titlefix']");

    private static final By error =
            By.xpath("//h3[@class='box-title titlefix']");

    public static By getReceptionistButton() { return receptionistButton; }

    public static By getSignInButton() { return signInButton; }

    public static By getFrontOffice() { return frontOffice; }

    public static By getPhoneCallLog() { return phoneCallLog; }

    public static By getAddLog() { return addLog; }

    public static By getName() { return name; }

    public static By getPhone() { return phone; }

    public static By getDescription() { return description; }

    public static By getCallDuration() { return callDuration; }

    public static By getNote() { return note; }

    public static By getIncoming() { return incoming; }

    public static By getOutgoing() { return outgoing; }

    public static By getSaveButton() { return saveButton; }

    public static By getChecklist() { return checklist; }

    public static By getError() { return error; }
}