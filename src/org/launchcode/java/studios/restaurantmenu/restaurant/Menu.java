package org.launchcode.java.studios.restaurantmenu.restaurant;

import java.util.Arrays;
import java.util.Date;
import java.util.ArrayList;
//import java.util.Arrays;

public class Menu {

    private Date dateLastUpdated;
    private MenuItem special;
    private ArrayList<MenuItem> items;

    public Menu(ArrayList<MenuItem> items) {
        this.items = items;
        this.dateLastUpdated = new Date();
    }

    // Getters
    public MenuItem getSpecial() {
        return special;
    }
    public Date getDateLastUpdated() {
        return dateLastUpdated;
    }
    public ArrayList<MenuItem> getItems() {
        return items;
    }

    // Setters

    public void setSpecial(MenuItem special) {
        this.special = special;
    }

    public void addItem(MenuItem item) {
        this.items.add(item);
    }

    public void removeItem(MenuItem item) {
        this.items.remove(item);
    }

    public void printMenu() {
        for(MenuItem item : items) {
            System.out.println(item.itemListing());
            System.out.println("----------");
        }
    }

}
