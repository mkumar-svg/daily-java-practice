package daily_java_practice.binary.search.easy;

public class BinarySearchFloorCeil {
	public static int findFloor(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] <= x) {
                ans = arr[mid];     
                low = mid + 1;    
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static int findCeil(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] >= x) {
                ans = arr[mid];    
                high = mid - 1;    
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int[] getFloorAndCeil(int[] arr, int x) {
        int floor = findFloor(arr, x);
        int ceil = findCeil(arr, x);
        return new int[]{floor, ceil};
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 7, 8, 10};
        int x = 5;

        int[] result = getFloorAndCeil(arr, x);

        System.out.println("Floor: " + result[0]);
        System.out.println("Ceil: " + result[1]);
    }
}
