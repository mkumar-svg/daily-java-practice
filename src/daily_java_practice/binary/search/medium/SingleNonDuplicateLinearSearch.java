package daily_java_practice.binary.search.medium;

public class SingleNonDuplicateLinearSearch {
	public static int singleNonDuplicate(int[] arr) {
        int n = arr.length;

        if (n == 1) return arr[0];

        for (int i = 0; i < n; i++) {

            if (i == 0) {
                if (arr[i] != arr[i + 1]) {
                    return arr[i];
                }
            }

            else if (i == n - 1) {
                if (arr[i] != arr[i - 1]) {
                    return arr[i];
                }
            }

            else {
                if (arr[i] != arr[i - 1] && arr[i] != arr[i + 1]) {
                    return arr[i];
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};

        int ans = singleNonDuplicate(arr);

        System.out.println("The single element is: " + ans);
    }
}
