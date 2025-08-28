public class Cafe {
    // Attributes
    MenuItem menuItem1;
    MenuItem menuItem2;
    MenuItem menuItem3;
    Order currentOrder;


    public MenuItem addMenuItem1(MenuItem item) {
        // adds the first menu item to the cafe
        this.menuItem1 = item;
        return menuItem1;
    }

    public MenuItem addMenuItem2(MenuItem item) {
        // adds the second menu item to the cafe
        this.menuItem2 = item;
        return menuItem2;
    }

    public MenuItem addMenuItem3(MenuItem item) {
        // adds the third menu item to the cafe
        this.menuItem3 = item;
        return menuItem3;
    }

    public Order placeOrder(Order order) {
        // places an order
        this.currentOrder = order;
        return currentOrder;
    }

    public void displayMenu() {

        String menuDisplay = "";

        if (menuItem1 != null) {
            menuDisplay += menuItem1.displayItemInfo() + "\n";
        }

        if (menuItem2 != null) {
            menuDisplay += menuItem2.displayItemInfo() + "\n";
        }

        if (menuItem3 != null) {
            menuDisplay += menuItem3.displayItemInfo() + "\n";
        }

        String menu = "Menu:\n" + menuDisplay;
        System.out.println(menu);
    }
}
