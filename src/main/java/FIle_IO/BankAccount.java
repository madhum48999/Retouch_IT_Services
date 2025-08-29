package FIle_IO;

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
        if (parts.length != 3) {
            throw new IllegalArgumentException("Invalid account data: " + line);
        }
        return new BankAccount(parts[0], parts[1], Double.parseDouble(parts[2]));
    }
}

