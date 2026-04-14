import java.util.Scanner;

class Account {
    double balance;

    // Constructor
    Account(double b) {
        balance = b;
    }

    // Method to withdraw money
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Transaction successful");
        } else {
            System.out.println("Invalid or insufficient balance");
        }
    }

    // Method to check balance
    void showBalance() {
        System.out.println("Balance: " + balance);
    }
}

class ATM {
    int pin = 1234;

    // Method to check PIN
    boolean checkPin(int enteredPin) {
        if (enteredPin == pin) {
            return true;
        } else {
            return false;
        }
    }

    // Menu method
    void menu(Account acc) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Withdraw");
            System.out.println("2. Check Balance");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter amount: ");
                double amt = sc.nextDouble();
                acc.withdraw(amt);

            } else if (choice == 2) {
                acc.showBalance();

            } else if (choice == 3) {
                System.out.println("Thank you for using ATM");
                break;

            } else {
                System.out.println("Invalid choice");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account acc = new Account(2000);
        ATM atm = new ATM();

        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();

        if (atm.checkPin(pin)) {
            atm.menu(acc);
        } else {
            System.out.println("Wrong PIN");
        }
    }
}