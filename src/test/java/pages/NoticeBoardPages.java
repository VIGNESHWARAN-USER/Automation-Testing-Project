package pages;

import org.openqa.selenium.By;

public class NoticeBoardPages {

    private static final By notice =
            By.xpath("(//div[contains(@class,'dashalert')]//a)[1]");

    private static final By noticeDisplay =
            By.xpath("//h3[contains(text(),'Notice Board')]");


    public static By getNotice() {
        return notice;
    }

    public static By getNoticeDisplay() {
        return noticeDisplay;
    }
}