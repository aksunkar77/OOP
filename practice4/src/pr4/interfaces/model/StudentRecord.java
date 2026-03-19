package pr4.interfaces.model;

public class StudentRecord implements Comparable<StudentRecord> {
    private String name;
    private double gpa;

    public StudentRecord(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public int compareTo(StudentRecord other) {
        return Double.compare(this.gpa, other.gpa);
    }

    @Override
    public String toString() {
        return name + " " + gpa;
    }
}