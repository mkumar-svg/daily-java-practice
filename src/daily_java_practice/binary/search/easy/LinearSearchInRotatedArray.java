package daily_java_practice.binary.search.easy;

public class LinearSearchInRotatedArray {
	public static boolean search(int[] arr, int target) {

        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }

        return false;
    }
	
	public static void main(String[] args) {

        int[] arr = {7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
        int target = 3;

        boolean result = search(arr, target);

        if (result)
            System.out.println("Target is present in the array.");
        else
            System.out.println("Target is not present.");
    }
}
