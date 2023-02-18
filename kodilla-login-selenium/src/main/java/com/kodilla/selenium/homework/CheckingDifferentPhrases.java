package com.kodilla.selenium.homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckingDifferentPhrases {

    @FindBy(css = "input[type='text']")
    WebElement textField;

    WebDriver driver;

    public CheckingDifferentPhrases() {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        PageFactory.initElements(driver, this);

        driver.navigate().to("https://kodilla.com/pl/test/store");
    }

    public void sendPhrases(String phrases) {
        textField.sendKeys(phrases);
    }

    public void close() {
        driver.close();
    }
}
