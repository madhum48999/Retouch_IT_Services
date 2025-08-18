package Assesment;

import java.util.Scanner;

public class NumAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the 3 Number to Find the average: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double average = (a+b+c)/3;

        System.out.println("Average of 3 numbers is: "+average);
    }
}
