package pages;

import org.openqa.selenium.By;

public class PostalPages {

    private static final By receptionistButton =
            By.cssSelector(".btn.btn-primary.width50[href='#'][onclick=\\\"copy('maria@gmail.com', 'password')\\\"]");

    private static final By signInButton =
            By.xpath("//button[@type='submit']");

    private static final By frontOffice =
            By.xpath(
            "//li//a//span[text()='Front Office'] | " +
            "//span[contains(text(),'Front Office')] | " +
            "//li/a/span[contains(.,'Front Office')]");

    private static final By postButton =
            By.xpath("//button[@id='dropdownMenu1']");

    private static final By dispatch =
            By.xpath("//a[normalize-space()='Dispatch']");

    private static final By addDispatch =
            By.xpath("//a[@class='btn btn-primary btn-sm adddispatch']");

    private static final By title =
            By.xpath("//input[@fdprocessedid='iosxt']");

    private static final By saveButton =
            By.xpath("//button[@id='formaddbtn']");

    private static final By list =
            By.xpath("//h3[@class='box-title titlefix']");


    public static By getReceptionistButton() {
        return receptionistButton;
    }

    public static By getSignInButton() {
        return signInButton;
    }

    public static By getFrontOffice() {
        return frontOffice;
    }

    public static By getPostButton() {
        return postButton;
    }

    public static By getDispatch() {
        return dispatch;
    }

    public static By getAddDispatch() {
        return addDispatch;
    }

    public static By getTitle() {
        return title;
    }

    public static By getSaveButton() {
        return saveButton;
    }

    public static By getList() {
        return list;
    }

}
