package daily_java_practice.binary.search.easy;

public class LinearUpperBound {
	public static int upperBound(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                return i; 
            }
        }
        return arr.length; 
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 9, 15, 19};
        int x = 9;

        int ind = upperBound(arr, x); 

        System.out.println("The upper bound index is: " + ind);
    }
}
