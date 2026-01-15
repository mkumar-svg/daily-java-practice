package daily_java_practice.arrays.meduim;

import java.util.Arrays;

public class TwoSumTwoPointer {
	public static boolean twoSum(int[] arr, int target) {
		Arrays.sort(arr);
		
		int left = 0;
		int right = arr.length-1;
		
		while(left < right) {
			int sum = arr[left] + arr[right];
			
			if(sum == target) {
				System.out.println("Pair found: " + arr[left] + ", " + arr[right]);
				return true;
			} else if(sum < target) {
				left++;
			} else {
				right--;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        if (!twoSum(arr, target)) {
            System.out.println("No pair found");
        }
    }
}
