package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelpPage extends BasePage{
    private final By helptext = By.xpath("//h1[text()='¿Necesitas ayuda?']");
    public HelpPage(WebDriver driver) {
        super(driver);
    }
    public String getHelpText() {
        return driver.findElement(helptext).getText();
    }
}
