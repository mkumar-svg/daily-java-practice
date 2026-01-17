package daily_java_practice.arrays.meduim;

public class SubarraySumEqualsKBruteForce {
	public static int countSubarraysWithSumK(int[] arr, int k) {

        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {

                int sum = 0;

                for (int m = i; m <= j; m++) {
                    sum += arr[m];
                }

                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] arr = {3, 1, 2, 4};
        int k = 6;

        int result = countSubarraysWithSumK(arr, k);

        System.out.println("The number of subarrays is: " + result);
    }
}
