package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BloodIssuePage {
	WebDriver driver;

    public BloodIssuePage(WebDriver driver) {
        this.driver = driver;
    }
    //public By profile = By.xpath("//img[@class='topuser-image']");
    public By pathologylog = By.xpath("//span[@class='tb-signet-role']");
    public By bloodbank = By.xpath("//a[@href='https://demo.smart-hospital.in/admin/bloodbankstatus/']");
    public By status = By.xpath("//div[@class='bb-card-hdr']/*[1]");
    public By blood = By.xpath("//div[@class='bb-pill-list']/div[8]");
    public By issue = By.xpath("//button[@onclick='bloodIssueModal(8,1138)']");
    public By form = By.xpath("(//div[@class='sh-card-header'])[8]");
}