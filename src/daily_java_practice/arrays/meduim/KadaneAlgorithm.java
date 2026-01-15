package daily_java_practice.arrays.meduim;

public class KadaneAlgorithm {
	public static int maxSubArraySum(int[] arr) {
		int max = arr[0];
		int currSum = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			currSum = Math.max(arr[i], currSum + arr[i]);
			max = Math.max(max, currSum);
		}
		return max;
	}
	
	public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum subarray sum: " + maxSubArraySum(arr));
    }
}
