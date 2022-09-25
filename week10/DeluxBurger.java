package week10;

public class DeluxBurger extends Hamburger {
    public DeluxBurger() {
        super("Deluxe", "Sausage and Bacon", 14.10, "white");
        super.addHamburgerAddition1("chips", 2.50);
        super.addHamburgerAddition2("drink", 2.50);
    }

    @Override
    public void addHamburgerAddition1(String addTopping, double addPrice) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String addTopping, double addPrice) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String addTopping, double addPrice) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String addTopping, double addPrice) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }
}
