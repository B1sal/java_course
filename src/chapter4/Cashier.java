package chapter4;

import java.util.Scanner;

public class Cashier {
    public static void main(String[] args) {
        System.out.println("Enter the number of item you would like to scan:");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();


        double total = 0;
        for(int i=0; i<quantity; i++) {
            System.out.println("Enter the price of the items:");
            double price = scanner.nextDouble();

            total = total + price;
        }
        scanner.close();
        System.out.println("The total price is $ " + total);
    }
}
