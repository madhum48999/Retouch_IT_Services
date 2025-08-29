package FIle_IO;

import java.io.*;
import java.util.*;

public class SimpleBank {
    private static final String FILE_NAME = "accounts.txt";

    // Add a new account (write/append to file)
    public static void addAccount(BankAccount acc) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            bw.write(acc.toFileString());
            bw.newLine();
            System.out.println("Account created successfully!");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    // View all accounts (read from file)
    public static void viewAccounts() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            System.out.println("No accounts found (file missing).");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            System.out.println("\n--- All Accounts ---");
            while ((line = br.readLine()) != null) {
                try {
                    BankAccount acc = BankAccount.fromFileString(line);
                    System.out.println("AccNo: " + acc.getAccNo() +
                            ", Name: " + acc.getName() +
                            ", Balance: ₹" + acc.getBalance());
                } catch (Exception e) {
                    System.out.println("⚠️ Skipping invalid line: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("❌ Error reading file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Simple Banking System ---");
            System.out.println("1. Add Account");
            System.out.println("2. View Accounts");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            while (!sc.hasNextInt()) {
                System.out.println("Please enter a valid number.");
                sc.next(); // discard invalid input
            }

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    String accNo = sc.nextLine().trim();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine().trim();
                    System.out.print("Enter Balance: ");

                    while (!sc.hasNextDouble()) {
                        System.out.println("Please enter a valid balance.");
                        sc.next(); // discard invalid input
                    }

                    double balance = sc.nextDouble();
                    sc.nextLine(); // consume newline

                    BankAccount acc = new BankAccount(accNo, name, balance);
                    addAccount(acc);
                    break;

                case 2:
                    viewAccounts();
                    break;

                case 3:
                    System.out.println("Exiting... Have a great day!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 3);

        sc.close();
    }
}
