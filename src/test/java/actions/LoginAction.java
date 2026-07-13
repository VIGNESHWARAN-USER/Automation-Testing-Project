package actions;

import org.openqa.selenium.WebDriver;

import definitions.Helper;
import pages.DashboardPage;
import pages.LoginPage;
import utilities.DriverFactory;
import utilities.HelperClass;

public class LoginAction extends BaseAction {

	public LoginAction(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void setUsername(String username) {
		try {
			HelperClass.logger.info("entering username");
			sendKeys(LoginPage.getEmailInput(), username);
		} catch (Exception e) {
			HelperClass.logger.error("Failed to enter username: " + e.getMessage());
			throw e;
		}
	}

	public void setPassword(String password) {
		try {
			HelperClass.logger.info("entering password");
			sendKeys(LoginPage.getPasswordInput(), password);
		} catch (Exception e) {
			HelperClass.logger.error("Failed to enter password: " + e.getMessage());
			throw e;
		}
	}

	public void clickLoginButton() {
		try {
			HelperClass.logger.info("clicking login button");
			click(LoginPage.getSignInButton());
		} catch (Exception e) {
			HelperClass.logger.error("Failed to click login button: " + e.getMessage());
			throw e;
		}
	}

	public String getInvalidErrorMessage() {
		try {
			HelperClass.logger.info("getting invalid message");
			return getText(LoginPage.getInvalidErrorMessage());
		} catch (Exception e) {
			HelperClass.logger.error("Failed to get invalid error message: " + e.getMessage());
			throw e;
		}
	}

	public String getUsernameErrorMessage() {
		try {
			HelperClass.logger.info("username error message");
			return getText(LoginPage.getUsernameErrorMessage());
		} catch (Exception e) {
			HelperClass.logger.error("Failed to get username error message: " + e.getMessage());
			throw e;
		}
	}

	public String getPasswordErrorMessage() {
		try {
			HelperClass.logger.info("password error message");
			return getText(LoginPage.getPasswordErrorMessage());
		} catch (Exception e) {
			HelperClass.logger.error("Failed to get password error message: " + e.getMessage());
			throw e;
		}
	}

	public void clickLogin(String role) {
		try {
			switch (role) {
				case "Super Admin":
					HelperClass.logger.info("clicking super admin");
					click(LoginPage.getSuperAdmin());
					break;

				case "Admin":
					HelperClass.logger.info("clicking admin");
					click(LoginPage.getAdmin());
					break;

				case "Doctor":
					HelperClass.logger.info("clicking doctor");
					click(LoginPage.getDoctor());
					break;

				case "Nurse":
					HelperClass.logger.info("clicking nurse");
					click(LoginPage.getNurse());
					break;

				case "Pharmacist":
					HelperClass.logger.info("clicking pharmacist");
					click(LoginPage.getPharmacist());
					break;

				case "Pathologist":
					HelperClass.logger.info("clicking pathologist");
					click(LoginPage.getPathologist());
					break;

				case "Radiologist":
					HelperClass.logger.info("clicking radiologist");
					click(LoginPage.getRadiologist());
					break;

				case "Accountant":
					HelperClass.logger.info("clicking accountant");
					click(LoginPage.getAccountant());
					break;

				case "Receptionist":
					HelperClass.logger.info("clicking receptionist");
					click(LoginPage.getReceptionist());
					break;

				default:
					throw new IllegalArgumentException("Invalid role: " + role);
			}
		} catch (Exception e) {
			HelperClass.logger.error("Failed to click login role: " + role + " - " + e.getMessage());
			throw e;
		}
	}

	public String getUserRole() {
		try {
			click(DashboardPage.getProfileIcon());
			return getText(DashboardPage.getRole());
		} catch (Exception e) {
			HelperClass.logger.error("Failed to get user role: " + e.getMessage());
			throw e;
		}
	}

	public void goToLoginPage() {
		try {
			DriverFactory.getDriver().get(
				Helper.getPropertyFile().getProperty("loginUrl")
			);
		} catch (Exception e) {
			HelperClass.logger.error("Failed to navigate to login page: " + e.getMessage());
			throw e;
		}
	}
}