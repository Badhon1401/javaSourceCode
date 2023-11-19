package JavaSourceCode;

import java.io.*;

public class FileOperationsExample {

    public static void main(String[] args) {
        // Specify the file path for demonstration
        String filePath = "example.txt";
        String copyPath = "copy_example.txt";
        String directoryPath = "example_directory";

        // Create and write to a file
        writeFile(filePath, "Hello, this is a file example!");

        // Read and display the content of the file
        String content = readFile(filePath);
        System.out.println("File Content:\n" + content);

        // Copy the file
        copyFile(filePath, copyPath);

        // List files in a directory
        listFiles(directoryPath);

        // Delete the files created
        deleteFile(filePath);
        deleteFile(copyPath);
        deleteDirectory(directoryPath);
    }

    private static void writeFile(String filePath, String content) {
        try (Writer writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
            System.out.println("File created successfully: " + filePath);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    private static String readFile(String filePath) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
        return content.toString();
    }

    private static void copyFile(String sourcePath, String destinationPath) {
        try (InputStream inputStream = new FileInputStream(sourcePath);
             OutputStream outputStream = new FileOutputStream(destinationPath)) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
            System.out.println("File copied successfully to: " + destinationPath);
        } catch (IOException e) {
            System.err.println("Error copying file: " + e.getMessage());
        }
    }

    private static void listFiles(String directoryPath) {
        File directory = new File(directoryPath);
        File[] files = directory.listFiles();
        if (files != null) {
            System.out.println("Files in directory: " + directoryPath);
            for (File file : files) {
                System.out.println(file.getName());
            }
        } else {
            System.err.println("Error listing files in directory: " + directoryPath);
        }
    }

    private static void deleteFile(String filePath) {
        File file = new File(filePath);
        if (file.delete()) {
            System.out.println("File deleted successfully: " + filePath);
        } else {
            System.err.println("Error deleting file: " + filePath);
        }
    }

    private static void deleteDirectory(String directoryPath) {
        File directory = new File(directoryPath);
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                file.delete();
            }
            if (directory.delete()) {
                System.out.println("Directory deleted successfully: " + directoryPath);
            } else {
                System.err.println("Error deleting directory: " + directoryPath);
            }
        } else {
            System.err.println("Error deleting directory: " + directoryPath);
        }
    }
}

