package problem4;

public class Course {

    private String name;
    private String description;
    private int credits;
    private String prerequisite;

    public Course(String n, String d, int c, String p) {
        name = n;
        description = d;
        credits = c;
        prerequisite = p;
    }

    public String toString() {
        return name + " - " + description + " (" + credits + " credits)";
    }
}
