package pages;

import org.openqa.selenium.By;

public class ReportDownloadFrontOfficePages {


    private By recpbtn =
            By.xpath("//a[contains(text(),'Receptionist')]");


    private By subbtn =
            By.xpath("//button[@type='submit']");


    private By frontof =
            By.xpath("//li//a//span[text() = 'Front Office']");


    private By pdf =
            By.xpath("//a[contains(@class,'buttons-pdf')]");


    private By csv =
            By.xpath("//a[contains(@class,'buttons-csv')]");


    private By excel =
            By.xpath("//a[contains(@class,'buttons-excel')]");


    public By getRecpbtn() {
        return recpbtn;
    }

    public By getSubbtn() {
        return subbtn;
    }

    public By getFrontof() {
        return frontof;
    }

    public By getPdf() {
        return pdf;
    }

    public By getCsv() {
        return csv;
    }

    public By getExcel() {
        return excel;
    }
}