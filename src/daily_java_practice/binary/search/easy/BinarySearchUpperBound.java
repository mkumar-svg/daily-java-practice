package daily_java_practice.binary.search.easy;

public class BinarySearchUpperBound {
	public static int upperBound(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length; 

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > x) {
                ans = mid;        
                high = mid - 1;   
            } else {
                low = mid + 1;    
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 9, 15, 19};
        int x = 9;

        int index = upperBound(arr, x);

        System.out.println("Upper Bound Index: " + index);
    }
}
