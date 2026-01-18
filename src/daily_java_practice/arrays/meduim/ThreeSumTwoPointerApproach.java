package daily_java_practice.arrays.meduim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumTwoPointerApproach {
	public static List<List<Integer>> findThreeSumTriplets(int[] arr) {
		int n = arr.length;
		List<List<Integer>> result = new ArrayList<>();
		
		Arrays.sort(arr);
		
		for(int i = 0; i < n; i++) {
			if(i > 0 && arr[i] == arr[i-1]) continue;
			
			int left = i+1;
			int right = n-1;
			
			while(left < right) {
				int sum = arr[i] + arr[left] + arr[right];
				
				if(sum == 0) {
					result.add(Arrays.asList(arr[i], arr[left], arr[right]));
					left++;
					right--;
					
					while(left < right && arr[left] == arr[left-1]) left++;
					
					while(left < right && arr[right] == arr[right+1]) right--;
				} else if(sum < 0) {
					left++;
				} else {
					right--;
				}
			}
		}
		return result;
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
