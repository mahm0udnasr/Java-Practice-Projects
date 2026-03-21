import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, newWeight;
        int choice;
        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        System.out.print("Choose an option: ");
        choice = scanner.nextInt();

        if(choice == 1) {
            System.out.print("Entre the weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("%.2flbs is %.2fkgs", weight, newWeight);
        } else if (choice == 2) {
            System.out.print("Entre the weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("%.2fkgs is %.2flbs", weight, newWeight);
        } else {
            System.out.println("Not a valid choice");
        }
        scanner.close();
    }
}