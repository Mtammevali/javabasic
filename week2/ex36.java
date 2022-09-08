package week2;

import java.util.Scanner;

public class ex36 {
    public static void main(String[] args) {
        System.out.println("Type your number: ");
        Scanner reader = new Scanner(System.in);
        int number;
        int sum = 0;
        int count = 0;
        while (true) {


            number = Integer.parseInt(reader.nextLine());

            if (number == -1) {
                break;
            }
            sum += number;//sum= sum+number
            count++;

        }

        System.out.println("Thank you see you later");
        System.out.println("The sum is " + sum);
        System.out.println("how many numbers?:" + count);
        double average = (double)sum / count;
        System.out.println("average"+ average);
    }
}


