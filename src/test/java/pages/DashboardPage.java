package pages;

import org.openqa.selenium.By;

public class DashboardPage {

    private static final By profileIcon =
            By.xpath("//img[@class=\"topuser-image\"]");

    private static final By role =
            By.xpath("//div[@class=\"sstopuser-test\"]/h5");


    public static By getProfileIcon() {
        return profileIcon;
    }

    public static By getRole() {
        return role;
    }
}