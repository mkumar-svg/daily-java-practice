package daily_java_practice.stream.api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// Given a list of integers, sort all the values present in it in descending order using Stream functions?

public class DescendingSort {
	public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5, 2, 9, 1, 7, 3, 9, 2);

        // Approach 1: Using Comparator.reverseOrder() - most common/clean way
        List<Integer> descendingList = nums.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println("Descending: " + descendingList);
        // Output: [9, 9, 7, 5, 3, 2, 2, 1]

        // Approach 2: Using naturalOrder().reversed() - same result, alternate syntax
        List<Integer> descendingList2 = nums.stream()
                .sorted(Comparator.<Integer>naturalOrder().reversed())
                .collect(Collectors.toList());

        // Bonus: remove duplicates first, then sort in descending order
        List<Integer> uniqueDescending = nums.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        // Output: [9, 7, 5, 3, 2, 1]
    }
}
