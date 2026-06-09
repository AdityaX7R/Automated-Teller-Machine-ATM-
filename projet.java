import java.util.*;

class Account {
    private double balance;

    // Constructor
    Account(double balance) {
        this.balance = balance;
    }

    // Getter
    public double getBalance() {
        return balance;
    }

    // Withdraw method
    public void withdraw(double amount) throws Exception {
        if (amount <= 0) {
            throw new Exception("Invalid amount");
        }
        if (amount > balance) {
            throw new Exception("Insufficient balance");
        }
        balance -= amount;
        System.out.println("Transaction successful");
    }
}

class ATM {
    static int PIN = 1234;

    public boolean authenticate(int enteredPin) {
        return enteredPin == PIN;
    }

    public void showMenu(Account acc) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Withdraw");
            System.out.println("2. Check Balance");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            try {
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter amount: ");
                        double amount = sc.nextDouble();

                        try {
                            acc.withdraw(amount);
                        } catch (Exception e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;

                    case 2:
                        System.out.println("Balance: " + acc.getBalance());
                        break;

                    case 3:
                        System.out.println("Thank you for using ATM");
                        return;

                    default:
                        System.out.println("Invalid choice");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input");
                sc.next(); // clear buffer
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account acc = new Account(2000); // initial balance
        ATM atm = new ATM();

        System.out.print("Enter PIN: ");
        int enteredPin = sc.nextInt();

        if (atm.authenticate(enteredPin)) {
            atm.showMenu(acc);
        } else {
            System.out.println("Incorrect PIN. Access denied.");
        }
    }
}
