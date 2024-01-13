package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeccionPage extends BasePage{
    private final By sort = By.xpath("//span[@class='label'][text()='Ordenar por']");
    public SeccionPage(WebDriver driver) {
        super(driver);
    }
    public void clickOnSort() {
        driver.findElement(sort).click();
    }
    public void clickOnCategory(String sortCategory) {
        driver.findElement(By.xpath("//li[text()='"+sortCategory+"']")).click();
    }
    public String getCategoryName(String seccion) {
        return driver.findElement(By.linkText(seccion)).getText();
    }
}
