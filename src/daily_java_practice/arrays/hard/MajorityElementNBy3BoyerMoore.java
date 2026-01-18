package daily_java_practice.arrays.hard;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementNBy3BoyerMoore {
	public static List<Integer> findMajorityElements(int[] nums) {
        int n = nums.length;

        int count1 = 0, count2 = 0;
        int candidate1 = Integer.MIN_VALUE, candidate2 = Integer.MIN_VALUE;

        // Phase 1: Find potential candidates
        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // Phase 2: Verify candidates
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == candidate1) count1++;
            else if (num == candidate2) count2++;
        }

        int threshold = n / 3 + 1;
        List<Integer> result = new ArrayList<>();

        if (count1 >= threshold) result.add(candidate1);
        if (count2 >= threshold) result.add(candidate2);

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {11, 33, 33, 11, 33, 11};

        List<Integer> result = findMajorityElements(arr);

        System.out.print("Majority elements (> n/3): ");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
