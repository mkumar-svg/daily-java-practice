package daily_java_practice.recursion.medium;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumBacktrackingIII {
	private static void findCombinations(int sum, int start, List<Integer> current, int k, List<List<Integer>> result) {
		if(sum == 0 && current.size() == k) {
			result.add(new ArrayList<>(current));
			return;
		}
		
		if(sum <= 0 && current.size() > k) {
			return;
		}
		
		for(int i = start; i <= 9; i++) {
			if(i > sum) break;
			
			current.add(i);
			findCombinations(sum-i, i+1, current, k, result);
			current.remove(current.size() - 1);
		}
	}
	
	public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        findCombinations(n, 1, new ArrayList<>(), k, result);
        return result;
    }

    public static void main(String[] args) {

        int k = 3;
        int n = 9;

        List<List<Integer>> answer = combinationSum3(k, n);

        for (List<Integer> list : answer) {
            System.out.println(list);
        }
    }
}
