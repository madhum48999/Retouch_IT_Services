package Assignment;
import java.util.Scanner;

public class Calcu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean cont = true;
        int choice=0;

        while (cont && choice<=4) {
            System.out.println("--- Calculator Menu ---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            choice = input.nextInt();


                System.out.print("Enter first number: ");
                double num1 = input.nextDouble();

                System.out.print("Enter second number: ");
                double num2 = input.nextDouble();

                double result;

            switch (choice) {
                case 1:

                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                case 5:
                    cont = false;
                    System.out.println("Calculator closed.");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
            System.out.println("Closed"); // Add a blank line for better readability
        }
        input.close();
    }
}