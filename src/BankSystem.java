import java.util.Scanner;

public class BankSystem {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean isOpen = true;
        int choice;
        double balance = 0;

        while(isOpen) {
            System.out.println("--------BANKING PROGRAM--------");

            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");


            System.out.print("enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch(choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isOpen = false;
                default -> System.out.println("Invalid choice, try again");
            }
            System.out.println("Thank you for visiting :)");
        }
    }

    static void showBalance(double balance) {
        System.out.printf("Current balance: %.2f\n", balance);
    }

    static double deposit() {
        double depositAmount;

        System.out.print("Enter amount to be deposited: ");
        depositAmount = scanner.nextDouble();

        if (depositAmount < 0) {
            System.out.println("Amount cannot be negative!");
            return 0;
        }
        else {
            return depositAmount;
        }
    }

    static double withdraw(double balance) {
        double withdrawAmount;

        System.out.print("Enter amount to be withdrawn: ");
        withdrawAmount = scanner.nextDouble();

        if (withdrawAmount > balance) {
            System.out.println("Not enough balance!");
            return 0;
        } else if (withdrawAmount < 0) {
            System.out.println("Amount cannot be negative!");
            return 0;
        }
        else {
            return withdrawAmount;
        }
    }
}
