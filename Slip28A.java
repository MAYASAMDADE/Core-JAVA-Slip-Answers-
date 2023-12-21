public class Slip28A {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java Slip28A <list of integers>");
            return;
        }

        int integerCount = 0;

        for (String arg : args) {
            try {
                int number = Integer.parseInt(arg);
                integerCount++;
            } catch (NumberFormatException e) {
                // Ignore non-integer arguments
            }
        }

        System.out.println("Number of integers in the list: " + integerCount);
    }
}
