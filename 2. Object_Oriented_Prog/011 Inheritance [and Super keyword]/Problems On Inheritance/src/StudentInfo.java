// Declare a class called Student having the following data members:
// id_no, no_of_subjects_registered, subject_code, subject_credits, grade_obtained and spi.
// Define constructor and calculate_spi methods.
// Define main to instantiate an array for objects of class student to process data of n students to be given as command line arguments.

import java.util.Scanner;

class Student_ {
    int id_no;
    private static int no_of_subjects_registered;
    private static String[] subject_code;
    private static int[] subject_credits;
    char[] grade_obtained;
    double spi;

    public static void setSubjectDetails (int no_of_subjects_registered, String[] subject_code, int[] subject_credits) {
        Student_.no_of_subjects_registered = no_of_subjects_registered;
        Student_.subject_code = subject_code;
        Student_.subject_credits = subject_credits;
    }

    public Student_ (int id_no, char[] grade_obtained) {
        this.id_no = id_no;
        this.grade_obtained = grade_obtained;
        this.spi = calculate_SPI();
    }

    private double calculate_SPI () {

        int weightedSum = 0;
        int total_credits = 0;

        for (int i = 0; i < no_of_subjects_registered; i++) {

            int gradePoints = getGradePoints(grade_obtained[i]);
            weightedSum += gradePoints * subject_credits[i];
            total_credits += subject_credits[i];
        }

        return (total_credits == 0) ? 0.0 : (double) weightedSum / total_credits ;
    }

    private int getGradePoints(char grade) {
        return switch (grade) {
            case 'A' -> 10;
            case 'B' -> 8;
            case 'C' -> 6;
            case 'D' -> 4;
            case 'E' -> 2;
            case 'F' -> 0;
            default -> 0;
        };
    }

    public void display() {
        System.out.println("ID No: " + id_no);
        System.out.println("Subjects Registered: " + no_of_subjects_registered);
        System.out.println("SPI: " + spi);
    }
}

public class StudentInfo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Students to be evaluated : ");
        int num = sc.nextInt();

        System.out.println("Enter Number of Subjects : ");
        int subjects = sc.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < )
        }

    }
}
