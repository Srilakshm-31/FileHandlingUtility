import java.io.*;
import java.nio.file.*;
import java.util.*;

public class FileHandlingUtility {

  
    public static void writeToFile(String fileName, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    public static void readFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            System.out.println("\n--- File Content ---");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("---------------------\n");
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

    public static void appendToFile(String fileName, String contentToAppend) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.newLine();
            writer.write(contentToAppend);
            System.out.println("Content appended successfully.");
        } catch (IOException e) {
            System.err.println("Error appending to file: " + e.getMessage());
        }
    }

  
    public static void replaceInFile(String fileName, String target, String replacement) {
        try {
            Path path = Paths.get(fileName);
            List<String> lines = Files.readAllLines(path);
            List<String> updatedLines = new ArrayList<>();

            for (String line : lines) {
                updatedLines.add(line.replace(target, replacement));
            }

            Files.write(path, updatedLines);
            System.out.println("Content replaced successfully.");
        } catch (IOException e) {
            System.err.println("Error replacing content in file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName;

        while (true) {
            System.out.println("=== FILE HANDLING UTILITY ===");
            System.out.println("1. Write to file");
            System.out.println("2. Read from file");
            System.out.println("3. Append to file");
            System.out.println("4. Replace word in file");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter file name: ");
                    fileName = scanner.nextLine();
                    System.out.print("Enter content to write: ");
                    String content = scanner.nextLine();
                    writeToFile(fileName, content);
                    break;

                case 2:
                    System.out.print("Enter file name to read: ");
                    fileName = scanner.nextLine();
                    readFromFile(fileName);
                    break;

                case 3:
                    System.out.print("Enter file name to append to: ");
                    fileName = scanner.nextLine();
                    System.out.print("Enter content to append: ");
                    String appendText = scanner.nextLine();
                    appendToFile(fileName, appendText);
                    break;

                case 4:
                    System.out.print("Enter file name to modify: ");
                    fileName = scanner.nextLine();
                    System.out.print("Enter word to find: ");
                    String target = scanner.nextLine();
                    System.out.print("Enter replacement word: ");
                    String replacement = scanner.nextLine();
                    replaceInFile(fileName, target, replacement);
                    break;

                case 5:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }
}
