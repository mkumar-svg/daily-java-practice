package daily_java_practice.arrays.hard;

public class CountInversionsBruteForce {
	public static int countInversions(int[] arr) {
		int count = 0;
		int n = arr.length;
		
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				if(arr[i] > arr[j]) {
					count++;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};

        int inversions = countInversions(arr);

        System.out.println("The number of inversions is: " + inversions);
    }
}
