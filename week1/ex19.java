package week1;

import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("HOW OLD ARE YOU?: ");
        int number = reader.nextInt();

        if (number >= 0 && number <= 120 )
            System.out.println("OK" );
        else
            System.out.println("Impossible!");
    }
}
