package org.example.collections.AAAJobsEveryDays;
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

public class NaukriJobSearch {

    public static void main(String[] args) {
        String basePath = "/home/ahm-l-vikaspr/Resume/Naukri.com";

        // Create a directory based on the current date
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String currentDate = dateFormat.format(new Date());
        String directoryName = basePath + "/" + currentDate;

        try {
            Path directoryPath = Paths.get(directoryName);
            Files.createDirectories(directoryPath);

            System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.naukri.com");

            // Perform login (replace these with actual login credentials)
            // ... (your login code)

            // Perform job search and get job titles
            // ... (your job search code)

            // Create an Excel workbook and write job titles into it
            Workbook workbook = new XSSFWorkbook();
            Sheet sheet = workbook.createSheet("JobTitles");

            int rowNum = 0;
            for (WebElement job : driver.findElements(By.cssSelector(".jobTuple.bgWhite.br4.mb-8"))) {
                WebElement titleElement = job.findElement(By.cssSelector(".title.fw500.ellipsis"));
                String jobTitle = titleElement.getText();

                Row row = sheet.createRow(rowNum++);
                row.createCell(0).setCellValue(jobTitle);
            }

            // Save the Excel file in the specified directory
            String excelFileName = directoryName + "/job_titles.xlsx";
            try (FileOutputStream outputStream = new FileOutputStream(excelFileName)) {
                workbook.write(outputStream);
                System.out.println("Job titles written to: " + excelFileName);
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Quit the browser
            driver.quit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}




