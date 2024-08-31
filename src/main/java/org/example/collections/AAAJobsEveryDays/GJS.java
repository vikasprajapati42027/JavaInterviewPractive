package org.example.collections.AAAJobsEveryDays;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GJS {

    public static void main(String[] args) {
        String[] searchTerms = {"core java Developer"};
        String[] locations = {"Indore", "Bhopal", "Ahmedabad", "Remote", "Udaipur", "Jaipur","bangalore","hyderabad","PUNE"};

        String basePath = "/home/ahm-l-vikaspr/Resume/Jobs";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String currentDate = dateFormat.format(new Date());
        String directoryName = basePath + "/JobListings_" + currentDate;

        try {
            Path directoryPath = Paths.get(directoryName);
            Files.createDirectories(directoryPath);

            for (String searchTerm : searchTerms) {
                try (Workbook workbook = new XSSFWorkbook()) {
                    for (String location : locations) {
                        Sheet sheet = workbook.createSheet(location);
                        String searchQuery = searchTerm + " " + location + " job openings";
                        Document doc = Jsoup.connect("https://www.google.com/search?q=" + searchQuery).get();
                        Elements results = doc.select("div.g");

                        int rowNum = 0;
                        for (Element result : results) {
                            Element link = result.selectFirst("a[href]");
                            String title = result.selectFirst("h3").text();
                            String url = link.attr("href");
                            Row row = sheet.createRow(rowNum++);
                            row.createCell(0).setCellValue(title);
                            row.createCell(1).setCellValue(url);
                        }
                    }

                    String excelFileName = directoryName + "/job_listings_" + searchTerm + ".xlsx";
                    try (FileOutputStream outputStream = new FileOutputStream(excelFileName)) {
                        workbook.write(outputStream);
                        System.out.println("Job listings for " + searchTerm + " written to " + excelFileName);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

