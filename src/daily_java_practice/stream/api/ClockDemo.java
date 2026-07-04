package daily_java_practice.stream.api;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

//How will you get the current date and time using Java 8 Date and Time API?

public class ClockDemo {
	public static void main(String[] args) {
        // System default clock
        Clock systemClock = Clock.systemDefaultZone();
        System.out.println("Via Clock: " + LocalDateTime.now(systemClock));

        // Fixed clock — testing ke liye useful, jab tumhe "freeze" time chahiye
        Clock fixedClock = Clock.fixed(Instant.parse("2026-01-01T00:00:00Z"), ZoneId.of("UTC"));
        System.out.println("Fixed Clock Time: " + LocalDateTime.now(fixedClock));
    }
}
