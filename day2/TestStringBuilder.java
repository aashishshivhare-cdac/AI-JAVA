package day2;

public class TestStringBuilder {
    public static void main(String[] args) {
        String s1 = "Aashish";
        StringBuilder sb = new StringBuilder(s1);
        sb.reverse();
        System.out.println(sb);
        System.out.println(s1);
        sb.delete(2,4);
        System.out.println(sb);
    }
}
