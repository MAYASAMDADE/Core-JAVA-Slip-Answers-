/*import java.io.FileInputStream;
import java.io.IOException;

public class Slip26A {
    public static void main(String[] args) {
        String fileName = "File.txt"; // Replace with the name of your input file

        try {
            FileInputStream fis = new FileInputStream(fileName);
            int character;

            while ((character = fis.read()) != -1) {
                char c = (char) character;
                int asciiValue = (int) c;

                System.out.println("Character: " + c + " ASCII Value: " + asciiValue);
            }

            fis.close();
        } catch (IOException e) {
            System.err.println("Error reading from the file: " + e.getMessage());
        }
    }
}*/
import java.io.FileInputStream;
import java.io.IOException;

public class Slip26A {
    public static void main(String[] args) throws IOException {
        String fileName = "File.txt"; // Replace with the name of your input file

        FileInputStream F1 = new FileInputStream(fileName);
        int character;

        while ((character = F1.read()) != -1) {
            char c = (char) character;
            int asciiValue = (int) c;

            System.out.println("Character: " + c + " ASCII Value: " + asciiValue);
        }

        F1.close();
    }
}

