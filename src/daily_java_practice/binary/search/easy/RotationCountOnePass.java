package daily_java_practice.binary.search.easy;

public class RotationCountOnePass {
	public static int findRotationCount(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            if (arr[i] > arr[i + 1]) {
                return i + 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {

        int[] arr = {3, 4, 5, 1, 2};

        int rotations = findRotationCount(arr);

        System.out.println(rotations);
    }
}
