import java.util.*;
class ZeroException extends Exception {
    ZeroException() {
        super("Number is 0");
    }
}

class InvalidNumberException extends Exception {
    InvalidNumberException() {
        super("Number is Invalid");
    }
}

class Slip30B {
    public static void main(String[] args) {
        int r, sum = 0, temp;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number:");

            if (!sc.hasNextInt()) {
                throw new InvalidNumberException();
            }

            int n = sc.nextInt();
            sc.close();

            if (n == 0) {
                throw new ZeroException();
            } else {
                temp = n;
                while (n > 0) {
                    r = n % 10;
                    sum = (sum * 10) + r;
                    n = n / 10;
                }
                if (temp == sum)
                    System.out.println("Palindrome number " + temp);
                else
                    System.out.println("Not a palindrome number");
            }

        } catch (ZeroException e) {
            System.out.println(e.getMessage());
        } catch (InvalidNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}
