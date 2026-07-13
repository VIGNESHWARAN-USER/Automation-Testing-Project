package pages;

import org.openqa.selenium.By;

public class PrescriptionPage {


    private static final By doctorTab =
            By.xpath("//a[normalize-space()='Doctor']");

    private static final By signInButton =
            By.xpath("//button[contains(normalize-space(),'Sign In')]");

    private static final By ipdMenu =
            By.xpath("//span[normalize-space()='IPD - In Patient']");

    private static final By patientSearchBox =
            By.xpath("//label//input[@type='search']");

    private static final By prescriptionTab =
            By.xpath("(//a[@href='#prescription'])[1]");

    private static final By click128Tab =
            By.xpath("//tr[@class='odd']//a[text()='IPDN128']");

    private static final By prescriptionButton =
            By.xpath("//li//a[@href='#prescription']");

    private static final By addPrescriptionButton =
            By.xpath("//a[text()=' Add Prescription']");

    private static final By prescriptionTable =
            By.xpath("//table[@id='DataTables_Table_2']");


    private static final By headerNote =
            By.xpath(
            "//label[normalize-space()='Header Note']" +
            "/ancestor::div[contains(@class,'form-group')]" +
            "//iframe[contains(@class,'wysihtml5-sandbox')]");


    private static final By headerNoteLabel =
            By.xpath("//label[normalize-space()='Header Note']");


    private static final By footerNoteLabel =
            By.xpath("//label[normalize-space()='Footer Note']");


    private static final By footerNote =
            By.xpath(
            "//label[normalize-space()='Footer Note']" +
            "/ancestor::div[contains(@class,'form-group')]" +
            "//iframe[contains(@class,'wysihtml5-sandbox')]");


    private static final By prescribeByDropdown =
            By.name("prescribe_by");

    private static final By pathologyDropdown =
            By.name("pathology[]");

    private static final By radiologyDropdown =
            By.name("radiology[]");

    private static final By findingCategory =
            By.cssSelector("select.findingtype");


    private static final By findings =
            By.xpath(
            "//select[contains(@class,'findingtype')]" +
            "/ancestor::td/following-sibling::td[1]//input[@type='text']");


    private static final By findingDescription =
            By.id("finding_description");


    private static final By medicineCategoryDropdown =
            By.cssSelector("select[name='medicine_cat_1']");


    private static final By medicineDropdown =
            By.cssSelector("select[name='medicine_1']");


    private static final By medicineOptions =
            By.cssSelector("select[name='medicine_1'] option");


    private static final By doseDropdown =
            By.cssSelector("select[name='dosage_1']");


    private static final By doseOptions =
            By.cssSelector("select[name='dosage_1'] option");


    private static final By doseIntervalDropdown =
            By.cssSelector("select[name='interval_dosage_1']");


    private static final By doseDurationDropdown =
            By.cssSelector("select[name='duration_dosage_1']");


    private static final By instruction =
            By.cssSelector("input[name='instruction_1'], textarea[name='instruction_1']");


    private static final By attachmentInput =
            By.name("document");


    private static final By saveButton =
            By.xpath("//button[@name='save_print']/following-sibling::button");


    private static final By saveAndPrintButton =
            By.xpath("//button[@name='save_print']");


    private static final By errorMessage =
            By.xpath("//p[text()='Please select any one pathology, radiology or medicine details']");


    private static final By viewPrescription =
            By.xpath("//table[@id='DataTables_Table_2']//tbody/tr[1]/td//a[contains(@href,'prescription')]");


    private static final By editButton =
            By.xpath("//div[@id='edit_deleteprescription']//a[@data-original-title='Edit']");


    private static final By deleteButton =
            By.xpath("//div[@id='edit_deleteprescription']//a[@data-original-title='Delete']");


    private static final By confirmDeleteButton =
            By.xpath(
            "//button[contains(text(),'Yes')] | " +
            "//button[contains(text(),'OK')] | " +
            "//button[contains(text(),'delete')] | " +
            "//button[contains(@class,'swal-button--confirm')] | " +
            "//button[contains(@class,'confirm')]");


