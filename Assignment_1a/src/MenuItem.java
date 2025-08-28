// Date: August
// Course: CIS 3303
// Instructor: Dr. Tania Roy

public class MenuItem {
    // Attributes
    String name;
    double price;
    String category;

    // Constructor
    public MenuItem(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // Getters and setters for name, price, and category
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    // Method to display item information
    public String displayItemInfo() {
        // Formats the price to two decimal places
        String priceString = String.format("%.2f", price);
        String itemInfo = "Name: " + name + ", Price: $" + priceString + ", Category: " + category;
        return itemInfo;
    }
}


