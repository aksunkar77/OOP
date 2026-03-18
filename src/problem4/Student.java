package problem4;

public class Student {

    private String name;
    private int id;
    private int grade;

    public Student(String n, int i, int g) {
        name = n;
        id = i;
        grade = g;
    }

    public int getGrade() {
        return grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name + " (id: " + id + ", grade: " + grade + ")";
    }
}
