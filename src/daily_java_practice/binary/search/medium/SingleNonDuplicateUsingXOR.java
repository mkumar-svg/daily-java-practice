package daily_java_practice.binary.search.medium;

public class SingleNonDuplicateUsingXOR {
	public static int singleNonDuplicate(int[] arr) {

        int ans = 0;

        for (int num : arr) {
            ans ^= num;
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};

        int ans = singleNonDuplicate(arr);

        System.out.println("The single element is: " + ans);
    }
}
