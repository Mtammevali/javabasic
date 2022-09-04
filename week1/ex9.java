package week1;
import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        double numberFirst = reader.nextDouble();

        System.out.println("Type another number: ");
        double numberSecond = reader.nextDouble();

        System.out.println("Division: " + numberFirst + " / " + numberSecond + " = " + numberFirst / numberSecond);

    }
}
