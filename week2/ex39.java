package week2;
import java.util.Scanner;
public class ex39 {
    private static void printStars(int amount) {
        int times = 1;
        while (true) {
            System.out.print("*");
            if (times == amount) {
                break;

            }
            times++;
        }
        // you can print one star with the command
        // System.out.print("*");
        // call this command amount times
        System.out.println();
    }

    private static void printSquare(int width, int height) {
        int row = 1;
        while (row <= height) {
            int field = 1;
            System.out.print("*");
            while (field <= width) {
                System.out.print("*");
                field++;
            }
            System.out.println();
            row++;
        }

    }

    public static void main(String[] args) {
        printSquare(4,4);

    }



}
