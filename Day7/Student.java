package day7;

public class Student implements Comparable<Student> {
    private int roll_no;
    private String name;

    public Student(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentComporator{" +
                "roll_no=" + roll_no +
                ", name='" + name + '\'' +
                '}';
    }
    @Override
    public int compareTo(Student o) {
        //return this.getName().hashCode() - o.getName().hashCode();
        return this.getRoll_no() - o.getRoll_no();
    }
}
