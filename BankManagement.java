import java.util.Scanner;

public class BankManagement {

    private static double balance = 0.0;

    
    static void deposit(Scanner scanner) {
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Amount must be greater than zero.");
        }
    }
    static void withdraw(Scanner scanner) {
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();

        if (amount <= 0) {
            System.out.println("Amount must be greater than zero.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        }
    }

    // Display current balance
    static void checkBalance() {
        System.out.printf("Current Balance: ₹%.2f%n", balance);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("================================");
        System.out.println("     BANK MANAGEMENT SYSTEM");
        System.out.println("================================");

        do {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                deposit(scanner);

            } else if (choice == 2) {
                withdraw(scanner);

            } else if (choice == 3) {
                checkBalance();

            } else if (choice == 4) {
                System.out.println("Thank you for using the Bank Management System.");

            } else {
                System.out.println("Invalid choice. Please select 1-4.");
            }

        } while (choice != 4);

        scanner.close();
    }
}

