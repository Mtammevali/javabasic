package week7;

public class thing {
    private String name;
    private int weight;

    public thing(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return this.name + "(weight" + this.weight + " kg)";
    }
}
