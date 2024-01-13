package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    private final By search = By.xpath("/html/body/div[3]/header/section[2]/div[4]/div[1]");
    private final By searchText = By.xpath("//*[@id='top_search']");
    private final By returnButton = By.xpath("//*[@id='produto']/div[4]/header/section[2]/div[2]/a/img");
    private final By cart = By.xpath("/html/body/div[3]/header/section[2]/div[4]/a");
    private final By cartText = By.xpath("/html/body/div[6]/div[2]/div/div[1]/div[1]/a[1]/span[2]");
    private final By helpSection = By.xpath("//a[@class='__faq underscore-slide' and @href='/faq']");
    public HomePage(WebDriver driver) {
        super(driver);
    }
    public void clickOnSeccion(String seccion) {
        driver.findElement(By.xpath("//a[text()='"+seccion+"']")).click();
    }
    public void clickOnSearch() {
        driver.findElement(search).click();
    }
    public void setSearchText(String text) {
        driver.findElement(searchText).sendKeys(text);
    }
    public String getSearchName(String name) {
        return driver.findElement(By.xpath("//span[text()='"+name+"']")).getText();
    }
    public void enter() {
        driver.findElement(searchText).sendKeys(Keys.ENTER);
    }
    public void clickOnReturnButton() {
        driver.findElement(returnButton).click();
    }
    public void clickOnCart() {
        driver.findElement(cart).click();
    }
    public String getCartText() {
        return driver.findElement(cartText).getText();
    }
    public void clickOnHelpSection() {
        driver.findElement(helpSection).click();
    }
}
