package problem1;

public class data {

    private double sum;
    private double max;
    private int count;

    public data() {
        sum = 0;
        max = -999999999;
        count = 0;
    }

    public void add(double x) {
        sum = sum + x;

        if (x > max) {
            max = x;
        }

        count = count + 1;
    }

    public double getAverage() {
        if (count == 0) {
            return 0;
        }

        return sum / count;
    }

    public double getMax() {
        if (count == 0) {
            return 0;
        }

        return max;
    }
}

