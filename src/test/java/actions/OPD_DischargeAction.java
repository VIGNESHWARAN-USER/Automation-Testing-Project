package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.OPDPage;
import utilities.CSVReaderUtil;

import java.time.Duration;
import java.util.Map;

public class OPD_DischargeAction {

    WebDriver driver;
    WebDriverWait wait;

    public OPD_DischargeAction(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickPatientIDLink() {
        wait.until(ExpectedConditions.elementToBeClickable(OPDPage.getRevert())).click();
        wait.until(ExpectedConditions.elementToBeClickable(OPDPage.getOpdOutPatientNavLink())).click();
        
    }

    public void clickDischargeIcon() {
        wait.until(ExpectedConditions.elementToBeClickable(OPDPage.getDischargeIcon())).click();
    }

    public void fillDischargeForm() throws Exception {

        Map<String, String> data =
                CSVReaderUtil.getTestDataByTestCase("discharge_data", "DischargePatient");

        // Date
        WebElement dateInput = wait.until(ExpectedConditions
                .visibilityOfElementLocated(OPDPage.getDateField()));
        dateInput.clear();
        dateInput.sendKeys(data.get("date"));

        // Reason 
        Select reasonSelect = new Select(
                driver.findElement(OPDPage.getReasonDropDown()));
        reasonSelect.selectByVisibleText(data.get("reason"));

        // Text areas
        driver.findElement(OPDPage.getNoteField()).sendKeys(data.get("note"));
        driver.findElement(OPDPage.getOperationField()).sendKeys(data.get("operation"));
        driver.findElement(OPDPage.getDiagnosisField()).sendKeys(data.get("diagnosis"));
        driver.findElement(OPDPage.getInvestigationField()).sendKeys(data.get("investigation"));
    }

    public void clickSaveDischargeButton() {
        wait.until(ExpectedConditions
                .elementToBeClickable(OPDPage.getSaveDischargeButton()))
                .click();
    }

    public boolean isSuccessMessageDisplayed() {
        try {
            return wait.until(ExpectedConditions
                    .visibilityOfElementLocated(OPDPage.getSuccessMessage()))
                    .isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}