// Java Program to Read, Write, and Modify Text Files

import java.io.*;
import java.util.Scanner;

public class FileHandlingUtility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the file name (with extension): ");
        String fileName = scanner.nextLine();

        try {
            // 1. Writing to a file
            System.out.println("Writing to the file...");
            FileWriter writer = new FileWriter(fileName);
            writer.write("This is the first line of the file.\n");
            writer.write("This is the second line of the file.\n");
            writer.close();
            System.out.println("Content written to the file successfully.\n");

            // 2. Reading from a file
            System.out.println("Reading from the file...");
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
            System.out.println();

            // 3. Modifying the file
            System.out.println("Modifying the file...");
            System.out.print("Enter the new content to append to the file: ");
            String newContent = scanner.nextLine();

            FileWriter appendWriter = new FileWriter(fileName, true);
            appendWriter.write(newContent + "\n");
            appendWriter.close();
            System.out.println("Content appended to the file successfully.\n");

            // Reading the modified file
            System.out.println("Reading the modified file...");
            BufferedReader modifiedReader = new BufferedReader(new FileReader(fileName));
            while ((line = modifiedReader.readLine()) != null) {
                System.out.println(line);
            }
            modifiedReader.close();

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

/**
 * Documentation:
 * 1. Writing to a file: The program creates or overwrites a file with a user-specified name and writes sample lines.
 * 2. Reading from a file: The program reads and displays the file's content line by line.
 * 3. Modifying the file: The user provides input, which is appended to the existing file content.
 * 4. Error handling ensures the program doesn't crash during file operations.
 * 5. The scanner is closed after operations to release system resources.
 *
 * Instructions to run:
 * 1. Open the program in VS Code.
 * 2. Save the file as "FileHandlingUtility.java".
 * 3. Open a terminal and navigate to the file's directory.
 * 4. Compile the program using: javac FileHandlingUtility.java
 * 5. Run the program using: java FileHandlingUtility
 */
