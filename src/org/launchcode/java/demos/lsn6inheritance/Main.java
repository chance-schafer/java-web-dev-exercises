package org.launchcode.java.demos.lsn6inheritance;

public class Main {

    public static void main(String[] args) {

        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        garfield.setTired(false);
        System.out.println(garfield.isSatisfied());
        System.out.println(garfield.noise());

        Cat suki = new HouseCat("Suki", 8);

        System.out.println(((HouseCat) suki).isSatisfied());
    }

}
