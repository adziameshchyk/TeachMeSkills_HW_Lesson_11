package com.tms.files_io_streams.mandatory_tasks.task_0.models;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DocValidator {

    private static final Path REPORT_DIR = Paths.get("reports");
    private static final File VALID_DOC_NUMBERS = new File(REPORT_DIR.toFile(), "validDocNumbers.txt");
    private static final File INVALID_DOC_NUMBERS = new File(REPORT_DIR.toFile(), "invalidDocNumbers.txt");

    private File sourceOfDocNumbers;
    private final List<String> docNumbers = new ArrayList<>();

    public DocValidator(File sourceOfDocNumbers) {
        setSourceOfDocNumbers(sourceOfDocNumbers);
        createReportDirAndFiles();
    }

    private void setSourceOfDocNumbers(File sourceOfDocNumbers) {
        if (sourceOfDocNumbers.isFile()) {
            this.sourceOfDocNumbers = sourceOfDocNumbers;
        } else {
            throw new IllegalArgumentException("Invalid source of document numbers");
        }
    }

    private void createReportDirAndFiles() {
        try {
            if (!Files.exists(REPORT_DIR)) {
                Files.createDirectories(REPORT_DIR);
            }
            if (!VALID_DOC_NUMBERS.exists()) {
                VALID_DOC_NUMBERS.createNewFile();
            }
            if (!INVALID_DOC_NUMBERS.exists()) {
                INVALID_DOC_NUMBERS.createNewFile();
            }
        } catch (IOException e) {
            throw new RuntimeException("Error creating report directory or files", e);
        }
    }

    private void getDocNumbers() {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(sourceOfDocNumbers)))) {
            while (bufferedReader.ready()) {
                docNumbers.add(bufferedReader.readLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void validate() {
        getDocNumbers();

        try (BufferedWriter validWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(VALID_DOC_NUMBERS, true)));
             BufferedWriter invalidWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(INVALID_DOC_NUMBERS, true)))) {

            for (String docNumber : docNumbers) {
                String validationError = getValidationError(docNumber);
                if (validationError == null) {
                    validWriter.write(docNumber);
                } else {
                    invalidWriter.write(docNumber + " - " + validationError);
                }
                invalidWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String getValidationError(String docNumber) {
        if (docNumber.length() != 15) {
            return "The document title must contain 15 characters.";
        }  else if (!docNumber.startsWith("docnum") && !docNumber.startsWith("contract")) {
            return "The name of the document must begin with \"contract\" or \"docnum\".";
        }

        return null;
    }

}
