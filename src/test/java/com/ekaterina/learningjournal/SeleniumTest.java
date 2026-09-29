package com.ekaterina.learningjournal;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

public class SeleniumTest {
    private WebDriver driver;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    void openGoogle() {
        driver.get("https://www.google.com");
        String title = driver.getTitle();
        System.out.println("Заголовок: " + title);
        assertTrue(title.contains("Google"));
    }

    @Test
    void openSwaggerUI() {
        driver.get("http://localhost:8080/swagger-ui/index.html");
        String title = driver.getTitle();
        System.out.println("Заголовок: " + title);
        assertTrue(title.toLowerCase().contains("swagger"));
    }
}