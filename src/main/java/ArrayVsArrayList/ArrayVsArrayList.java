package ArrayVsArrayList;

import java.util.ArrayList;

public class ArrayVsArrayList {
    public static void main(String[] args) {
        // Using Array
        System.out.println("=== Array Example ===");
        int[] numbers = new int[3]; // Fixed-size array
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;

        // Iterate over array
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }
        System.out.println("Array length: " + numbers.length);

        // Using ArrayList
        System.out.println("\n=== ArrayList Example ===");
        ArrayList<String> names = new ArrayList<>();
        names.add("Madan"); // Add elements
        names.add("Surendar");
        names.add(0, "Ashish"); // Add at index 0

        // Iterate over ArrayList
        for (String name : names) {
            System.out.println("Name: " + name);
        }
        System.out.println("ArrayList size: " + names.size());

        // Additional ArrayList operations
        names.remove("Bob"); // Remove element
        System.out.println("After removing Bob: " + names);
        System.out.println("Contains Alice? " + names.contains("Alice"));
    }
}