package pages;

import org.openqa.selenium.By;

public class ProfilePage {

    private By profileButton =
            By.xpath("//div[@class='sspass']//a[1]");

    private By role =
            By.xpath("//div[@class='col-lg-2 col-md-4 col-sm-4 border-right'][2]/span");

    private By leaveButton =
            By.xpath("//ul[@class='nav nav-tabs navlistscroll']//child::li[2]/child::a");

    private By leaveTable =
            By.id("DataTables_Table_2");


    public By getProfileButton() {
        return profileButton;
    }

    public By getRole() {
        return role;
    }

    public By getLeaveButton() {
        return leaveButton;
    }

    public By getLeaveTable() {
        return leaveTable;
    }
}