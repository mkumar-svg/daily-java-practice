package daily_java_practice.arrays.hard;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementNBy3BruteForce {
	public static List<Integer> findMajorityElements(int[] nums) {
		int n = nums.length;
		List<Integer> result = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			if(result.contains(nums[i])) continue;
			
			int count = 0;
			for(int j = 0; j < n; j++) {
				if(nums[j] == nums[i]) {
					count++;
				}
			}
			
			if(count > n/3) {
				result.add(nums[i]);
			}
			
			if(result.size() == 2) break;
		}
		return result;
	}
	
	public static void main(String[] args) {

        int[] arr = {11, 33, 33, 11, 33, 11};

        List<Integer> ans = findMajorityElements(arr);

        System.out.print("The majority elements are: ");
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}
