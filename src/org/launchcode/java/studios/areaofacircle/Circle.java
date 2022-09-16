package org.launchcode.java.studios.areaofacircle;

public class Circle {
    public static double getArea(double radius) {
        return Math.round(Math.PI * Math.pow(radius, 2) * 1000.0) / 1000.0;
    }
}
