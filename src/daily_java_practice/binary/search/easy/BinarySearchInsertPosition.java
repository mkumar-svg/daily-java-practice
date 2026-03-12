package daily_java_practice.binary.search.easy;

public class BinarySearchInsertPosition {
	public static int searchInsert(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int ans = arr.length; 

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] >= x) {
                ans = mid;      
                high = mid - 1; 
            } else {
                low = mid + 1;  
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7};
        int x = 6;

        int index = searchInsert(arr, x);

        System.out.println("The index is: " + index);
    }
}
