package daily_java_practice.stream.api;

import java.time.LocalDate;

// How will you get the current date and time using Java 8 Date and Time API?

public class CurrentDateDemo {
	public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today's Date: " + today); // yyyy-MM-dd
    }
}
