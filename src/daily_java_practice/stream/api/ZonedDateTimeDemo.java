package daily_java_practice.stream.api;

import java.time.ZoneId;
import java.time.ZonedDateTime;

//How will you get the current date and time using Java 8 Date and Time API?

public class ZonedDateTimeDemo {
	public static void main(String[] args) {
        // System default zone
        ZonedDateTime zdtDefault = ZonedDateTime.now();
        System.out.println("Default Zone: " + zdtDefault);

        // Specific zone (India)
        ZonedDateTime zdtIndia = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("India Zone: " + zdtIndia);

        // UTC
        ZonedDateTime zdtUtc = ZonedDateTime.now(ZoneId.of("UTC"));
        System.out.println("UTC Zone: " + zdtUtc);
    }
}
