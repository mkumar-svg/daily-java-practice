package daily_java_practice.binary.search.easy;

public class RotationCountLinear {
	public static int findRotations(int[] arr) {

        int n = arr.length;

        int minVal = arr[0];
        int minIndex = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] < minVal) {
                minVal = arr[i];
                minIndex = i;
            }
        }

        return minIndex;
    }

    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};

        int rotations = findRotations(arr);

        System.out.println(rotations);
    }
}
