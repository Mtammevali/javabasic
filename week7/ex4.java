package week7;

public class ex4 {
    public static void main(String[] args) {
        thing book = new thing("Happiness in three steps", 2);
        thing mobile = new thing("Nokia 3210", 1);
        thing brick = new thing("Brick", 4);

        Suitcase suitcase = new Suitcase(5);
        System.out.println(suitcase);

        suitcase.addThing(book);
        System.out.println(suitcase);

        suitcase.addThing(mobile);
        System.out.println(suitcase);

        suitcase.addThing(brick);
        System.out.println(suitcase);
    }
    }


