package task5;

public class Chocolate implements Comparable<Chocolate> {
    private double weight;
    private String name;

    public Chocolate(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int compareTo(Chocolate other) {
        
        return Double.compare(this.weight, other.weight);
    }

    @Override
    public String toString() {
        return name + " (" + weight + "g)";
    }
}