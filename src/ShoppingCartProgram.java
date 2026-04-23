import java.util.Scanner;

public class ShoppingCartProgram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // shopping cart program
        System.out.print("What items would you like to buy?: ");
        String items = scanner.nextLine();

        System.out.print("What is the price for each?: ");
        double price = scanner.nextDouble();

        System.out.print("How many would you like to buy?: ");
        int quantity = scanner.nextInt();
        scanner.close();

        double total = price * quantity;

        System.out.println("\nYou have bought " + quantity + " " + items + "/s");
        System.out.println("Your total is " + total + "$");
    }
}
