package daily_java_practice.stream.api;

import java.time.Instant;

//How will you get the current date and time using Java 8 Date and Time API?

public class InstantDemo {
	public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println("Instant (UTC): " + instant);
        System.out.println("Epoch Seconds: " + instant.getEpochSecond());
        System.out.println("Epoch Millis: " + instant.toEpochMilli());
    }
}
