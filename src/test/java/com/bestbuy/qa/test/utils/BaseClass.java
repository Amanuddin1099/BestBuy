package com.bestbuy.qa.test.utils;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

    public WebDriver driver;

    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\My Software\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();

    }

//    @AfterEach
//    public void browserClose() {
//        driver.close();
//    }
   }



