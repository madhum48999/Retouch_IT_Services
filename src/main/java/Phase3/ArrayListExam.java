package Phase3;

import java.util.ArrayList;

public class ArrayListExam {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add 10 numbers to the ArrayList
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        // Print the numbers using a for-each loop
        for (int number : numbers) {
            System.out.print(number+" , ");
        }
    }
}