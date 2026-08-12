package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ApplyLeavePage {
	WebDriver driver;

    public ApplyLeavePage(WebDriver driver) {
        this.driver = driver;
    }
    public By humanRes = By.xpath("//a[@href=\"https://demo.smart-hospital.in/admin/staff\"]/span[text()='Human Resource']");
    public By leaves = By.xpath("//div[@class='box-tools pull-right']/a");
    public By applyLeave = By.xpath("//small[@class='pull-right']/a[@href]");
    public By leaveType = By.xpath("//div[@id='leavetypeddl']/select[@name]");
    public By sick = By.xpath("//select[@name]/option[text()='Sick Leave (15)']");
    public By leaveFrom = By.xpath("//tr/td[text()='29']");
    public By leaveTo = By.xpath("//tr/td[text()='30']");
    public By reason = By.xpath("//div[@class]/textarea[@name='reason']");
    public By savebtn = By.xpath("(//div[@class='modal-footer']/button[@type='submit'])[1]");
}