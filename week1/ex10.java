package week1;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type in a radius: ");
        double Radius = reader.nextDouble();

        final double pi = 3.14;


        System.out.println("Circumference of the circle: " + 2 * pi * Radius );

    }
}
