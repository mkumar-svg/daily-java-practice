package daily_java_practice.binary.search.easy;

public class LinearOccurrenceCounter {
	public static int countOccurrences(int[] arr, int x) {
        int count = 0;

        for (int num : arr) {
            if (num == x) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 8, 8, 11, 13};
        int x = 8;

        int result = countOccurrences(arr, x);
        System.out.println("The number of occurrences is: " + result);
    }
}
