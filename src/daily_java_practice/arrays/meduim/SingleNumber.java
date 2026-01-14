package daily_java_practice.arrays.meduim;

public class SingleNumber {
	public static int findSingle(int[] arr) {
		int result = 0;
		for(int num : arr) {
			result ^= num;
		}
		return result;
	}
	
	public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 5, 3, 2};
        System.out.println("The number that appears once is: " + findSingle(arr));
    }
}
