import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        String ItemName;
        double ItemPrice, total = 0;
        int ItemCount;
        Scanner item = new Scanner(System.in);
        System.out.print("What item would you like to buy : ");
        ItemName = item.nextLine();
        System.out.print("What is the price for each      : ");
        ItemPrice = item.nextDouble();
        System.out.print("How many would you like         : ");
        ItemCount = item.nextInt();
        total = ItemPrice * ItemCount;
        System.out.println("\nYou have bought " + ItemCount + " " + ItemName + "/s");
        System.out.println("Your total is $" + total);
        item.close();
    }
}