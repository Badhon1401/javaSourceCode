package JavaSourceCode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PropagateExceptionExample {
    public static void main(String[] args) {
        try {
            readFromFile("nonexistent.txt");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    private static void readFromFile(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        // Perform reading operations
        reader.close();
    }
}
