# Files. IO streams
>This repository was created for homework in lessons №11 - "Files. IO streams".
## Tasks

### Mandatory tasks:
0. Let's say there is a file with document numbers.  
   The document number is a string consisting of letters and numbers (without service characters).  
   Let this file contain each document number on a new line and no other information on the line, only the document number.  
   A valid document number must be 15 characters long and begin with the sequence docnum  
    (hereinafter any sequence of letters/numbers) or contract (hereinafter any sequence of letters/numbers).  
   Write a program to read information from an input file - the path to the input file must be specified via the console.  
   The program must check document numbers for validity.  
   Valid document numbers should be recorded in one report file.  
   Invalid document numbers should be recorded in another report file,  
    but after the document numbers you should add information about why this document is invalid.


# Document Validator

Document Validator is a simple Java application that validates document numbers read from an input file. The validation rules are as follows:

- A valid document number must contain 15 characters.
- A valid document number must start with "docnum" or "contract".

The application writes valid and invalid document numbers to separate output files. For invalid document numbers, the reason for invalidity is also written to the output file.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

- Java Development Kit (JDK) 8 or later
- A text editor or an Integrated Development Environment (IDE) like IntelliJ IDEA

### Installing

1. Clone the repository to your local machine.
2. Install javac compiler.
3. Open the project root folder.  
4. Compile the project:
   
   -press SHIFT + right mouse button in the root project and run command prompt;  
   -enter the command:
```bash
javac -sourcepath ./src -d out ./src/com/tms/files_io_streams/mandatory_tasks/task_0/Runner.java
```
![1](https://github.com/adziameshchyk/TeachMeSkills_HW_Lesson_11---Document-Validator/assets/123600438/c6fff6c0-1cda-4c33-970d-cc06dcaacc02)

### Running the Application

Run the program with the following command:  

```bash
java -cp ./out com/tms/files_io_streams/mandatory_tasks/task_0/Runner
```
![2](https://github.com/adziameshchyk/TeachMeSkills_HW_Lesson_11---Document-Validator/assets/123600438/4655b1e5-214b-4b0a-9083-500e4720e825)


The application will ask for the path to the source file with document numbers.  
For the test, you can enter the name of the finished file in the project root "documents.txt".  
![3](https://github.com/adziameshchyk/TeachMeSkills_HW_Lesson_11---Document-Validator/assets/123600438/8500bdc1-359b-41bd-a3cf-5d2b4b43e54e)
After entering the application will create two output files in the reports directory.

- `validDocNumbers.txt` - contains valid document numbers.
- `invalidDocNumbers.txt` - contains invalid document numbers and the reasons for invalidity.
![4](https://github.com/adziameshchyk/TeachMeSkills_HW_Lesson_11---Document-Validator/assets/123600438/88b34992-4662-435a-a89c-ca24834e8777)

## Built With

- [Java](https://www.oracle.com/java/)

## Authors

- [Aliaksandr Dziameshchyk](https://github.com/adziameshchyk)
