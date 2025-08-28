import java.util.Scanner;

public class Test1a {
    public static void main(String[] args) {
        // Create menu items
        MenuItem coffee = new MenuItem("Coffee", 2.50, "Beverage");
        MenuItem blueberryMuffin = new MenuItem("Blueberry Muffin", 3.99, "Breakfast");
        MenuItem lemonCake = new MenuItem("Lemon Cake", 3.00, "Dessert");

        // Create a cafe and add the menu items
        Cafe cafe = new Cafe();
        cafe.addMenuItem1(coffee);
        cafe.addMenuItem2(blueberryMuffin);
        cafe.addMenuItem3(lemonCake);

        // Display the menu
        cafe.displayMenu();

        // Create an order and add desired items
        Order order = new Order();
        order.addItem1(coffee);
        order.addItem2(lemonCake);

        // Place the order
        cafe.placeOrder(order);

        // Display order details
        order.displayOrderDetails();


        // User input for t
        System.out.println("\n" + "Now you can create your own cafe menu and order!");
        System.out.println("There will be three menu items in your cafe.");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of your first menu item: ");
        String itemName1 = scanner.nextLine();
        System.out.println("Your first menu item is: " + itemName1);
        System.out.println("Enter the price of your first menu item: ");
        double itemPrice1 = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character
        String itemPriceSet = String.format("%.2f", itemPrice1);
        System.out.println("Your first menu item price is: $" + itemPriceSet);
        System.out.println("Enter the category (type of item) of your first menu item: ");
        String itemCategory1 = scanner.nextLine();
        System.out.println("Your first menu item category is: " + itemCategory1);

        scanner.close();

    }
}
