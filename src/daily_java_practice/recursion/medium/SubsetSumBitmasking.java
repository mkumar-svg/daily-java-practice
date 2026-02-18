package daily_java_practice.recursion.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubsetSumBitmasking {
	public static List<Integer> subsetSums(int[] arr) {
		int n = arr.length;
		List<Integer> sums = new ArrayList<>();
		
		for(int mask = 0; mask < (1 << n); mask++) {
			int sum = 0;
			for(int i = 0; i < n; i++) {
				if((mask & (1 << i)) != 0) {
					sum += arr[i];
				}
			}
			sums.add(sum);
		}
		Collections.sort(sums);
		return sums;
	}
	
	public static void main(String[] args) {
        int[] arr = {5, 2, 1};

        List<Integer> result = subsetSums(arr);

        for (int sum : result) {
            System.out.print(sum + " ");
        }
    }
}
