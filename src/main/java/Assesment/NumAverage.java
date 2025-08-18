package Assesment;

import java.util.Scanner;

public class NumAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the 3 Number to Find the average: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int average = (a+b+c)/3;

        System.out.println("Average of 3 numbers is: "+average);
    }
}
