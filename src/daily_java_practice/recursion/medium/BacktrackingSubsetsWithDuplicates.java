package daily_java_practice.recursion.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BacktrackingSubsetsWithDuplicates {
	private static void findSubsets(int index, int[] nums, List<Integer> current, Set<List<Integer>> result) {
		if(index == nums.length) {
			result.add(new ArrayList<>(current));
			return;
		}
		
		current.add(nums[index]);
		findSubsets(index+1, nums, current, result);
		current.remove(current.size() - 1);
		
		findSubsets(index+1, nums, current, result);
	}
	
	public static List<List<Integer>> subsetsWithDup(int[] nums) {
		Set<List<Integer>> result = new HashSet<>();
		Arrays.sort(nums);
		findSubsets(0, nums, new ArrayList<>(), result);
		
		return new ArrayList<>(result);
	}
	
	public static void main(String[] args) {

        int[] nums = {1, 2, 2};

        List<List<Integer>> subsets = subsetsWithDup(nums);

        System.out.println(subsets);
    }
}
