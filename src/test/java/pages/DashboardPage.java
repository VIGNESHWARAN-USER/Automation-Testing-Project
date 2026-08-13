package pages;

import org.openqa.selenium.By;

public class DashboardPage {

    private static final By profileIcon =
            By.xpath("//div[@class=\"tb-signet-text\"]");

    private static final By role =
            By.xpath("//div[@class=\"text-muted small\"]");


    public static By getProfileIcon() {
        return profileIcon;
    }

    public static By getRole() {
        return role;
    }
}