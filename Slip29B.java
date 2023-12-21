import java.util.Scanner;

class AgeNotValidException extends Exception {
    public AgeNotValidException(String message) {
        super(message);
    }
}

public class Slip29B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter candidate's age: ");
        int age = scanner.nextInt();

        try {
            checkEligibility(age);
        } catch (AgeNotValidException e) {
            System.err.println("Age not valid: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }

        scanner.close();
    }

    public static void checkEligibility(int age) throws AgeNotValidException {
        if (age >= 18) {
            System.out.println("Candidate is eligible to vote.");
        } else {
            throw new AgeNotValidException("Candidate is not eligible to vote. Age must be at least 18.");
        }
    }
}
