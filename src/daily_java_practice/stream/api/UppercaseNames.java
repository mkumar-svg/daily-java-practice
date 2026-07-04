package daily_java_practice.stream.api;

import java.util.List;
import java.util.stream.Collectors;

// How to use map to convert object into Uppercase in Java 8?

public class UppercaseNames {
	public static void main(String[] args) {
        List<String> names = List.of("rahul", "sneha", "vikas", "priya");

        List<String> nameLst = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(nameLst);
	}
}
