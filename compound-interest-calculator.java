import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double principal, rate, amount;
        int timesCompounded, years;
        System.out.print("Entre the principal amount: ");
        principal = scanner.nextDouble();
        System.out.print("Entre the interset rate (in %): ");
        rate = scanner.nextDouble() / 100;
        System.out.print("Entre the # of times compounded per year: ");
        timesCompounded = scanner.nextInt();
        System.out.print("Entre the # of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow((1+ rate / timesCompounded), timesCompounded * years);
        System.out.printf("The amount after %d is $%.2f", years, amount);

        scanner.close();
    }
}