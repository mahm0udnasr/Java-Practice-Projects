import java.util.Random;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numOfDice, total = 0;
        System.out.print("Entre the # of dice to roll: ");
        numOfDice = scanner.nextInt();
        if(numOfDice > 0) {
            for(int i = 0; i < numOfDice; i++) {
                int roll = random.nextInt(1, 7);
                System.out.println("You rolled: "  + roll);
                total += roll;
            }
            System.out.println("Total: " + total);
        } else {
            System.out.println("# of dice must be greater than zero");
        }
        scanner.close();
    }
}