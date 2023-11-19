package oop2;

import java.io.File;
import java.util.Scanner;

class FileAnalyzer {
    // display information about file user specifies
    public void analyzePath(String path) {
        // create File object based on user input
        File file = new File(path);

        if (file.exists()) { // if file exists, output information about it
            // display file (or directory) information
            System.out.printf(
                    "%s%s\n%s\n%s\n%s\n%s%s\n%s%s\n%s%s\n%s%s\n%s%s",
                    file.getName(), " exists",
                    (file.isFile() ? "is a file" : "is not a file"),
                    (file.isDirectory() ? "is a directory" :
                            "is not a directory"),
                    (file.isAbsolute() ? "is absolute path" :
                            "is not absolute path"), "Last modified: ",
                    file.lastModified(), "Length: ", file.length(),
                    "Path: ", file.getPath(), "Absolute path: ",
                    file.getAbsolutePath(), "Parent: ", file.getParent());

            if (file.isDirectory()) { // output directory listing
                String[] directory = file.list();
                System.out.println("\n\nDirectory contents:\n");

                if (directory != null) {
                    for (String directoryName : directory)
                        System.out.printf("%s\n", directoryName);
                } else {
                    System.out.println("Unable to list directory contents.");
                }
            }
        } else { // not a file or directory, output error message
            System.out.printf("%s %s", path, "does not exist.");
        }
    } // end method analyzePath
} // end class FileAnalyzer

public class FileAnalyzerDemo {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        FileAnalyzer fileAnalyzer = new FileAnalyzer();

        System.out.print("Enter file or directory name here: ");
        fileAnalyzer.analyzePath(input.nextLine());
    } // end main
} // end class FileAnalyzerDemo



