package week7;

public class ex4 {
        public static void main(String[] args) {
            thing book = new thing("Happiness in Three Steps", 2);
            thing mobile = new thing("Nokia 3210", 1);

            System.out.println("Book name: " + book.getName());
            System.out.println("Book weight: " + book.getWeight());

            System.out.println("Book: " + book);
            System.out.println("Mobile: " + mobile);
        }
    }


