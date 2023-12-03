package org.example.collections.AAAJobsEveryDays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URL;

public class OpenChromeBrowser {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        ClassLoader loader = ClassLoader.getSystemClassLoader();
        URL path = loader.getResource("chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", path.getPath());
    //    System.setProperty("webdriver.chrome.driver", "/home/ahm-l-vikaspr/Java_Program/JavaTestingPRactice/chromedriver");


        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open a website (for example, Google)
        driver.get("https://www.google.com");

        // Close the browser
        driver.quit();
    }
}

