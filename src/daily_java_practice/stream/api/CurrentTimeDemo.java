package daily_java_practice.stream.api;

import java.time.LocalTime;

//How will you get the current date and time using Java 8 Date and Time API?

public class CurrentTimeDemo {
	public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println("Current Time: " + now); // HH:mm:ss.SSS
    }
}
