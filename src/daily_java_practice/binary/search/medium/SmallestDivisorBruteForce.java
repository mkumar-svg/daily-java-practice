package daily_java_practice.binary.search.medium;

public class SmallestDivisorBruteForce {
	public static int findSmallestDivisor(int[] arr, int limit) {

        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            max = Math.max(max, num);
        }

        for (int d = 1; d <= max; d++) {
            int sum = 0;

            for (int num : arr) {
                sum += (int) Math.ceil((double) num / d);
            }

            if (sum <= limit) {
                return d;
            }
        }

        return -1; 
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int limit = 8;

        int ans = findSmallestDivisor(arr, limit);
        System.out.println("The minimum divisor is: " + ans);
    }
}
