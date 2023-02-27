package com.kodilla.selenium.allegro2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AllegroTesting {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        WebElement cookieButton = new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions
                        .presenceOfElementLocated(By.cssSelector("button[data-role='accept-consent']")));
        System.out.println(cookieButton.getText());
        cookieButton.click();

        WebElement optionElektronika = driver.findElement(By.cssSelector("option[value='/kategoria/elektronika']"));
        optionElektronika.click();

        WebElement inputField = driver.findElement(By.cssSelector("[class='msts_pt mgmw_wo mr3m_1 mli2_1 mjyo_6x mse2_40 mqu1_40 mp4t_0 m3h2_0 mryx_0 munh_0 mg9e_0 mj7a_0 mh36_0 mvrt_8 mlkp_6x mefy_5r mldj_0 mm2b_0 ozg4u mh85_0 _535b5_Y5CDc']"));
        inputField.sendKeys("Mavic mini");
        inputField.submit();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("section > article")));

        List<WebElement> elements = driver.findElements(By.cssSelector("section > article"));
        elements.forEach(p-> System.out.println(p.getText()));
    }
}