    private static final By deleteSuccessMessage =
            By.xpath(
            "//*[contains(text(),'Record Deleted Successfully') or contains(text(),'Deleted Successfully')]");


    private static final By updateSaveButton =
            By.xpath("//form[@id='form_prescription']//button[@value='save']");


    private static final By dropdownOptions =
            By.tagName("option");


    private static final By frameBody =
            By.tagName("body");


    private static final By prescriptionFirstRow =
            By.xpath("//table[@id='DataTables_Table_2']//tbody/tr[not(contains(@class,'dataTables_empty'))]");


    public static By getDoctorTab(){ return doctorTab; }
    public static By getSignInButton(){ return signInButton; }
    public static By getIpdMenu(){ return ipdMenu; }
    public static By getPatientSearchBox(){ return patientSearchBox; }
    public static By getPrescriptionTab(){ return prescriptionTab; }
    public static By getClick128Tab(){ return click128Tab; }
    public static By getPrescriptionButton(){ return prescriptionButton; }
    public static By getAddPrescriptionButton(){ return addPrescriptionButton; }
    public static By getPrescriptionTable(){ return prescriptionTable; }
    public static By getHeaderNote(){ return headerNote; }
    public static By getHeaderNoteLabel(){ return headerNoteLabel; }
    public static By getFooterNoteLabel(){ return footerNoteLabel; }
    public static By getFooterNote(){ return footerNote; }
    public static By getPrescribeByDropdown(){ return prescribeByDropdown; }
    public static By getPathologyDropdown(){ return pathologyDropdown; }
    public static By getRadiologyDropdown(){ return radiologyDropdown; }
    public static By getFindingCategory(){ return findingCategory; }
    public static By getFindings(){ return findings; }
    public static By getFindingDescription(){ return findingDescription; }
    public static By getMedicineCategoryDropdown(){ return medicineCategoryDropdown; }
    public static By getMedicineDropdown(){ return medicineDropdown; }
    public static By getMedicineOptions(){ return medicineOptions; }
    public static By getDoseDropdown(){ return doseDropdown; }
    public static By getDoseOptions(){ return doseOptions; }
    public static By getDoseIntervalDropdown(){ return doseIntervalDropdown; }
    public static By getDoseDurationDropdown(){ return doseDurationDropdown; }
    public static By getInstruction(){ return instruction; }
    public static By getAttachmentInput(){ return attachmentInput; }
    public static By getSaveButton(){ return saveButton; }
    public static By getSaveAndPrintButton(){ return saveAndPrintButton; }
    public static By getErrorMessage(){ return errorMessage; }
    public static By getViewPrescription(){ return viewPrescription; }
    public static By getEditButton(){ return editButton; }
    public static By getDeleteButton(){ return deleteButton; }
    public static By getConfirmDeleteButton(){ return confirmDeleteButton; }
    public static By getDeleteSuccessMessage(){ return deleteSuccessMessage; }
    public static By getUpdateSaveButton(){ return updateSaveButton; }
    public static By getDropdownOptions(){ return dropdownOptions; }
    public static By getFrameBody(){ return frameBody; }
    public static By getPrescriptionFirstRow(){ return prescriptionFirstRow; }


    public static By getPatientByIPD(String ipdNumber) {
        return By.xpath("//a[contains(text(),'" + ipdNumber + "')]");
    }


    public static By getIpdNumber(String ipdNumber) {
        return By.xpath("//tr[@class='odd']//a[contains(text(),'IPDN" + ipdNumber + "')]");
    }


    public static By getFindingOption(String value) {
        return By.xpath(
                "//label[contains(normalize-space(),'" + value + "')]" +
                "/preceding-sibling::input[@type='checkbox']" +
                " | //li[contains(normalize-space(),'" + value + "')]");
    }
}