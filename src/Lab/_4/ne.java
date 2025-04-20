package Lab._4;
import java.util.Scanner;

class SimpleBookPurchase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Book Purchase System ===");

        // Step 1: Ask how many books
        System.out.print("How many books do you want to buy? ");
        int bookCount = scanner.nextInt();

        // Step 2: Initialize total price
        double totalPrice = 0;

        // Step 3: Collect prices for each book and calculate total
        for (int i = 1; i <= bookCount; i++) {
            System.out.print("Enter price for book " + i + ": $");
            double price = scanner.nextDouble();
            totalPrice += price; // Add price to total
        }

        // Step 4: Display results
        System.out.println("\n=== Your Receipt ===");
        System.out.println("Books purchased: " + bookCount);
        System.out.println("Total price: $" + totalPrice);

        scanner.close();
    }
}
