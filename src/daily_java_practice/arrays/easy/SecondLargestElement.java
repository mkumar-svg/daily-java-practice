package daily_java_practice.arrays.easy;

public class SecondLargestElement {
	public static void main(String[] args) {
		int[] arr = {12, 45, 7, 89, 34, 67};
		
		if(arr.length < 2) {
			System.out.println("Array must have at least two elements");
            return;
		}
		
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for(int num : arr) {
			if(num > largest) {
				secondLargest = largest;
				largest = num;
			} else if(num > largest && num != largest) {
				secondLargest = num;
			}
		}
		
		if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found");
        } else {
            System.out.println("Second largest element is: " + secondLargest);
        }
	}
}
