package problem3;

	public class Temperature {

	    private double value;
	    private char scale;

	    public Temperature() {
	        value = 0;
	        scale = 'C';
	    }

	    public Temperature(double v) {
	        value = v;
	        scale = 'C';
	    }

	    public Temperature(char s) {
	        value = 0;
	        scale = s;
	    }

	    public Temperature(double v, char s) {
	        value = v;
	        scale = s;
	    }

	    public double getCelsius() {
	        if (scale == 'C') {
	            return value;
	        }
	        return 5 * (value - 32) / 9;
	    }

	    public double getFahrenheit() {
	        if (scale == 'F') {
	            return value;
	        }
	        return (9 * value / 5) + 32;
	    }

	    public void setValue(double v) {
	        value = v;
	    }

	    public void setScale(char s) {
	        if (s == 'C' || s == 'F') {
	            scale = s;
	        }
	    }

	    public void setBoth(double v, char s) {
	        value = v;
	        if (s == 'C' || s == 'F') {
	            scale = s;
	        }
	    }

	    public char getScale() {
	        return scale;
	    
	    }
	}


