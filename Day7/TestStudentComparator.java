package day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestStudentComparator {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(1,"A"));
        students.add(new Student(40,"Z"));
        students.add(new Student(4,"S"));
        students.add(new Student(2,"T"));

        System.out.println(students);
        Collections.sort(students);
        System.out.println(students);
    }
}
