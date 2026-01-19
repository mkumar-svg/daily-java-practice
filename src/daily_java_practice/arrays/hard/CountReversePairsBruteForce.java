package daily_java_practice.arrays.hard;

public class CountReversePairsBruteForce {
	public static int countReversePairs(int[] arr) {

        int count = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > 2L * arr[j]) { 
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 3, 1};

        int count = countReversePairs(arr);

        System.out.println("The number of reverse pairs is: " + count);
    }
}
