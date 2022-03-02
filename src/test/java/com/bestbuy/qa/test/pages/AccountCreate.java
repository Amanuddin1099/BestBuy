package com.bestbuy.qa.test.pages;

import com.bestbuy.qa.test.utils.BaseClass;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountCreate extends BaseClass {
    @Test
    public void accountCreateTest() throws InterruptedException {
        driver.get("https://www.bestbuy.com");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.manage().window().maximize();
        WebElement closeButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#widgets-view-email-modal-mount > div > div > div:nth-child(1) > div > div > div > div > button > svg")));
        closeButton.click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#shop-header-ab57e7d8-3076-421b-a6fe-ff3a8765323c > div > div.header-hamburger > header > div.bottom-fluid-container > nav > ul > li:nth-child(1) > div > button > span")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#shop-account-menu-7204a806-b0d4-429c-9348-859fa5451b7e > div > div > div > div > a.c-button.c-button-outline.c-button-sm.create-account-btn")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("body > div.cia-app-container > div > section > main > div.cia-wrapper__main > div.cia-content.js-cia-content > div > div > div > div > div > div.cia-create__signin > a")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("body > div.cia-app-container > div > section > main > div.cia-wrapper__main > div.cia-content.js-cia-content > div > div > div > div > div > div:nth-child(4) > button")).click();


    }
}
