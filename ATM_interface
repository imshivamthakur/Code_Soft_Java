import java.util.InputMismatchException;
import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}

public class ATM {
    private BankAccount account;
    private Scanner scanner;

    public ATM(BankAccount account) {
        this.account = account;
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            displayMenu();
            int option = getOption();
            processOption(option);
        }
    }

    private void displayMenu() {
        System.out.println("ATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Exit");
    }

    private int getOption() {
        while (true) {
            try {
                System.out.print("Enter your choice: \n");
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // discard invalid input
            }
        }
    }

    private void processOption(int option) {
        switch (option) {
            case 1:
                checkBalance();
                break;
            case 2:
                withdraw();
                break;
            case 3:
                deposit();
                break;
            case 4:
                System.out.println("Goodbye!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option. Please try again.");
        }
    }

    private void checkBalance() {
        System.out.println("Your current balance is: ₹ " + account.getBalance());
    }

    private void withdraw() {
        while (true) {
            try {
                System.out.print("Enter amount to withdraw: ₹");
                double amount = scanner.nextDouble();
                if (amount > 0) {
                    if (account.withdraw(amount)) {
                        System.out.println("Withdrawal successful. Your new balance is: ₹" + account.getBalance());
                    } else {
                        System.out.println("Insufficient balance. Please try again.");
                    }
                    return;
                } else {
                    System.out.println("Invalid amount. Please enter a positive number.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // discard invalid input
            }
        }
    }

    private void deposit() {
        while (true) {
            try {
                System.out.print("Enter amount to deposit: ₹");
                double amount = scanner.nextDouble();
                if (amount > 0) {
                    account.deposit(amount);
                    System.out.println("Deposit successful. Your new balance is: ₹" + account.getBalance());
                    return;
                } else {
                    System.out.println("Invalid amount. Please enter a positive number.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.\n");
                scanner.next(); // discard invalid input
            }
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0); // initial balance of ₹1000
        ATM atm = new ATM(account);
        atm.run();
    }
}
