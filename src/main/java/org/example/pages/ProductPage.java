package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage{
    public final By buyButton = By.xpath("//*[@id='produto']/div[4]/main/section[1]/div[3]/div[7]/a");
    public final By close = By.xpath("//*[@id='produto']/div[6]/div[1]/a[1]");
    public final By color = By.xpath("//*[@id='produto']/div[4]/main/section[1]/div[3]/div[4]/div/ul[1]/li[2]/span/label[3]");
    public final By size = By.xpath("//*[@id='produto']/div[4]/main/section[1]/div[3]/div[4]/div/ul[2]/li[2]/span/label[3]");
    public ProductPage(WebDriver driver) {
        super(driver);
    }
    public void clickOnProduct(String name) {
        driver.findElement(By.xpath("//a[@title='" + name + "']")).click();
    }
    public void clickOnBuyButton() {
        driver.findElement(buyButton).click();
    }
    public void clickOnClose() {
        driver.findElement(close).click();
    }
    public void clickOnColor() {
        driver.findElement(color).click();
    }
    public void clickOnSize() {
        driver.findElement(size).click();
    }

}
