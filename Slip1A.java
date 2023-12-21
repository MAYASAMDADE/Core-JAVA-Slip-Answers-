import java.io.*;

public class Slip1A {

    public static void main(String[] args) throws Exception {
        String F1 = "source.txt"; // copy non-numeric data
        String F2 = "destination.txt"; // to this file

        FileInputStream i = new FileInputStream(F1);
        FileOutputStream o = new FileOutputStream(F2);

        int data = 0;
        while (data != -1) {
            data = i.read();
            if (data != -1) {
                char character = (char) data;
                if (!Character.isDigit(character)) {
                    o.write(data);
                }
            }
        }

        i.close();
        o.close();

        System.out.println("Non-numeric data copied successfully.");
    }
}
