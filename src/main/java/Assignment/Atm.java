package Assignment;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your 4-Digit PIN: ");
        int pin = input.nextInt();
        int choice;
        double balance=0;
        double withdraw;
        double deposit;

        while (true) {
            if (pin == 1234) {
                System.out.println(" ");
                System.out.println("-----ATM MENU-----");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");

                choice = input.nextInt();

                if (choice == 4) {
                    System.out.println("ATM Closed. GOOD BYE!");
                    break;
                }
                if (choice < 1 && choice >= 5) {
                    System.out.println("Invalid Option, Enter a Valid Option");
                }
                switch (choice) {
                    case 1:
                        System.out.println("Total Bank Balance is: "+balance);
                        break;
                    case 2:
                        System.out.println("Enter an amount to deposit: ");
                        deposit = input.nextDouble();
                        balance = deposit+balance;
                        System.out.println("Total Balance available: "+balance);
                        break;
                    case 3:
                        System.out.println("Enter Withdrawal amount: ");
                        withdraw = input.nextDouble();
                        if(withdraw < balance){
                            System.out.println("Withdrawl of " + withdraw + " successful");
                            balance = balance-withdraw;
                            System.out.println("Total Balance Available: "+balance);
                        }
                        else{
                            System.out.println("Withdrawal amount is more than the available balance");
                            System.out.println("Total Balance Available: "+balance);
                        }
                        break;
                }
            }
            else {
                System.out.println("Incorrect PIN");
                break;
            }
        }
    }

}