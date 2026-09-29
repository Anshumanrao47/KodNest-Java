import java.util.Scanner;

class Student{
    int id;
    String name;
    int age;
    String course;
    double marks;
}

public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        Student s2 = new Student();

        s1.id = 1;
        s1.name = "John";
        s1.age = 20;
        s1.course = "Computer Science";
        s1.marks = 95;

        s2.id = 2;
        s2.name = "Anshu";
        s2.age = 21;
        s2.course = "java";
        s2.marks  = 92.5;


        System.out.println("Student ID: " + s1.id);
        System.out.println("Student Name: " + s1.name);
        System.out.println("Student Age: " + s1.age);
        System.out.println("Student Course: " + s1.course);
        System.out.println("Student Marks: " + s1.marks);


        System.out.println("Student ID: " + s2.id);
        System.out.println("Student Name: " + s2.name);
        System.out.println("Student Age: " + s2.age);
        System.out.println("Student Course: " + s2.course);
        System.out.println("Student Marks: " + s2.marks);
    }

}