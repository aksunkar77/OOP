package circuit;

public class Resistor extends Circuit {

    private double resistance;
    private double potentialDiff;

    public Resistor(double r) {
        resistance = r;
        potentialDiff = 0;
    }

    public double getResistance() {
        return resistance;
    }

    public double getPotentialDiff() {
        return potentialDiff;
    }

    public void setPotentialDiff(double v) {
        potentialDiff = v;
    }

    public void applyPotentialDiff(double v) {
        potentialDiff = v;
    }
}
