package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BloodIssuePage {
	WebDriver driver;

    public BloodIssuePage(WebDriver driver) {
        this.driver = driver;
    }
    public By profile = By.xpath("//img[@class='topuser-image']");
    public By pathologylog = By.xpath("//h5[text()='Pathologist']");
    public By bloodbank = By.xpath("//a[@href='https://demo.smart-hospital.in/admin/bloodbankstatus/']");
    public By blood = By.xpath("(//a[@onclick='getBloodListTable(this.id)'])[8]");
    public By status = By.xpath("//h3[text()='Blood Bank Status']");
    public By issue = By.xpath("//button[@onclick='bloodIssueModal(8,1138)']");
    public By form = By.xpath("(//div[@class='box-body'])[1]");
}