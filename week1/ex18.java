package week1;

import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type the points [0-60]: ");
        int number = reader.nextInt();

        if (number <= 29)
            System.out.println("grade: failed " );
        else if(number <= 34)
            System.out.println("grade: 1");
        else if(number <= 39)
            System.out.println("grade: 2");
        else if(number <= 44)
            System.out.println("grade: 3");
        else if(number <= 49)
            System.out.println("grade: 4");
        else
            System.out.println("grade: 5");
    }
}
