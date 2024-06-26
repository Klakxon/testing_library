package com.example.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import io.github.bonigarcia.wdm.WebDriverManager;
public class SeleniumTests {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testTitle() {
        driver.get("https://www.example.com");
        WebElement heading = driver.findElement(By.tagName("h1"));
        assertEquals("Example Domain", heading.getText());
    }

    @Test
    public void testLinkText() {
        driver.get("https://www.example.com");
        WebElement link = driver.findElement(By.cssSelector("a"));
        assertEquals("More information...", link.getText());
    }

    @Test
    public void testParagraphContent() {
        driver.get("https://www.example.com");
        WebElement paragraph = driver.findElement(By.xpath("//p"));
        assertTrue(paragraph.getText().contains("illustrative"));
    }
}

