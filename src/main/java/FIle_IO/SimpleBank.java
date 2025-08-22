package FIle_IO;

import java.io.*;
import java.util.*;

class BankAccount {
    private String accNo;
    private String name;
    private double balance;

    public BankAccount(String accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    public String getAccNo() {
        return accNo;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    // Convert account details to text for saving in file
    public String toFileString() {
        return accNo + "," + name + "," + balance;
    }

    // Convert text back into BankAccount object
    public static BankAccount fromFileString(String line) {
        String[] parts = line.split(",");
        return new BankAccount(parts[0], parts[1], Double.parseDouble(parts[2]));
    }
}

public class SimpleBank {
    private static final String FILE_NAME = "accounts.txt";

    // ✅ Add a new account (write/append to file)
    public static void addAccount(BankAccount acc) {
        try (FileWriter fw = new FileWriter(FILE_NAME, true)) {
            fw.write(acc.toFileString() + "\n");
            System.out.println("Account created successfully!");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }

    // ✅ View all accounts (read from file)
    public static void viewAccounts() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            System.out.println("\n--- All Accounts ---");
            while ((line = br.readLine()) != null) {
                BankAccount acc = BankAccount.fromFileString(line);
                System.out.println("AccNo: " + acc.getAccNo() +
                        ", Name: " + acc.getName() +
                        ", Balance: " + acc.getBalance());
            }
        } catch (FileNotFoundException e) {
            System.out.println("No accounts found (file missing).");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
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
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    String accNo = sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Balance: ");
                    double balance = sc.nextDouble();
                    BankAccount acc = new BankAccount(accNo, name, balance);
                    addAccount(acc);
                    break;

                case 2:
                    viewAccounts();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 3);

        sc.close();
    }
}
