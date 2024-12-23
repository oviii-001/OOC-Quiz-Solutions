package Quiz_2_Sec_H;

import java.util.Scanner;

class ATM {
    private String pin; // User's PIN
    private double balance; // User's balance

    // Constructor to initialize the ATM with a PIN and balance
    public ATM(String initialPin, double initialBalance) {
        this.pin = initialPin;
        this.balance = initialBalance;
    }

    // Method to check the balance
    public double checkBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to change the PIN
    public void changePin(String oldPin, String newPin) {
        if (this.pin.equals(oldPin)) {
            this.pin = newPin;
            System.out.println("PIN changed successfully.");
        } else {
            System.out.println("Incorrect old PIN.");
        }
    }

    // Method to get the current PIN (for demonstration purposes)
    public String getPin() {
        return pin;
    }
}

public class Ques_1 {
    public static void main(String[] args) {
        // Example student ID: 123456789
        String initialPin = "789"; // Last 3 digits of student ID
        double initialBalance = 6789; // Last 4 digits of student ID

        ATM atm = new ATM(initialPin, initialBalance);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Change PIN");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: " + atm.checkBalance());
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.print("Enter old PIN: ");
                    String oldPin = scanner.next();
                    System.out.print("Enter new PIN: ");
                    String newPin = scanner.next();
                    atm.changePin(oldPin, newPin);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
