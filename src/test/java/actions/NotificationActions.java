package actions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.NotificationPage;
import utilities.DriverFactory;

import java.time.Duration;

public class NotificationActions {

    NotificationPage page = new NotificationPage();

    WebDriverWait wait =
            new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(10));


    public void clickNotificationOption() {

        wait.until(ExpectedConditions.elementToBeClickable(page.notificationIcon));
        page.notificationIcon.click();

        wait.until(ExpectedConditions.visibilityOf(page.notificationSearchField));
    }


    public void searchNotification(String notification) {

        wait.until(ExpectedConditions.visibilityOf(page.notificationSearchField));

        page.notificationSearchField.clear();
        page.notificationSearchField.sendKeys(notification);

        wait.until(ExpectedConditions.visibilityOf(page.notificationTitle));
    }


    public boolean isIPDNotificationDisplayed() {

        wait.until(ExpectedConditions.visibilityOf(page.notificationTitle));

        String notificationText = page.notificationTitle.getText();

        System.out.println("Notification displayed: " + notificationText);

        return notificationText.toLowerCase().contains("ipd");
    }
}