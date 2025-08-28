package Phase3;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Create an empty ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Check size and if it's empty
        System.out.println("Initial size: " + fruits.size());       // Output: 0
        System.out.println("Is empty? " + fruits.isEmpty());        // Output: true

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");

        // Check size and if it's empty again
        System.out.println("Size after adding elements: " + fruits.size());   // Output: 2
        System.out.println("Is empty now? " + fruits.isEmpty());              // Output: false
    }
}
