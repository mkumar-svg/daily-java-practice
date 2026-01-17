package daily_java_practice.arrays.meduim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NextPermutationBruteForce {
	public static List<Integer> nextPermutation(int[] nums) {

        List<List<Integer>> allPermutations = new ArrayList<>();

        // Sort to start from the smallest permutation
        Arrays.sort(nums);

        // Generate all permutations
        generatePermutations(nums, 0, allPermutations);

        // Convert current array to list
        List<Integer> current = new ArrayList<>();
        for (int num : nums) {
            current.add(num);
        }

        // Find next permutation
        for (int i = 0; i < allPermutations.size(); i++) {
            if (allPermutations.get(i).equals(current)) {
                if (i == allPermutations.size() - 1) {
                    return allPermutations.get(0);
                }
                return allPermutations.get(i + 1);
            }
        }

        return current;
    }

    // Backtracking helper to generate permutations
    private static void generatePermutations(int[] nums, int index, List<List<Integer>> result) {

        if (index == nums.length) {
            List<Integer> permutation = new ArrayList<>();
            for (int num : nums) {
                permutation.add(num);
            }
            result.add(permutation);
            return;
        }

        for (int i = index; i < nums.length; i++) {
            swap(nums, i, index);
            generatePermutations(nums, index + 1, result);
            swap(nums, i, index);
        }
    }

    // Swap helper method
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        List<Integer> result = nextPermutation(nums);

        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
