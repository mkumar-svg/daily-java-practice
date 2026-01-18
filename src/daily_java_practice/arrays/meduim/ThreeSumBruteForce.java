package daily_java_practice.arrays.meduim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSumBruteForce {
	public static List<List<Integer>> findThreeSumTriplets(int[] arr) {
		int n = arr.length;
		
		Set<List<Integer>> uniqueTriplets = new HashSet<>();
		
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				for(int k = j+1; k < n; k++) {
					if(arr[i] + arr[j] + arr[k] == 0) {
						List<Integer> triplet = Arrays.asList(arr[i], arr[j], arr[k]);
						Collections.sort(triplet);
						uniqueTriplets.add(triplet);
					}
				}
			}
		} 
		return new ArrayList<>(uniqueTriplets);
	}
	
	public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> result = findThreeSumTriplets(arr);

        System.out.println("Triplets with sum zero:");
        for (List<Integer> triplet : result) {
            for (int num : triplet) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
