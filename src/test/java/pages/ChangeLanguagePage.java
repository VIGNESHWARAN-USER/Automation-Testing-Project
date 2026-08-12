package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.DriverFactory;

public class ChangeLanguagePage {

    public ChangeLanguagePage() {
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }

    @FindBy(xpath = "//button[@data-id='languageSwitcher']")
    public WebElement languageDropdown;

    @FindBy(xpath = "//span[contains(@class,'flag-icon-in')]/parent::a")
    public WebElement hindiLanguage;
    
    @FindBy(xpath = "//button[@data-id='languageSwitcher']")
    public WebElement languageButton;

}