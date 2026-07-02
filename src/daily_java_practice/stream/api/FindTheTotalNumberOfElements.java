package daily_java_practice.stream.api;

// Given a list of integers, find the total number of elements present in the list using Stream functions?

import java.util.*;

public class FindTheTotalNumberOfElements {
	public static void main(String[] args) {

        System.out.println("=== 1. count() on a List ===");
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

        long count = myList.stream()
                            .count();

        System.out.println("Total elements: " + count);

        System.out.println("\n=== 2. count() on a primitive int[] array ===");
        int[] arr = {10, 15, 8, 49, 25, 98, 98, 32, 15};

        long arrCount = Arrays.stream(arr)
                               .boxed()
                               .count();

        System.out.println("Total elements: " + arrCount);

        System.out.println("\n=== 3. count() with a filter condition ===");
        long countGreaterThan20 = myList.stream()
                                         .filter(n -> n > 20)
                                         .count();

        System.out.println("Elements > 20: " + countGreaterThan20);

        System.out.println("\n=== 4. count() distinct elements ===");
        long distinctCount = myList.stream()
                                    .distinct()
                                    .count();

        System.out.println("Distinct elements: " + distinctCount);
    }
}
