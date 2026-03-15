package daily_java_practice.binary.search.medium;

public class FloorSqrtLinearSearch {
	public static int floorSqrt(int n) {
        int ans = 0;

        for (int i = 1; i <= n; i++) {
            if ((long) i * i <= n) {
                ans = i;
            } else {
                break;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int n = 27;

        int result = floorSqrt(n);

        System.out.println(result);
    }
}
