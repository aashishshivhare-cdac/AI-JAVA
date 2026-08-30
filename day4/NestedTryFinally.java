package day4;

public class NestedTryFinally {
    public static void main(String[] args) {
    try {                                     // outer try
        try {                                 // inner try
            int[] data = new int[5];
            data[10] = 1;
        } finally {
            System.out.println("FIrst Inner cleanup");  // ALWAYS runs
        }                                     // outer try
        try {                                 // inner try
            int[] data = new int[5];
            data[10] = 1;
        } finally {
            System.out.println("Second Inner cleanup");  // ALWAYS runs
        }
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Caught by outer");
    } finally {
        System.out.println("Outer cleanup");  // ALWAYS runs too
    }
    }
}
