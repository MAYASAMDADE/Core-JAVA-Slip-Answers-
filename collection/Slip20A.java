
import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class Slip20A {
    public static void main(String[] args) {
        // Create a LinkedList and add names to it
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CPP");
        linkedList.add("Java");
        linkedList.add("Python");
        linkedList.add("PHP");

        // Display the contents of the List using an Iterator
        System.out.println("Contents of the List using an Iterator:");
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Display the contents of the List in reverse order using a ListIterator
        System.out.println("\nContents of the List in reverse order using a ListIterator:");
        ListIterator<String> listIterator = linkedList.listIterator(linkedList.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
