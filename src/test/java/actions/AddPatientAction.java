package actions;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.AddPatientPage;
import utilities.DriverFactory;

public class AddPatientAction extends DriverFactory {

    public void clickInPatient() {
        getDriver().findElement(AddPatientPage.getInPatientMenu()).click();
    }

    public void clickAddPatient() {

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

        WebElement addPatientBtn = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        AddPatientPage.getAddPatientButton()));

        ((JavascriptExecutor) getDriver()).executeScript(
                "arguments[0].scrollIntoView({block:'center'});",
                addPatientBtn);

        try {
            addPatientBtn.click();
        } catch (Exception e) {
            ((JavascriptExecutor) getDriver()).executeScript(
                    "arguments[0].click();",
                    addPatientBtn);
        }
    }

    public void clickNewPatient() {
        getDriver().findElement(AddPatientPage.getNewPatientButton()).click();
    }

    public void clickSave() {
        getDriver().findElement(AddPatientPage.getSaveButton()).click();
    }

    public void enterPatientName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            getDriver().findElement(AddPatientPage.getPatientName()).clear();
            getDriver().findElement(AddPatientPage.getPatientName()).sendKeys(name);
        }
    }

    public void enterGuardianName(String guardian) {
        if (guardian != null && !guardian.trim().isEmpty()) {
            getDriver().findElement(AddPatientPage.getGuardianName()).clear();
            getDriver().findElement(AddPatientPage.getGuardianName()).sendKeys(guardian);
        }
    }

    public void selectGender(String gender) {
        if (gender != null && !gender.trim().isEmpty()) {
            Select select = new Select(
                    getDriver().findElement(AddPatientPage.getGenderDropdown()));
            select.selectByVisibleText(gender);
        }
    }

    public void enterDOB(String dob) {
        if (dob != null && !dob.trim().isEmpty()) {
            getDriver().findElement(AddPatientPage.getDobField()).clear();
            getDriver().findElement(AddPatientPage.getDobField()).sendKeys(dob);
        }
    }

    public void enterPhone(String phone) {
        if (phone != null && !phone.trim().isEmpty()) {
            getDriver().findElement(AddPatientPage.getPhoneField()).clear();
            getDriver().findElement(AddPatientPage.getPhoneField()).sendKeys(phone);
        }
    }

    public void enterEmail(String email) {
        if (email != null && !email.trim().isEmpty()) {
            getDriver().findElement(AddPatientPage.getEmailField()).clear();
            getDriver().findElement(AddPatientPage.getEmailField()).sendKeys(email);
        }
    }

    public void enterAddress(String address) {
        if (address != null && !address.trim().isEmpty()) {
            getDriver().findElement(AddPatientPage.getAddressField()).clear();
            getDriver().findElement(AddPatientPage.getAddressField()).sendKeys(address);
        }
    }

    public boolean successMessageDisplayed() {

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        AddPatientPage.getSuccessMessage()))
                .isDisplayed();
    }

    public boolean validationMessageDisplayed() {

        try {
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));

            return wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            AddPatientPage.getValidationMessage()))
                    .isDisplayed();

        } catch (Exception e) {
            return false;
        }
    }
}