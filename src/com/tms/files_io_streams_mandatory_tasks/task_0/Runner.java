package com.tms.files_io_streams_mandatory_tasks.task_0;

import com.tms.files_io_streams_mandatory_tasks.task_0.models.DocValidator;

import java.io.*;

/**
 * Task:
 *
 * Let's say there is a file with document numbers.
 * The document number is a string consisting of letters and numbers (without service characters).
 * Let this file contain each document number on a new line and no other information on the line, only the document number.
 * A valid document number must be 15 characters long and begin with the sequence docnum
 *  (hereinafter any sequence of letters/numbers) or contract (hereinafter any sequence of letters/numbers).
 * Write a program to read information from an input file - the path to the input file must be specified via the console.
 * The program must check document numbers for validity.
 * Valid document numbers should be recorded in one report file.
 * Invalid document numbers should be recorded in another report file,
 *  but after the document numbers you should add information about why this document is invalid.
 */

public class Runner {

    public static void main(String[] args) {
        String inputFilePath;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            inputFilePath = bufferedReader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        DocValidator validator = new DocValidator(new File(inputFilePath));
        validator.validate();
    }

}
