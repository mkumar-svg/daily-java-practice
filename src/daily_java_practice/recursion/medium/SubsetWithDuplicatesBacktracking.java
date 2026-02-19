package daily_java_practice.recursion.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetWithDuplicatesBacktracking {
	public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); 
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), result);
        return result;
    }
	
	private static void backtrack(int start, int[] nums, List<Integer> current, List<List<Integer>> result) {
		result.add(new ArrayList<>(current));
		
		for(int i = start; i < nums.length; i++) {
			if(i > start && nums[i] == nums[i-1]) {
				continue;
			}
			
			current.add(nums[i]);
			backtrack(i+1, nums, current, result);
			current.remove(current.size() - 1);
		}
	}
	
	public static void main(String[] args) {

        int[] nums = {1, 2, 2};

        List<List<Integer>> subsets = subsetsWithDup(nums);

        System.out.println("Unique Subsets:");
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }
}
