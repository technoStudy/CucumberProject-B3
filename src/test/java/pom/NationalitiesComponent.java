package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NationalitiesComponent extends BasePOM {
    public static By plusButton = By.cssSelector("ms-table-toolbar > div ms-add-button");
    public static By nameInput = By.cssSelector("mat-dialog-container [placeholder='GENERAL.FIELD.NAME']>input");
    public static By saveButton = By.cssSelector("mat-dialog-container ms-save-button");
    public static By closeDialogButton = By.cssSelector("mat-dialog-container button[aria-label='Close dialog']");

    public NationalitiesComponent(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnPlusButton() {
        waitForVisibilityAndClick(plusButton);
    }

    public void enterName(String name) {
        waitForVisibilityAndClick(nameInput);
        WebElement element = driver.findElement(nameInput);
        element.clear();
        element.sendKeys(name);
    }

    public void save() {
        waitForVisibilityAndClick(saveButton);
    }

    public void closeDialog() {
        waitForVisibilityAndClick(closeDialogButton);
    }
}
