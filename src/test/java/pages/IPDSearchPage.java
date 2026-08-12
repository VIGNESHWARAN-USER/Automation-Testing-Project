package pages;

import org.openqa.selenium.By;

public class IPDSearchPage {

    private static final By ipdModule =
            By.xpath("//span[normalize-space()='IPD - In Patient']");

    private static final By searchBox =
            By.xpath("//input[@placeholder='Search...']");


    public static By getIpdModule() {
        return ipdModule;
    }

    public static By getSearchBox() {
        return searchBox;
    }
}