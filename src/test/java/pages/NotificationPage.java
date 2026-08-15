package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.DriverFactory;

public class NotificationPage {

    public NotificationPage() {
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }

    @FindBy(xpath = "//i[@class='fa fa-bell']")
    public WebElement notificationIcon;

    @FindBy(xpath = "//input[@placeholder='Search notifications']")
    public WebElement notificationSearchField;

    @FindBy(xpath = "//div[@class='sh-notif-item sh-notif-c-info']//p[@class='ttl']")
    public WebElement notificationTitle;

}