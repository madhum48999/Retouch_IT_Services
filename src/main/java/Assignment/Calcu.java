package Assignment;
import java.util.Scanner;

public class Calcu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("--- Calculator Menu ---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            choice = input.nextInt();
            double num1,num2,result;

                if(choice == 5){
                    System.out.println("Calculator Closed. GOOD BYE!");
                    break;
                }
            if (choice < 1 || choice > 5) {
                System.out.println("Invalid choice. Please select a valid option.");
                continue;
            }
                System.out.print("Enter first number: ");
                num1=input.nextDouble();
                System.out.print("Enter second number: ");
                num2 = input.nextDouble();

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
            }
            //close scanner to free system resources
            Scanner.close();
        }

    }
}