package daily_java_practice.binary.search.medium;

public class NthRootBinarySearch {
	public static int findNthRoot(int n, int m) {
        int low = 1, high = m;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            long power = 1;

            for (int i = 0; i < n; i++) {
                power *= mid;
                if (power > m) break;
            }

            if (power == m) {
                return mid;
            } else if (power < m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 27;

        int result = findNthRoot(n, m);
        System.out.println("Nth Root: " + result);
    }
}
