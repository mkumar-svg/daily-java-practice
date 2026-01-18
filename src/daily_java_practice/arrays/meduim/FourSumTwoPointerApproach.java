package daily_java_practice.arrays.meduim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSumTwoPointerApproach {
	public static List<List<Integer>> findFourSumQuadruplets(int[] arr, int target) {
		int n = arr.length;
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(arr);
		
		for(int i = 0; i < n; i++) {
			if(i > 0 && arr[i] == arr[i-1]) continue;
			
			for(int j = i+1; j < n; j++) {
				if(j > i+1 && arr[j] == arr[j-1]) continue;
				
				int left = j+1;
				int right = n-1;
				
				while(left < right) {
					long sum = (long)arr[i] + arr[j] + arr[left] + arr[right];
					
					if(sum == target) {
						result.add(Arrays.asList(arr[i], arr[j], arr[left], arr[right]));
						
						while(left < right && arr[left] == arr[left+1]) left++;
						
						while(left < right && arr[right] == arr[right-1]) right--;
						
						left++;
						right--;
					} else if(sum < 0) {
						left++;
					} else {
						right--;
					}
				}
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
        int[] arr = {1, 0, -1, 0, -2, 2};
        int target = 0;

        List<List<Integer>> quadruplets =
                findFourSumQuadruplets(arr, target);

        System.out.println("Quadruplets with sum " + target + ":");
        for (List<Integer> quad : quadruplets) {
            System.out.println(quad);
        }
    }
}
