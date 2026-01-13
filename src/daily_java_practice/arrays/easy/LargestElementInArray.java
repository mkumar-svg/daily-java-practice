package daily_java_practice.arrays.easy;

public class LargestElementInArray {
	public static void main(String[] args) {
		int[] arr = {12, 45, 7, 89, 34, 67};
		
		int largest = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > largest) {
				largest = arr[i];
			}	
		}
		
		System.out.println("Largest element in the array is: " + largest);
	}
}
