package daily_java_practice.stream.api;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct

public class ContainsDuplicate {
	// Approach 1: Stream + HashSet size comparison
    public boolean containsDuplicate(int[] nums) {
        List<Integer> list = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toList());
        Set<Integer> set = new HashSet<>(list);
        return set.size() != list.size();
    }

    // Approach 2: Stream + anyMatch (short-circuits early, thoda better)
    public boolean containsDuplicateV2(int[] nums) {
        Set<Integer> setData = new HashSet<>();
        return Arrays.stream(nums)
                .anyMatch(num -> !setData.add(num));
    }

    public static void main(String[] args) {
        ContainsDuplicate solution = new ContainsDuplicate();

        int[] test1 = {1, 2, 3, 1};
        int[] test2 = {1, 2, 3, 4};
        int[] test3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        System.out.println("Approach 1:");
        System.out.println(solution.containsDuplicate(test1)); // true
        System.out.println(solution.containsDuplicate(test2)); // false
        System.out.println(solution.containsDuplicate(test3)); // true

        System.out.println("Approach 2:");
        System.out.println(solution.containsDuplicateV2(test1)); // true
        System.out.println(solution.containsDuplicateV2(test2)); // false
        System.out.println(solution.containsDuplicateV2(test3)); // true
    }
}
