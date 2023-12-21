import java.io.File;

public class Slip8A {
    public static void main(String[] args) {
        // Check if a directory path is provided as a command-line argument
        if (args.length == 0) {
            System.out.println("Usage: java DisplayTextFiles <directory_path>");
            return;
        }

        String directoryPath = args[0];

        File directory = new File(directoryPath);

        // Check if the provided path is a directory
        if (!directory.isDirectory()) {
            System.out.println("The specified path is not a directory.");
            return;
        }

        // List all files in the directory
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile() && file.getName().toLowerCase().endsWith(".txt")) {
                    System.out.println("Found .txt file: " + file.getName());
                }
            }
        } else {
            System.out.println("No files found in the directory.");
        }
    }
}
