package pages;

import org.openqa.selenium.By;

public class JoinConsultationPage {

    private static final By liveConsultation =
            By.xpath("//li[contains(@class,\"nav-item\")][19]");

    private static final By liveConsultationOption =
            By.xpath("//li[contains(@class,\"nav-item\")][19]/ul/li/a");

    private static final By tableBody =
            By.xpath("//div/table/tbody/tr");

    private static final By popUp =
            By.xpath("//div[@id=\"modal-chkstatus\"]");

    private static final By startNow =
            By.xpath("//a[contains(@href , 'zoom') and contains(@class , 'join-btn')]");

    private static final By addButton =
            By.xpath("//div[@class=\"box-tools pull-right box-tools-md\"]/button[1]");

    private static final By patientName =
            By.xpath("//select[@id=\"addpatient_id\"]/following-sibling::span/span/span/span[2]");

    private static final By firstPatientOption =
            By.xpath("//span[@class=\"select2-results\"]/ul/li[1]");

    private static final By patientNameInput =
            By.cssSelector("input.select2-search__field");

    private static final By title =
            By.xpath("//input[@name=\"title\"]");

    private static final By date =
            By.cssSelector("input#datetimepicker");

    private static final By duration =
            By.cssSelector("input#duration");

    private static final By ipdOrOpd =
            By.xpath("//select[@class=\"form-control module_type\"]");

    private static final By description =
            By.cssSelector("textarea#description");

    private static final By addCredentialButton =
            By.xpath("//h3[contains(text(), 'Live Consult')]/following-sibling::div/button[2]");

    private static final By zoomApiKeyField =
            By.xpath("//input[@id=\"zoom_api_key\"]");

    private static final By zoomApiSecretField =
            By.xpath("//input[@id=\"zoom_api_secret\"]");

    private static final By saveCredentialButton =
            By.xpath("//button[@id=\"submit-btn-credential\"][2]");

    private static final By successToastMessage =
            By.xpath("//div[@class=\"toast-message\"]");

    private static final By saveConsultationButton =
            By.xpath("//div[@class=\"pull-right mrminus8\"]/button[@class=\"btn btn-primary\"]");


    public static By getLiveConsultation() {
        return liveConsultation;
    }

    public static By getLiveConsultationOption() {
        return liveConsultationOption;
    }

    public static By getTableBody() {
        return tableBody;
    }

    public static By getPopUp() {
        return popUp;
    }

    public static By getStartNow() {
        return startNow;
    }

    public static By getAddButton() {
        return addButton;
    }

    public static By getPatientName() {
        return patientName;
    }

    public static By getFirstPatientOption() {
        return firstPatientOption;
    }

    public static By getPatientNameInput() {
        return patientNameInput;
    }

    public static By getTitle() {
        return title;
    }

    public static By getDate() {
        return date;
    }

    public static By getDuration() {
        return duration;
    }

    public static By getIpdOrOpd() {
        return ipdOrOpd;
    }

    public static By getDescription() {
        return description;
    }

    public static By getAddCredentialButton() {
        return addCredentialButton;
    }

    public static By getZoomApiKeyField() {
        return zoomApiKeyField;
    }

    public static By getZoomApiSecretField() {
        return zoomApiSecretField;
    }

    public static By getSaveCredentialButton() {
        return saveCredentialButton;
    }

    public static By getSuccessToastMessage() {
        return successToastMessage;
    }

    public static By getSaveConsultationButton() {
        return saveConsultationButton;
    }


    public static By getStatusDropdown(int rowIndex) {
        return By.xpath("//tbody/tr[" + rowIndex + "]/td[8]/form/select");
    }

    public static By getActionButtons(int rowIndex) {
        return By.xpath("//tbody/tr[" + rowIndex + "]/td[9]/div/a");
    }
}