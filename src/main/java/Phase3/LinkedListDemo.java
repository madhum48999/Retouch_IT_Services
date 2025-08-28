package Phase3;
import java.util.LinkedList;

public class LinkedListDemo {
        public static void main(String[] args) {
            // Create a LinkedList of strings
            LinkedList<String> cities = new LinkedList<>();

            // Add elements to the LinkedList
            cities.add("Delhi");
            cities.add("Mumbai");
            cities.add("Chennai");
            cities.add("Kolkata");

            System.out.println("Original list: " + cities);

            // Remove the first element
            cities.removeFirst();

            // Remove the last element
            cities.removeLast();

            System.out.println("After removing first and last: " + cities);
        }
    }

