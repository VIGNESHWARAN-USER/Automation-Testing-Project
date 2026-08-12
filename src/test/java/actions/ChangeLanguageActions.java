package actions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.ChangeLanguagePage;
import utilities.DriverFactory;

import java.time.Duration;

public class ChangeLanguageActions {

    ChangeLanguagePage page = new ChangeLanguagePage();

    WebDriverWait wait =
            new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(10));

    public void clickLanguageOption() {

        wait.until(ExpectedConditions.elementToBeClickable(page.languageDropdown));
        page.languageDropdown.click();

        wait.until(ExpectedConditions.visibilityOf(page.hindiLanguage));
    }

    public void selectLanguage(String language) {

        if (language.equalsIgnoreCase("Hindi")) {

            wait.until(ExpectedConditions.elementToBeClickable(page.hindiLanguage));
            page.hindiLanguage.click();
        }
    }

    public boolean isLanguageChanged() {

        wait.until(ExpectedConditions.visibilityOf(page.languageButton));

        String text = page.languageButton.getText();

        System.out.println(text);

        return text.contains("Hindi") || text.contains("हिंदी");
    }
}