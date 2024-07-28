package org.example.collections.AAAJobsEveryDays;

//ackage org.example.collections.AAAJobsEveryDays;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LinkedInJobSearch {

    public static void main(String[] args) {
        String basePath = "/home/ahm-l-vikaspr/Resume/LinkedIn";

        // Create a directory based on the current date
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String currentDate = dateFormat.format(new Date());
        String directoryName = basePath + "/" + currentDate;

        try {
            Path directoryPath = Paths.get(directoryName);
            Files.createDirectories(directoryPath);

            System.setProperty("webdriver.chrome.driver", "/home/ahm-l-vikaspr/Downloads/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.linkedin.com/jobs");

            // Perform login (replace these with actual login credentials)
            // ... (your login code)

            // Provide the locations you want to search for
            String[] locations = {"indore"}; // Add your desired locations

            for (String location : locations) {
                // Find and fill the location field in the search bar
                WebElement locationField = driver.findElement(By.xpath("//input[@data-test-locator='job-search-bar-location-typeahead-input']"));
                locationField.clear();
                locationField.sendKeys(location);
                locationField.submit();

                // Wait for the page to load
                Thread.sleep(3000); // You might want to use better waits in production code

                // Create an Excel workbook and write job titles into it
                Workbook workbook = new XSSFWorkbook();
                Sheet sheet = workbook.createSheet("JobTitles");

                int rowNum = 0;
                for (WebElement job : driver.findElements(By.cssSelector(".job-card-container"))) {
                    WebElement titleElement = job.findElement(By.cssSelector(".screen-reader-text"));
                    String jobTitle = titleElement.getText();

                    Row row = sheet.createRow(rowNum++);
                    row.createCell(0).setCellValue(jobTitle);
                }

                // Save the Excel file in the specified directory with the location in the file name
                String excelFileName = directoryName + "/job_titles_" + location + ".xlsx";
                try (FileOutputStream outputStream = new FileOutputStream(excelFileName)) {
                    workbook.write(outputStream);
                    System.out.println("Job titles for " + location + " written to: " + excelFileName);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            // Quit the browser
            driver.quit();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

