import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre your score: ");
        int score = scanner.nextInt();
        String passOrFail = (score >= 50) ? "PASS" : "FAIL";
        System.out.println(passOrFail);
        scanner.close();
    }
}