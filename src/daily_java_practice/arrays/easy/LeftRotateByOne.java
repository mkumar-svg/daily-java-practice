package daily_java_practice.arrays.easy;

import java.util.Arrays;

public class LeftRotateByOne {
	public static void leftRotateByOne(int[] arr) {
		int n = arr.length;
		
		if(n == 0 || n == 1) return;
		
		int temp = arr[0];
		
		for(int i = 0; i < n-1; i++) {
			arr[i] = arr[i+1];
		}
		arr[n-1] = temp;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Before Rotation: " + Arrays.toString(arr));
        leftRotateByOne(arr);
        System.out.println("After Rotation:  " + Arrays.toString(arr));
	}
}
