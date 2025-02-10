//[1] Simple Inheritance - Student Information System
//  Create a base class Person with data members: name, age, and gender.
//  Derive a class Student from Person with additional data members: student_id, course, and semester.
//  Implement methods to accept and display student details. Demonstrate single inheritance by creating a Student object and displaying all details.

class Person {
    String name;
    int age;
    String gender;

    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;

    }

    void displayDetails()
    {
        System.out.println();
        System.out.println("Name of the Person : " + name);
        System.out.println("Age of the Person : " + age);
        System.out.println("Gender of the Person : " + gender);
    }
}

class Student extends Person {
    long student_id;
    String course;
    short semester;

    public Student(String name, int age, String gender, long student_id, String course, short semester){
        super(name, age, gender);

        this.student_id = student_id;
        this.course = course;
        this.semester = semester;
    }

    void displayDetails()
    {
        System.out.println();
        System.out.println("Name of the Student : " + name);
        System.out.println("Age of the Student : " + age);
        System.out.println("Gender of the Student : " + gender + "\n");

        System.out.println("Student ID : " + student_id);
        System.out.println("Student's Course : " + course);
        System.out.println("Student's Semester : " + semester);
    }
}

public class _01_StudentInformationSystem {

    public static void main(String[] args) {

        Person per1 = new Person("Arthur Morgan", 32, "Male");
        per1.displayDetails();

        Student std1 = new Student("Jinesh", 18, "Male", 24019411132L, "BTech CSE", (short)2);
        std1.displayDetails();

    }

}
