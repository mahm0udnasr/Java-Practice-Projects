import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // init vars
        String[] foods;
        int size;
        // get size of array
        System.out.print("What # of food do you want: ");
        size = scanner.nextInt();
        scanner.nextLine();
        // set a size of array
        foods = new String[size];
        // get user input in array
        for (int i = 0; i < foods.length; i++) {
            System.out.print("Entre a food: ");
            foods[i] = scanner.nextLine();
        }
        // print array
        for(String food : foods) {
            System.out.println(food);
        }
        scanner.close();
    }
}