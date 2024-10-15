import java.util.Scanner;

class Item {
    private String name;
    private double price;
    private static int totalItemsSold = 0;
    private static double totalRevenue = 0.0;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void sellItem(int quantity) {
        totalItemsSold += quantity;
        totalRevenue += price * quantity;
        System.out.println(quantity + " " + name + "(s) sold for $" + String.format("%.2f", price * quantity));
    }

    public static int getTotalItemsSold() {
        return totalItemsSold;
    }

    public static double getTotalRevenue() {
        return totalRevenue;
    }
}

public class OnlineStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of different items you want to sell: ");
        int numberOfItems = scanner.nextInt();
        scanner.nextLine(); 
        for (int i = 0; i < numberOfItems; i++) {
            System.out.println("Enter details for Item " + (i + 1) + ":");
            System.out.print("Item Name: ");
            String name = scanner.nextLine();

            double price = -1;
            while (price < 0) {
                System.out.print("Item Price: ");
                price = scanner.nextDouble();
                if (price < 0) {
                    System.out.println("Invalid price. Please enter a non-negative value.");
                }
            }

            int quantity = -1;
            while (quantity < 0) {
                System.out.print("Quantity Sold: ");
                quantity = scanner.nextInt();
                if (quantity < 0) {
                    System.out.println("Invalid quantity. Please enter a non-negative value.");
                }
            }

            scanner.nextLine();
            Item item = new Item(name, price);
            item.sellItem(quantity);
        }

        System.out.println("\nTotal Items Sold: " + Item.getTotalItemsSold());
        System.out.println("Total Revenue: $" + String.format("%.2f", Item.getTotalRevenue()));

        scanner.close();
    }
}
