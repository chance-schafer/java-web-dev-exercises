package org.launchcode.java.studios.restaurantmenu.restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateMenu {

    public static void main(String[] args) {
        ArrayList<MenuItem> menuItems = new ArrayList<>();

        MenuItem buffaloWings = new MenuItem("Buffalo Wings", 13.99, "crispy wings fried and tossed in our famous buffalo sauce, served with a side of blue cheese dressing.", "Appetizer");
        MenuItem cheeseburger = new MenuItem("Cheeseburger", 15.99, "American classic served with lettuce, cheese, tomatoes, and pickles. Comes with a side of fries", "Entree");

        menuItems.add(cheeseburger);
        menuItems.add(buffaloWings);
        Menu menu = new Menu(menuItems);

        menu.addItem(new MenuItem("Milkshake", 8.99, "available in vanilla, chocolate, or strawberry", "Dessert"));

        menu.printMenu();

        menu.removeItem(cheeseburger);

        menu.printMenu();

        System.out.println(cheeseburger.getDateCreated());

    }

}
