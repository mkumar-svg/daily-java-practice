package daily_java_practice.recursion.medium;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumBacktracking {
	public static void findCombination(int index, int target, int[] arr, List<List<Integer>> result, List<Integer> current) {
		if(index == arr.length) {
			if(target == 0) {
				result.add(new ArrayList<>(current));
			}
			return;
		}
		
		if(arr[index] <= target) {
			current.add(arr[index]);
			findCombination(index, target - arr[index], arr, result, current);
			current.remove(current.size() - 1);
		}
		
		findCombination(index + 1, target, arr, result, current);
	}
	
	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        findCombination(0, target, candidates, result, new ArrayList<>());
        return result;
    }
	
	public static void main(String[] args) {

        int[] candidates = {2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> combinations = combinationSum(candidates, target);

        System.out.println("Combinations are:");
        for (List<Integer> list : combinations) {
            System.out.println(list);
        }
    }
}
