package oops1;

import java.util.ArrayList;

public class Student {

    private int id;
    private String name;
    private int marks;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', marks=" + marks + "}";
    }

    public static void main(String[] args) {

        Student s1 = new Student(1, "Name 1", 80);
        Student s2 = new Student(2, "Name 2", 85);
        Student s3 = new Student(3, "Name 3", 90);

        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        for (Student s : students) {
            System.out.println(s);
        }
    }
}
