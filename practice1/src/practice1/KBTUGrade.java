package practice1;

import java.util.Scanner;

public class KBTUGrade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();

        String grade;

        if (score >= 95 && score <= 100) {
            grade = "A";
        } else if (score >= 90) {
            grade = "A-";
        } else if (score >= 85) {
            grade = "B+";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 75) {
            grade = "B-";
        } else if (score >= 70) {
            grade = "C+";
        } else if (score >= 65) {
            grade = "C";
        } else if (score >= 60) {
            grade = "C-";
        } else if (score >= 55) {
            grade = "D+";
        } else if (score >= 50) {
            grade = "D";
        } else if (score >= 0) {
            grade = "F";
        } else {
            grade = "Invalid";
        }

        System.out.println(grade);

        sc.close();
    }
}

