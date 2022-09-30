package week6;

public class Ex100 {
    public static void main(String[] args) {


        NightSky NightSky = new NightSky(10, 5);
        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
        System.out.println("");

        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
    }
}

