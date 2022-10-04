package org.launchcode.java.studios.restaurantmenu.restaurant;

import java.util.Date;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private boolean isNew;
    private Date dateCreated;

    public MenuItem(String name, double price, String description, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = true;
        this.dateCreated = new Date();
    }

    // Getters
    public double getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public String getCategory() {
        return this.category;
    }

    public boolean isNew() {
        return this.isNew;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    // Setters

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void changeNewStatus(boolean status) {
        this.isNew = status;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    // Methods

    public String itemListing() {
        return name + "\n" + description + "\n" + price;
    }


//    public String description;
//    public double price;
//    public String category;
//    public Boolean newItem;
//
//    public String name;
//
//    public MenuItem(String description, double price,String category, Boolean newItem) {
//        this.description = description;
//        this.price = price;
//        this.category = category;
//        this.newItem = newItem;
//    }
//
//    public void setMenuItemName(String arg) {
//        this.name = arg;
//    }
//
//    public void newMenuItem() {
//        if(this.newItem = true) {
//            System.out.println("This is a new menu item!");
//        } else {
//            System.out.println("This menu item is an old favorite");
//        }
//    }
//
//    protected double changePrice(double value) {
//        this.price += value;
//        System.out.println("The new price for " + this.name + " is: $" + this.price);
//        return this.price;
//    }
}
