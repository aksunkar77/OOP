package problem4;

import problem4.Student;

public class GradeBook {

    private Course course;
    private Student[] students;
    private int count;

    public GradeBook(Course c, int size) {
        course = c;
        students = new Student[size];
        count = 0;
    }

    public void addStudent(Student s) {
        if (count < students.length) {
            students[count] = s;
            count++;
        }
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + course);
    }

    public double classAverage() {

        double sum = 0;

        for (int i = 0; i < count; i++) {
            sum += students[i].getGrade();
        }

        return sum / count;
    }

    public Student getMax() {

        Student max = students[0];

        for (int i = 1; i < count; i++) {
            if (students[i].getGrade() > max.getGrade()) {
                max = students[i];
            }
        }

        return max;
    }

    public Student getMin() {

        Student min = students[0];

        for (int i = 1; i < count; i++) {
            if (students[i].getGrade() < min.getGrade()) {
                min = students[i];
            }
        }

        return min;
    }

    public void printBarChart() {

        int[] freq = new int[11];

        for (int i = 0; i < count; i++) {
            freq[students[i].getGrade() / 10]++;
        }

        for (int i = 0; i < freq.length; i++) {

            if (i == 10)
                System.out.print("100: ");
            else
                System.out.print(i * 10 + "-" + (i * 10 + 9) + ": ");

            for (int j = 0; j < freq[i]; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public void displayGradeReport() {

        System.out.println("Class average is " + classAverage());

        Student min = getMin();
        Student max = getMax();

        System.out.println("Lowest: " + min);
        System.out.println("Highest: " + max);

        System.out.println("Grades distribution:");
        printBarChart();
    }

    public String toString() {
        return course.toString();
    }
}
