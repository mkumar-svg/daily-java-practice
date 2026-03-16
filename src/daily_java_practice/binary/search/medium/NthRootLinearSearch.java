package daily_java_practice.binary.search.medium;

public class NthRootLinearSearch {
	public static int nthRoot(int n, int m) {

        for (int i = 1; i <= m; i++) {

            long power = (long) Math.pow(i, n);

            if (power == m) {
                return i;
            }

            if (power > m) {
                break;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int n = 3;
        int m = 27;

        int result = nthRoot(n, m);

        System.out.println("Nth Root: " + result);
    }
}
