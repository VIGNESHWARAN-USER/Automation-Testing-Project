package pages;

import org.openqa.selenium.By;

public class IPDPdfDownloadPage {

    private static final By ipdMenu =
            By.xpath("//span[normalize-space()='IPD - In Patient']");

    private static final By pdfButton =
            By.xpath("//i[@class='fa fa-file-pdf-o']");


    public static By getIpdMenu() {
        return ipdMenu;
    }

    public static By getPdfButton() {
        return pdfButton;
    }
}