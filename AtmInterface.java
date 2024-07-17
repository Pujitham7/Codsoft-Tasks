import java.util.Scanner;

public class AtmInterface {
    private static int balance = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p = 0;
        while (p != 4) {
            display();
            int n = sc.nextInt();
            if (n == 1) {
                System.out.println("Enter the amount:");
                int m = sc.nextInt();
                deposit(m);
            } else if (n == 2) {
                System.out.println("Enter the amount:");
                int m = sc.nextInt();
                withdraw(m);
            } else if (n == 3) {
                System.out.println("Your balance is: " + checkBalance());
                System.out.println(" ");
            } else if (n == 4) {
                System.out.println("Thank You.");
                p = 4;  // Exit the loop
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }
        sc.close();
    }

    private static void display() {
        System.out.println("ATM Interface");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");
    }

    private static void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid amount.");
        }
    }

    private static void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid amount or insufficient balance.");
        }
    }

    private static int checkBalance() {
        return balance;
    }
}

