import java.util.Scanner;

class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        int rows, columns;
        char symbol;

        System.out.print("Entre the # of rows: ");
        rows = scanner.nextInt();
        System.out.print("Entre the # of columns: ");
        columns = scanner.nextInt();
        System.out.print("Entre the symbol to use: ");
        symbol = scanner.next().charAt(0);

        for (int i = 0; i < columns; i++) {
            for(int j = 0; j < rows; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }

        scanner.close();
    }
}