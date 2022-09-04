package week1;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type in number: ");
        double number = reader.nextDouble();
        if (number > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive");
        }


    }
}
