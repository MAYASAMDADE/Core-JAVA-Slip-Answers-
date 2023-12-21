import java.io.*;
import java.util.*;

class Slip22A {
    public static void main(String[] args) {
        File f2, fi;
        String S1, S2;
        System.out.println("1. To Create a file.");
        System.out.println("2. To rename a file.");
        System.out.println("3. To delete a file.");
        System.out.println("4. To display the path.");
        System.out.println("Enter your choice:");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter File name:");
                sc.nextLine(); // Consume newline character
                String fname = sc.nextLine();
                try {
                    FileWriter fw = new FileWriter(fname);
                    System.out.println("File is created.");
                    fw.close();
                } catch (IOException e) {
                    System.out.println("Error creating the file: " + e.getMessage());
                }
                break;

            case 2:
                System.out.println("Enter Original File name:");
                sc.nextLine(); // Consume newline character
                String originalFileName = sc.nextLine();
                System.out.println("Enter new file name:");
                String newFileName = sc.nextLine();
                fi = new File(originalFileName);
                f2 = new File(newFileName);
                if (fi.renameTo(f2)) {
                    System.out.println("File renamed.");
                } else {
                    System.out.println("Error renaming the file.");
                }
                break;

            case 3:
                System.out.println("Enter file name to delete:");
                sc.nextLine(); // Consume newline character
                String fileNameToDelete = sc.nextLine();
                fi = new File(fileNameToDelete);
                if (fi.delete()) {
                    System.out.println("File deleted.");
                } else {
                    System.out.println("Error deleting the file.");
                }
                break;

            case 4:
                System.out.println("Enter File name:");
                sc.nextLine(); // Consume newline character
                S1 = sc.nextLine();
                fi = new File(S1);
                String path = fi.getAbsolutePath();
                System.out.println("Path: " + path);
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }
}
