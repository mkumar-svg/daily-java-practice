package daily_java_practice.arrays.meduim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSumHashSetApproach {
	public static List<List<Integer>> findThreeSumTriplets(int[] arr) {
		int n = arr.length;
		
		Set<List<Integer>> resultSet = new HashSet<>();
		
		for(int i = 0; i < n; i++) {
			Set<Integer> seen = new HashSet<>();
			
			for(int j = i+1; j < n; j++) {
				int requiredThird = -(arr[i] + arr[j]);
				
				if(seen.contains(requiredThird)) {
					List<Integer> triplet = Arrays.asList(arr[i], arr[j], requiredThird);
					Collections.sort(triplet);
					resultSet.add(triplet);
				}
				seen.add(arr[j]);
			}
		}
		return new ArrayList<>(resultSet);
	}
	
	public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> triplets = findThreeSumTriplets(arr);

        System.out.println("Triplets with sum zero:");
        for (List<Integer> triplet : triplets) {
            for (int num : triplet) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
