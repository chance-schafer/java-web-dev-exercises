package org.launchcode.java.studios.restaurantmenu.restaurant;

public class MenuItem {

    public String description;
    public double price;
    public String category;
    public Boolean newItem;

    public String name;

    public MenuItem(String description, double price,String category, Boolean newItem) {
        this.description = description;
        this.price = price;
        this.category = category;
        this.newItem = newItem;
    }

    public void setMenuItemName(String arg) {
        this.name = arg;
    }

    public void newMenuItem() {
        if(this.newItem = true) {
            System.out.println("This is a new menu item!");
        } else {
            System.out.println("This menu item is an old favorite");
        }
    }

    protected double changePrice(double value) {
        this.price += value;
        System.out.println("The new price for " + this.name + " is: $" + this.price);
        return this.price;
    }
}
