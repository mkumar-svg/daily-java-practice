package daily_java_practice.binary.search.medium;

public class LinearMissingKFinder {
	public static int findKthMissing(int[] arr, int k) {
        for (int num : arr) {
            if (num <= k) {
                k++;  
            } else {
                break; 
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] arr = {4, 7, 9, 10};
        int k = 4;

        int result = findKthMissing(arr, k);

        System.out.println("The missing number is: " + result);
    }
}
