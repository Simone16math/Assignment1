public class Order {
    // There are three menu items possible
    MenuItem item1;
    MenuItem item2;
    MenuItem item3;
    double totalPrice = 0.0;

    public MenuItem addItem1(MenuItem item) {
        // adds the first item to the order
        this.item1 = item;
        return item1;
    }

    public MenuItem addItem2(MenuItem item) {
        // adds the second item to the order
        this.item2 = item;
        return item2;
    }

    public MenuItem addItem3(MenuItem item) {
        // adds the third item to the order
        this.item3 = item;
        return item3;
    }

    public double calculateTotalPrice() {
        // calculates the total price of the order

        if (item1 != null) {
            // if item1 is not null, then add its price to totalPrice
            totalPrice += item1.getPrice();
        }

        if (item2 != null) {
            // if item2 is not null, then add its price to totalPrice
            totalPrice += item2.getPrice();
        }

        if (item3 != null) {
            // if item3 is not null, then add its price to totalPrice
            totalPrice += item3.getPrice();
        }

        // returns the total price of the order
        return totalPrice;
    }

    public void displayOrderDetails() {
        // displays the order details

        // Create a string to hold the order details
        String OrderDetails = "";

        if (item1 != null) { // check if item1 is not null
            // if item1 is not null, then display its information
            OrderDetails += item1.displayItemInfo() + "\n";
        }

        if (item2 != null) { // check if item2 is not null
            // if item2 is not null, then display its information
            OrderDetails += item2.displayItemInfo() + "\n";
        }

        if (item3 != null) { // check if item3 is not null
            // if item3 is not null, then display its information
            OrderDetails += item3.displayItemInfo() + "\n";
        }

        // Calculate the total price of the order to two decimal places
        String totalPriceString = String.format("%.2f", calculateTotalPrice());

        // Returns the order details along with the total price of the order

        String orderDetails = "Order Details:\n" + OrderDetails + "Total Price: $" + totalPriceString;
        System.out.println(orderDetails);
    }
}
