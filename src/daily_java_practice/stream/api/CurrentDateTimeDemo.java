package daily_java_practice.stream.api;

import java.time.LocalDateTime;

//How will you get the current date and time using Java 8 Date and Time API?

public class CurrentDateTimeDemo {
	public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current DateTime: " + now); // yyyy-MM-ddTHH:mm:ss.SSS
    }
}
