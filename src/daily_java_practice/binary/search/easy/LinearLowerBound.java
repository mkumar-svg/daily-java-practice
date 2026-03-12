package daily_java_practice.binary.search.easy;

public class LinearLowerBound {
	public static int findLowerBound(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= x) {
                return i; 
            }
        }
        return arr.length; 
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 15, 19};
        int x = 9;

        int result = findLowerBound(arr, x);
        System.out.println("Lower Bound Index: " + result);
    }
}
