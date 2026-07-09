package actions;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.OPDPage;
import utilities.ExcelUtility;
import utilities.HelperClass;

public class OPD_AddPatientActions extends BaseAction {

    WebDriverWait wait;

    private static final String FILE_PATH  = "src/test/resources/testdata/OPDTestData.xlsx";
    private static final String SHEET_NAME = "Sheet1";

    public OPD_AddPatientActions(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void clickAddPatientButton() {
        wait.until(ExpectedConditions.elementToBeClickable(OPDPage.getAddPatientButton()));
        click(OPDPage.getAddPatientButton());
        HelperClass.logger.info("Clicked on Add Patient button");
    }

    public void clickAddIcon() {
        wait.until(ExpectedConditions.elementToBeClickable(OPDPage.getAddIcon()));
        click(OPDPage.getAddIcon());
         HelperClass.logger.info("Clicked on Add Icon");
    }

    public void fillPatientForm(Map<String, String> data) {
        String name   = data.get("Name");
        String gender = data.get("Gender");
        String year   = data.get("Year");
        String month  = data.get("Month");
        String day    = data.get("Day");

        wait.until(ExpectedConditions.visibilityOfElementLocated(OPDPage.getNameField()));

        if (name != null && !name.isBlank()) {
            sendKeys(OPDPage.getNameField(), name);
        }
        if (gender != null && !gender.isBlank()) {
            WebElement genderEl = driver.findElement(OPDPage.getGenderDropdown());
            new Select(genderEl).selectByVisibleText(gender);
        }
        if (year  != null && !year.isBlank())  sendKeys(OPDPage.getYearField(),  year);
        if (month != null && !month.isBlank()) sendKeys(OPDPage.getMonthField(), month);
        if (day   != null && !day.isBlank())   sendKeys(OPDPage.getDayField(),   day);
    }

    public void fillPatientFormFromExcel() throws Exception {
        Map<String, String> data = new HashMap<>();

        data.put("Name",   ExcelUtility.getCellData(FILE_PATH, SHEET_NAME, 1, 1));
        data.put("Gender", ExcelUtility.getCellData(FILE_PATH, SHEET_NAME, 2, 1));
        data.put("Year",   ExcelUtility.getCellData(FILE_PATH, SHEET_NAME, 3, 1));
        data.put("Month",  ExcelUtility.getCellData(FILE_PATH, SHEET_NAME, 4, 1));
        data.put("Day",    ExcelUtility.getCellData(FILE_PATH, SHEET_NAME, 5, 1));

        System.out.println("Excel Data Loaded: " + data);

        fillPatientForm(data);
    }

    public void clickSave() {
        click(OPDPage.getSaveButton());
         HelperClass.logger.info("Clicked on Save button");
    }

    public boolean isSuccessMessageDisplayed() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(OPDPage.getSuccessMessage()));
            HelperClass.logger.info("Success message is displayed");
            return true;
        } catch (Exception e) {
        	HelperClass.logger.warn("Success message is NOT displayed");
            return false;
        }
    }

    public boolean isNameErrorDisplayed() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(OPDPage.getNameErrorMessage()));
            HelperClass.logger.info("error message is displayed");
            return true;
        } catch (Exception e) {
        	HelperClass.logger.warn("error message is NOT displayed");
            return false;
        }
    }
}