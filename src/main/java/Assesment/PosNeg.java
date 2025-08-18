package Assesment;

import java.util.Scanner;

public class PosNeg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 0){
            System.out.println("Positive Number");
        }
        else {
            System.out.println("Negative Number");
        }
    }
}
