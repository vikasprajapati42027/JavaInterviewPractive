package org.example.collections.AAAInterview;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class InterviewQuestionsGenerator {

    public static void main(String[] args) {
        // Define the topics you are interested in
        List<String> topics = Arrays.asList("Java", "SQL", "MySQL", "Linux");

        // Get the current date to create a date-wise directory
        String currentDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        String directoryPath = "/home/ahm-l-vikaspr/Interview_Q&A/" + currentDate + "/";

        // Create the date-wise directory
        File directory = new File(directoryPath);
        if (!directory.exists()) {
            directory.mkdirs();
        }

        // Create an Excel workbook
        try (Workbook workbook = new XSSFWorkbook()) {
            // Iterate over each topic and generate 100 questions and answers
            for (String topic : topics) {
                List<QuestionAnswerPair> qaPairs = generateSampleInterviewQuestionsAndAnswers(topic);

                // Create a new sheet for each topic
                Sheet sheet = workbook.createSheet(topic);

                // Create headers for the sheet
                Row headerRow = sheet.createRow(0);
                headerRow.createCell(0).setCellValue("Question");
                headerRow.createCell(1).setCellValue("Answer");

                // Populate the sheet with sample questions and answers
                for (int i = 0; i < qaPairs.size(); i++) {
                    Row row = sheet.createRow(i + 1);
                    row.createCell(0).setCellValue(qaPairs.get(i).getQuestion());
                    row.createCell(1).setCellValue(qaPairs.get(i).getAnswer());
                }
            }

            // Save the workbook to a file in the date-wise directory
            try (FileOutputStream fileOut = new FileOutputStream(directoryPath + "InterviewQuestions.xlsx")) {
                workbook.write(fileOut);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static List<QuestionAnswerPair> generateSampleInterviewQuestionsAndAnswers(String topic) {
        List<QuestionAnswerPair> qaPairs = new ArrayList<>();

        // Generate 100 sample questions and answers
        for (int i = 1; i <= 100; i++) {
            String question = "Sample " + topic + " Question " + i;
            String answer = "Sample " + topic + " Answer " + i;
            qaPairs.add(new QuestionAnswerPair(question, answer));
        }

        return qaPairs;
    }

    static class QuestionAnswerPair {
        private final String question;
        private final String answer;

        public QuestionAnswerPair(String question, String answer) {
            this.question = question;
            this.answer = answer;
        }

        public String getQuestion() {
            return question;
        }

        public String getAnswer() {
            return answer;
        }
    }
}
