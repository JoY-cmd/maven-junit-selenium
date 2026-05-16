package com.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

import static org.junit.Assert.*;

/**
 * Sample Selenium test class demonstrating Google search functionality
 */
public class SeleniumTest {

    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void setUp() {
        // Setup ChromeDriver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testGoogleSearch() {
        // Navigate to Google
        driver.navigate().to("https://www.google.com");
        
        // Get the page title
        String title = driver.getTitle();
        assertTrue("Title should contain 'Google'", title.contains("Google"));
    }

    @Test
    public void testPageUrl() {
        // Open a website and verify URL
        driver.navigate().to("https://www.google.com");
        
        String currentUrl = driver.getCurrentUrl();
        assertTrue("URL should contain google.com", currentUrl.contains("google.com"));
    }

    @Test
    public void testPageElements() {
        // Navigate to Google
        driver.navigate().to("https://www.google.com");
        
        // Check if search box exists
        WebElement searchBox = wait.until(
            ExpectedConditions.presenceOfElementLocated(By.name("q"))
        );
        
        assertNotNull("Search box should exist", searchBox);
        assertTrue("Search box should be displayed", searchBox.isDisplayed());
    }
}
