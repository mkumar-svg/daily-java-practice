package daily_java_practice.recursion.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2Backtracking {
	public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
		Arrays.sort(candidates);
		
		List<List<Integer>> result = new ArrayList<>();
        backtrack(0, target, candidates, new ArrayList<>(), result);

        return result;
	}
	
	private static void backtrack(int start, int target, int[] nums, List<Integer> current, List<List<Integer>> result) {
		if(target == 0) {
			result.add(new ArrayList<>(current));
			return;
		}
		
		for(int i = start; i < nums.length; i++) {
			if(i > start && nums[i] == nums[i-1]) {
				continue;
			}
			
			if(nums[i] > target) {
				break;
			}
			
			current.add(nums[i]);
			backtrack(i+1, target - nums[i], nums, current, result);
			current.remove(current.size() - 1);
		}
	}
	
	public static void main(String[] args) {
        int[] input = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;

        List<List<Integer>> combinations = combinationSum2(input, target);

        System.out.println(combinations);
    }
}
