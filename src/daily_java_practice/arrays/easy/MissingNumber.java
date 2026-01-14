package daily_java_practice.arrays.easy;

public class MissingNumber {
	public static int findMissing(int[] arr) {
		int n = arr.length+1;
		int sum = n*(n+1)/2;
		
		int sumArr = 0;
		for(int num : arr) {
			sumArr += num;
		}
		
		return sum - sumArr;
	}
	
	public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        System.out.println("Missing number is: " + findMissing(arr));
    }
}
