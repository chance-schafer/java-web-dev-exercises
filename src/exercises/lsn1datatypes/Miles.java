package exercises.lsn1datatypes;

import java.util.Scanner;

public class Miles {

    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what is the length of the rectangle:");
        Double length = input.nextDouble();
        System.out.println("What is the width of the rectangle");
        Double width = input.nextDouble();
        Double area = width * length;
        System.out.println("The area of the rectangle is " + area);

    }
}
