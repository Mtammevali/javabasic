package week4;

import java.util.Scanner;

public class ex79 {
    public static void main(String[] args) {
        NumberStatistics stats = new NumberStatistics();
        System.out.println("Type your number: ");
        Scanner reader = new Scanner(System.in);
        int number;
        //int sum = 0;
        int count = 0;
        int even = 0;
        int odd = 0;
        while (true) {


            number = Integer.parseInt(reader.nextLine());

            if (number == -1) {
                break;
            }
            stats.addNumber(number);
            //sum += number;//sum= sum+number
            count++;
            if(number % 2 == 0){
                even++;
            }
            else {
                odd++;
            }
        }





        //System.out.println("Amount: " + stats.amountOfNumbers());
        System.out.println("sum: " + stats.sum());
        //System.out.println("The sum is " + sum);
        //System.out.println("average: " + stats.average());
        System.out.println("even numbers: "+ even);
        System.out.println("odd numbers: "+ odd);
    }
}
