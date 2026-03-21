import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // Enhanced switch = A replacement to many else if statements
        // (Java14 feature)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre the day: ");
        String day = scanner.nextLine();
        switch (day) {
            case "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday" ->
                    System.out.println("Day is work");
            case "Friday" -> System.out.println("Day is off");
            default -> System.out.println("Day is not found!");
        }
        scanner.close();
    }
}