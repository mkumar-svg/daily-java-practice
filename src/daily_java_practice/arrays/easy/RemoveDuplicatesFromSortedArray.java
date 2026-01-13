package daily_java_practice.arrays.easy;

public class RemoveDuplicatesFromSortedArray {
	public static void main(String[] args) {
		int[] arr = {1, 1, 2, 2, 2, 3, 4, 4, 5};
		
		if (arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }

        int index = 0;
        
        for(int i = 1; i < arr.length; i++) {
        	if(arr[i] != arr[index]) {
        		index++;
        		arr[index] = arr[i];
        	}
        }
        
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i <= index; i++) {
            System.out.print(arr[i] + " ");
        }
	}
}
