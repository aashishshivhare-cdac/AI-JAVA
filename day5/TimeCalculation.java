package day5;

import java.time.LocalDateTime;
import java.util.Date;

public class TimeCalculation {

    public static void main(String[] args) throws InterruptedException {
        long startTime = System.nanoTime();

// Code block you want to measure
        Thread.sleep(2000);

        long endTime = System.nanoTime();
        long durationInNanoseconds = endTime - startTime;

// Convert nanoseconds to seconds (divide by 1 billion)
        double durationInSeconds = (double) durationInNanoseconds / 1_000_000_000;

        System.out.println("Execution time: " + durationInSeconds + " seconds");

    }
}
