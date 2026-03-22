import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // while loop = repeat some code forever
        //              while some condition remains true
        Scanner scanner = new Scanner(System.in);
        String name = "";
        while (name.isEmpty()){
            System.out.print("Entre your name: ");
            name = scanner.nextLine();
        }
        // do {
        //      System.out.print("Entre your name: ");
        //      name = scanner.nextLine();
        // } while (name.isEmpty());
        System.out.println("Hello " + name);
        scanner.close();

        // infinite loop
        // while(1 == 1) {
        //   System.out.println("HAKED!");
        // }
    }
}