package org.launchcode.java.studios.restaurantmenu.restaurant;

import java.util.Date;
import java.util.HashMap;

public class Menu {

    Date lastUpdated;
    int numOfNewItems;

    public void findNewItems() {
    }

    public void findLatestUpdate() {

    }

    Menu firstMenu = new Menu();

    public static void main(String[] args) {

        HashMap<String, String> menuItems = new HashMap<>();
        MenuItem wontonDip = new MenuItem("Delicious, savory dip!", 6.99, "Appetizer", true);

        wontonDip.setMenuItemName("Wonton Dip");

        Date date = new Date();
        String dateString = date.toString();

        menuItems.put(wontonDip.name, dateString);

        System.out.print(menuItems.entrySet());


    }
}
