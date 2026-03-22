import java.util.Scanner;
class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double balance = 0;
        boolean isRunning = true;
        int menuChoice;
        while (isRunning) {
            // Display Menu
            System.out.println("***************");
            System.out.println("BANKING PROGRAM");
            System.out.println("***************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("***************");

            // get user choice
            System.out.print("Entre your choice (1-4): ");
            menuChoice = scanner.nextInt();

            switch (menuChoice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid Choice!");
            }
        }
        System.out.println("***************************");
        System.out.println("Thank you! Have a nice day!");
        scanner.close();
    }
    static void showBalance(double balance) {
        System.out.printf("\nYour Balance $%.2f\n\n", balance);
    }
    static double deposit() {
        double amount;
        System.out.print("Entre an amount to be deposited: ");
        amount = scanner.nextDouble();
        if(amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        }
        return amount;
    }
    static double withdraw(double balance) {
        double amount;
        System.out.print("Entre an amount to be withdraw: ");
        amount = scanner.nextDouble();
        if(amount > balance) {
            System.out.println("INSUFFICIENT FUNDS");
            return 0;
        } else if(amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        }
        return amount;
    }
}