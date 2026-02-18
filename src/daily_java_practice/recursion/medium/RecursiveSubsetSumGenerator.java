package daily_java_practice.recursion.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RecursiveSubsetSumGenerator {
	private static void generateSubsetSums(int index, int currentSum, int[] arr, List<Integer> sums) {
        if (index == arr.length) {
            sums.add(currentSum);
            return;
        }

        generateSubsetSums(index + 1, currentSum + arr[index], arr, sums);

        generateSubsetSums(index + 1, currentSum, arr, sums);
    }

    public static List<Integer> getSubsetSums(int[] arr) {
        List<Integer> sums = new ArrayList<>();
        generateSubsetSums(0, 0, arr, sums);
        Collections.sort(sums);
        return sums;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 1};

        List<Integer> result = getSubsetSums(arr);

        for (int sum : result) {
            System.out.print(sum + " ");
        }
    }
}
