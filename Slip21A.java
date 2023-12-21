import java.util.Hashtable;
import java.util.Scanner;

public class SSlip21A {
    public static void main(String[] args) {
        // Create a Hashtable to store city names and STD codes
        Hashtable<String, String> cityStdHashtable = new Hashtable<>();

        // Populate the Hashtable with city names and STD codes
        cityStdHashtable.put("Mumbai", "022");
        cityStdHashtable.put("Pune", "020");
        cityStdHashtable.put("Nagpur", "0712");
        cityStdHashtable.put("Delhi", "011");
        cityStdHashtable.put("Bangalore", "080");

        // Display the details of the Hashtable
        System.out.println("City STD Codes:");
        for (String city : cityStdHashtable.keySet()) {
            String stdCode = cityStdHashtable.get(city);
            System.out.println("City: " + city + ", STD Code: " + stdCode);
        }

        // Search for a specific city and display its STD code
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a city name to search for its STD code: ");
        String searchCity = scanner.nextLine();

        if (cityStdHashtable.containsKey(searchCity)) {
            String stdCode = cityStdHashtable.get(searchCity);
            System.out.println("STD Code for " + searchCity + ": " + stdCode);
        } else {
            System.out.println("City not found in the Hashtable.");
        }

        scanner.close();
    }
}
