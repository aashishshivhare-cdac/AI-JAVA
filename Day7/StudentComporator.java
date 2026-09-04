package day7;

import java.util.Comparator;

public class StudentComporator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getRoll_no() - o2.getRoll_no();
    }
}
