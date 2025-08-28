package Phase3;
import java.util.LinkedList;


public class LinkedListExam {

        public static void main(String[] args) {
            // Create a LinkedList of strings
            LinkedList<String> names = new LinkedList<>();

            // Add 5 names to the LinkedList
            names.add("Alice");
            names.add("Bob");
            names.add("Charlie");
            names.add("David");
            names.add("Emma");

            // Retrieve the 3rd element (index 2)
            String thirdName = names.get(2);
            // Print the 3rd name
            System.out.println("The 3rd name is: " + thirdName);

        }
    }


