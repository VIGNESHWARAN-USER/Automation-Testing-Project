package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import pages.PrescriptionPage;


public class PrescriptionAction extends BaseAction {

    private final WebDriver driver;

    public PrescriptionAction(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void clickIPDMenu() {
        jsClick(PrescriptionPage.getIpdMenu());
        waitForVisibility(PrescriptionPage.getPatientSearchBox());
    }

    public void searchPatientByIPD(String ipdNumber) {
        sendKeys(PrescriptionPage.getPatientSearchBox(), ipdNumber);
        waitForVisibility(PrescriptionPage.getPatientByIPD(ipdNumber));
    }

    public boolean isCorrectPatientDisplayed(String ipdNumber) {
        try {
            return waitForVisibility(PrescriptionPage.getPatientByIPD(ipdNumber))
                    .getText().trim().contains(ipdNumber);
        } catch (Exception e) {
            return false;
        }
    }

    public void clickIPDNumber(String ipdNumber) {
        try {
            jsClick(PrescriptionPage.getClick128Tab());
        } catch (Exception e) {
            jsClick(PrescriptionPage.getIpdNumber(ipdNumber));
        }
    }

    public void clickPrescriptionTab() {
        jsClick(PrescriptionPage.getPrescriptionTab());
        waitForClickable(PrescriptionPage.getPrescriptionButton());
        jsClick(PrescriptionPage.getPrescriptionButton());
        waitForVisibility(PrescriptionPage.getAddPrescriptionButton());
    }

    public void clickAddPrescription() {
        waitForClickable(PrescriptionPage.getAddPrescriptionButton());
        jsClick(PrescriptionPage.getAddPrescriptionButton());
        wait.until(ExpectedConditions.presenceOfElementLocated(PrescriptionPage.getHeaderNote()));
    }

    private void typeInWysihtml5(By iframeLocator, String value) {
        if (value == null || value.trim().isEmpty()) return;

        driver.switchTo().defaultContent();

        try {
            WebElement iframe = wait.until(
                ExpectedConditions.presenceOfElementLocated(iframeLocator));

            js.executeScript("arguments[0].scrollIntoView({block:'center'});", iframe);
            wait.until(ExpectedConditions.visibilityOfElementLocated(iframeLocator));

            driver.switchTo().frame(iframe);

            WebElement body = wait.until(
                ExpectedConditions.presenceOfElementLocated(PrescriptionPage.getFrameBody()));

            js.executeScript("arguments[0].focus();", body);
            js.executeScript("arguments[0].click();", body);

            wait.until(ExpectedConditions.visibilityOf(body));

            js.executeScript("arguments[0].innerHTML='';", body);
            body.sendKeys(value);

        } catch (org.openqa.selenium.StaleElementReferenceException e) {
            driver.switchTo().defaultContent();

            WebElement iframe = wait.until(
                ExpectedConditions.visibilityOfElementLocated(iframeLocator));

            driver.switchTo().frame(iframe);

            WebElement body = wait.until(
                ExpectedConditions.presenceOfElementLocated(PrescriptionPage.getFrameBody()));

            js.executeScript("arguments[0].focus();", body);
            js.executeScript("arguments[0].click();", body);
            js.executeScript("arguments[0].innerHTML='';", body);
            body.sendKeys(value);

        } finally {
            driver.switchTo().defaultContent();
        }
    }


    public void enterHeaderNote(String value) {
        if (value == null || value.trim().isEmpty()) return;

        driver.switchTo().defaultContent();
        WebElement label = wait.until(
            ExpectedConditions.presenceOfElementLocated(PrescriptionPage.getHeaderNoteLabel()));
        js.executeScript("arguments[0].scrollIntoView({block:'center'});", label);

        wait.until(ExpectedConditions.visibilityOfElementLocated(PrescriptionPage.getHeaderNoteLabel()));
        js.executeScript("arguments[0].click();", label);

        wait.until(ExpectedConditions.presenceOfElementLocated(PrescriptionPage.getHeaderNote()));
        wait.until(ExpectedConditions.visibilityOfElementLocated(PrescriptionPage.getHeaderNote()));

        typeInWysihtml5(PrescriptionPage.getHeaderNote(), value);
    }

    public void enterFooterNote(String value) {
        if (value == null || value.trim().isEmpty()) return;

        driver.switchTo().defaultContent();
        WebElement label = wait.until(
            ExpectedConditions.presenceOfElementLocated(PrescriptionPage.getFooterNoteLabel()));
        js.executeScript("arguments[0].scrollIntoView({block:'center'});", label);
        wait.until(ExpectedConditions.visibilityOfElementLocated(PrescriptionPage.getFooterNoteLabel()));
        js.executeScript("arguments[0].click();", label);
        wait.until(ExpectedConditions.presenceOfElementLocated(PrescriptionPage.getFooterNote()));
        wait.until(ExpectedConditions.visibilityOfElementLocated(PrescriptionPage.getFooterNote()));

        typeInWysihtml5(PrescriptionPage.getFooterNote(), value);
    }

    private void selectSelect2ByJS(By locator, String visibleText) {
        if (visibleText == null || visibleText.trim().isEmpty()) return;

        WebElement select = wait.until(
            ExpectedConditions.presenceOfElementLocated(locator));

        String optionValue = (String) js.executeScript(
            "var s=arguments[0], t=arguments[1].trim();" +
            "for(var i=0;i<s.options.length;i++){" +
            "  if(s.options[i].text.trim()===t||s.options[i].text.trim().indexOf(t)!==-1)" +
            "    return s.options[i].value;" +
            "} return null;",
            select, visibleText);

        if (optionValue == null) return;

        js.executeScript(
            "$(arguments[0]).val(arguments[1]).trigger('change').trigger('select2:select');",
            select, optionValue);

        wait.until(ExpectedConditions.attributeToBe(locator, "value", optionValue));
    }

    public void selectPrescribeBy(String value) {
        selectSelect2ByJS(PrescriptionPage.getPrescribeByDropdown(), value);
    }

    public void selectPathology(String value) {
        selectSelect2ByJS(PrescriptionPage.getPathologyDropdown(), value);
    }

    public void selectRadiology(String value) {
        selectSelect2ByJS(PrescriptionPage.getRadiologyDropdown(), value);
    }

    public void enterFindingCategory(String value) {
        selectSelect2ByJS(PrescriptionPage.getFindingCategory(), value);
    }

    public void enterFindings(String value) {
        if (value == null || value.trim().isEmpty()) return;

        driver.switchTo().defaultContent();
        WebElement input = waitForVisibility(PrescriptionPage.getFindings());
        input.click();
        input.sendKeys(value);

        try {
            waitForClickable(PrescriptionPage.getFindingOption(value)).click();
        } catch (Exception e) {
            input.sendKeys(Keys.ENTER);
        }
    }

    public void enterFindingDescription(String value) {
        if (value == null || value.trim().isEmpty()) return;
        sendKeys(PrescriptionPage.getFindingDescription(), value);
    }

    public void selectMedicineCategory(String value) {
        if (value == null || value.trim().isEmpty()) return;

        selectSelect2ByJS(PrescriptionPage.getMedicineCategoryDropdown(), value);
        wait.until(d -> d.findElements(PrescriptionPage.getMedicineOptions()).size() > 1);
    }

    public void selectMedicine(String value) {
        if (value == null || value.trim().isEmpty()) return;

        WebElement sel = wait.until(
            ExpectedConditions.presenceOfElementLocated(PrescriptionPage.getMedicineDropdown()));

        String matchedValue = null;
        for (WebElement opt : sel.findElements(PrescriptionPage.getDropdownOptions())) {
            String text = opt.getText().trim();
            if (text.equalsIgnoreCase(value.trim()) || text.contains(value.trim())) {
                matchedValue = opt.getAttribute("value");
                break;
            }
        }

        if (matchedValue == null) return;

        js.executeScript(
            "$(arguments[0]).val(arguments[1]).trigger('change');", sel, matchedValue);

        wait.until(ExpectedConditions.attributeToBe(PrescriptionPage.getMedicineDropdown(), "value", matchedValue));
    }

    public void selectDose(String value) {
        if (value == null || value.trim().isEmpty()) return;

        WebElement sel = wait.until(
            ExpectedConditions.presenceOfElementLocated(PrescriptionPage.getDoseDropdown()));

        String matchedValue = null;
        for (WebElement opt : sel.findElements(PrescriptionPage.getDropdownOptions())) {
            String text = opt.getText().trim();
            if (text.equalsIgnoreCase(value.trim()) || text.contains(value.trim())) {
                matchedValue = opt.getAttribute("value");
                break;
            }
        }

        if (matchedValue == null) return;

        js.executeScript(
            "$(arguments[0]).val(arguments[1]).trigger('change');", sel, matchedValue);

        wait.until(ExpectedConditions.attributeToBe(PrescriptionPage.getDoseDropdown(), "value", matchedValue));
    }

    public void selectDoseInterval(String value) {
        selectSelect2ByJS(PrescriptionPage.getDoseIntervalDropdown(), value);
    }

    public void selectDoseDuration(String value) {
        selectSelect2ByJS(PrescriptionPage.getDoseDurationDropdown(), value);
    }

    public void enterInstruction(String value) {
        if (value == null || value.trim().isEmpty()) return;
        sendKeys(PrescriptionPage.getInstruction(), value);
    }

    public void uploadAttachment(String filePath) {
        if (filePath == null || filePath.trim().isEmpty()) return;

        driver.switchTo().defaultContent();

        String absolutePath = System.getProperty("user.dir")
                + java.io.File.separator
                + filePath.replace("/", java.io.File.separator);

        WebElement input = wait.until(
            ExpectedConditions.refreshed(
                ExpectedConditions.presenceOfElementLocated(PrescriptionPage.getAttachmentInput())));

        input.sendKeys(absolutePath);
    }

    public void clickSave() {
        driver.switchTo().defaultContent();

        try {
            WebElement btn = wait.until(
                ExpectedConditions.refreshed(
                    ExpectedConditions.elementToBeClickable(PrescriptionPage.getSaveButton())));
            js.executeScript("arguments[0].scrollIntoView({block:'center'});", btn);
            js.executeScript("arguments[0].click();", btn);

        } catch (org.openqa.selenium.StaleElementReferenceException e) {
            WebElement btn = waitForClickable(PrescriptionPage.getSaveButton());
            js.executeScript("arguments[0].scrollIntoView({block:'center'});", btn);
            js.executeScript("arguments[0].click();", btn);
        }

        wait.until(ExpectedConditions.or(
        	    ExpectedConditions.visibilityOfElementLocated(PrescriptionPage.getPrescriptionTable()),
        	    ExpectedConditions.visibilityOfElementLocated(PrescriptionPage.getErrorMessage())
        	));
        	wait.until(driver ->
        	        !driver.findElements(PrescriptionPage.getPrescriptionFirstRow()).isEmpty()
        	        || !driver.findElements(PrescriptionPage.getErrorMessage()).isEmpty()
        	);
    }

    public void clickSaveAndPrint() {
        driver.switchTo().defaultContent();

        WebElement btn = wait.until(
            ExpectedConditions.refreshed(
                ExpectedConditions.elementToBeClickable(PrescriptionPage.getSaveAndPrintButton())));
        js.executeScript("arguments[0].scrollIntoView({block:'center'});", btn);
        js.executeScript("arguments[0].click();", btn);

        wait.until(d -> d.getWindowHandles().size() > 1);
    }

    public boolean isPrescriptionSaved() {
        try {
            waitForVisibility(PrescriptionPage.getPrescriptionTable());
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isPrescriptionInList() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(
                    PrescriptionPage.getPrescriptionTable()));
            boolean rowLoaded = wait.until(driver ->
                    !driver.findElements(PrescriptionPage.getPrescriptionFirstRow()).isEmpty());

            return rowLoaded;

        } catch (Exception e) {
            return false;
        }
    }

