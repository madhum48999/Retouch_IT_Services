package Assesment;

import java.util.Scanner;

public class SumEveOdd {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

                // Prompt user for the number of integers
                System.out.print("Enter the number of integers: ");
                int count = scanner.nextInt();

                int sumEven = 0;
                int sumOdd = 0;

                System.out.println("Enter " + count + " integers:");
                for (int i = 0; i < count; i++) {
                    int num = scanner.nextInt();
                    if (num % 2 == 0) {
                        sumEven += num;
                    } else {
                        sumOdd += num;
                    }
                }

                System.out.println("Sum of even integers: " + sumEven);
                System.out.println("Sum of odd integers: " + sumOdd);

            }
        }
