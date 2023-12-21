import java.util.*;

class Slip21A {
    public static void main(String args[]) {
        Hashtable hash = new Hashtable(); // Using raw type
        int cd = 0, f = 0;
        String str = "", str1 = "", temp = "", str2 = "";

        hash.put("delhi", "011");
        hash.put("pune", "020");
        hash.put("navi mumbai", "0215");
        hash.put("nagpur", "0712");
        hash.put("satara", "02162");

        Enumeration names = hash.keys(); // Using raw type
        System.out.println("Printing the entire hashtable...");
        while (names.hasMoreElements()) {
            str = (String) names.nextElement();
            str2 = (String) hash.get(str);
            System.out.println("\t City: " + str);
            System.out.println("\t Code: " + str2 + "\n");
        }
        names = hash.keys(); // Using raw type
        System.out.println("\t Searching the code for the requested city:");
        while (names.hasMoreElements()) {
            str = (String) names.nextElement();
            str2 = (String) hash.get(str);
            if (str.equals(args[0])) {
                f = 1;
                System.out.println("City found");
                System.out.println("\t City: " + str);
                System.out.println("\t Code: " + str2 + "\n");
                break;
            } else
                f = 0;
        }
        if (f == 0)
            System.out.println("Sorry, city not found");
    }
}