    public boolean isPrescriptionUpdated() {
        try {
            waitForVisibility(PrescriptionPage.getPrescriptionTable());
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isDeleteConfirmationPopupDisplayed() {
        try {
            String alertText = wait.until(ExpectedConditions.alertIsPresent()).getText();
            return alertText.contains("Are You Sure You Want To Delete This?");
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isPrescriptionDeletedSuccessfully() {
        try {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(PrescriptionPage.getDeleteButton()));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isPrintPreviewOpened() {
        try {
            String parent = driver.getWindowHandle();
            wait.until(d -> d.getWindowHandles().size() > 1);

            for (String handle : driver.getWindowHandles()) {
                if (!handle.equals(parent)) {
                    driver.switchTo().window(handle);
                    break;
                }
            }

            wait.until(ExpectedConditions.jsReturnsValue(
                "return document.readyState === 'complete';"));

            String url   = driver.getCurrentUrl().toLowerCase();
            String title = driver.getTitle().toLowerCase();

            return url.contains("print") || title.contains("print")
                || driver.getPageSource().toLowerCase().contains("print-preview");

        } catch (Exception e) {
            return false;
        }
    }

    public String getErrorMessage() {
        try {
            return waitForVisibility(PrescriptionPage.getErrorMessage()).getText().trim();
        } catch (Exception e) {
            return "";
        }
    }

    public void clickViewPrescription() {
        waitForClickable(PrescriptionPage.getViewPrescription());
        jsClick(PrescriptionPage.getViewPrescription());
    }

    public void clickEdit() {
        waitForClickable(PrescriptionPage.getEditButton());
        jsClick(PrescriptionPage.getEditButton());
    }

    public void clickDelete() {
        waitForClickable(PrescriptionPage.getDeleteButton());
        jsClick(PrescriptionPage.getDeleteButton());
    }

    public void confirmDelete() {
        wait.until(ExpectedConditions.alertIsPresent()).accept();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(PrescriptionPage.getDeleteButton()));
    }

    public void updatePrescriptionDetails() {
        driver.switchTo().defaultContent();

        WebElement iframe = wait.until(
            ExpectedConditions.visibilityOfElementLocated(PrescriptionPage.getHeaderNote()));
        driver.switchTo().frame(iframe);

        try {
            WebElement body = wait.until(
                ExpectedConditions.presenceOfElementLocated(PrescriptionPage.getFrameBody()));
            js.executeScript("arguments[0].innerHTML='';", body);
            body.sendKeys("Updated prescription details");
        } finally {
            driver.switchTo().defaultContent();
        }
    }
}