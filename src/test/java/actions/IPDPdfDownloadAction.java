package actions;

import org.openqa.selenium.WebDriver;

import pages.IPDPdfDownloadPage;
import utilities.DriverFactory;

public class IPDPdfDownloadAction extends BaseAction {

    WebDriver driver;

    public IPDPdfDownloadAction() {

        super(DriverFactory.getDriver());

        this.driver = DriverFactory.getDriver();
    }

    public void clickIPDMenu() {

        clickfb(getElement(IPDPdfDownloadPage.getIpdMenu()));
    }

    public void clickPdfButton() {

        clickfb(getElement(IPDPdfDownloadPage.getPdfButton()));
    }
}
