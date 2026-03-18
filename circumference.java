import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius, circumference, area, volume;
        System.out.print("Entre the radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI + radius;
        area = Math.PI + Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.println("circumference is: " + circumference + "cm");
        System.out.println("area is: " + area + "cm²");
        System.out.println("volume is: " + volume + "cm³");

        scanner.close();
    }
}