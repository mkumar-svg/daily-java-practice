package daily_java_practice.arrays.hard;

public class CountInversionsMergeSort {
	public static int countInversions(int[] arr) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    private static int mergeSort(int[] arr, int low, int high) {
        int count = 0;

        if (low >= high) {
            return count;
        }

        int mid = low + (high - low) / 2;

        count += mergeSort(arr, low, mid);
        count += mergeSort(arr, mid + 1, high);
        count += merge(arr, low, mid, high);

        return count;
    }
	
	private static int merge(int[] arr, int low, int mid, int high) {
		int[] temp = new int[high - low + 1];
		
		int left = low, right = mid+1, k = 0;
		int inversions = 0;
		
		while(left <= mid && right <= high) {
			if(arr[left] <= arr[right]) {
				temp[k++] = arr[left++];
			} else {
				temp[k++] = arr[right++];
				inversions += (mid - left + 1);
			}
		}
		
		while (left <= mid) {
            temp[k++] = arr[left++];
        }

        while (right <= high) {
            temp[k++] = arr[right++];
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp[i - low];
        }

        return inversions;
	}
	
	public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};

        int inversions = countInversions(arr);

        System.out.println("The number of inversions are: " + inversions);
    }
}
