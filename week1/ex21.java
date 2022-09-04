package week1;
import java.util.Scanner;
public class ex21 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a year: ");
        int year = reader.nextInt();

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.print("The year is a leap year.");
        } else {
            System.out.print("The year is not a leap year.");
        }

    }
}
