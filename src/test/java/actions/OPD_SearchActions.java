package actions;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.OPDPage;
import utilities.HelperClass;

public class OPD_SearchActions extends BaseAction {
	WebDriverWait wait;
	
	public OPD_SearchActions(WebDriver driver) {
		super(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	public void searchPatient(String patientName) {
		HelperClass.logger.info("Passing patient name");
		sendKeys(OPDPage.getSearchBox(),patientName);
	}
	
	public void navigateToOPDPage() {
		wait.until(ExpectedConditions.elementToBeClickable(OPDPage.getOpdButton()));
		HelperClass.logger.info("clicking opd button");
		jsClick(OPDPage.getOpdButton());
		HelperClass.logger.info("clicking old opd tab");
		wait.until(ExpectedConditions.elementToBeClickable(OPDPage.getOldOpdTab()));
		jsClick(OPDPage.getOldOpdTab());
	}
	
	public String verifySearchnameResult() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(OPDPage.getPatientName()));
	    HelperClass.logger.info("Getting patient name");
	    return getText(OPDPage.getPatientName());
	}

	public String verifySearchFailed(){
	    wait.until(ExpectedConditions.visibilityOfElementLocated(OPDPage.getSearchFailed()));
	    HelperClass.logger.info("Search failed");
	    return getText(OPDPage.getSearchFailed());
	}
}
