package daily_java_practice.stream.api;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

//How will you get the current date and time using Java 8 Date and Time API?

public class OffsetDateTimeDemo {
	public static void main(String[] args) {
        OffsetDateTime odt = OffsetDateTime.now(ZoneOffset.of("+05:30"));
        System.out.println("Offset DateTime: " + odt);
    }
}
