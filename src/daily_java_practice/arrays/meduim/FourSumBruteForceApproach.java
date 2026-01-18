package daily_java_practice.arrays.meduim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourSumBruteForceApproach {
	public static List<List<Integer>> findFourSumQuadruplets(int[] arr, int target) {
        int n = arr.length;
        Set<List<Integer>> uniqueQuadruplets = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    for (int l = k + 1; l < n; l++) {

                        long sum = (long) arr[i] + arr[j] + arr[k] + arr[l];
                        if (sum == target) {
                            List<Integer> quad =
                                    Arrays.asList(arr[i], arr[j], arr[k], arr[l]);
                            Collections.sort(quad);
                            uniqueQuadruplets.add(quad);
                        }
                    }
                }
            }
        }

        return new ArrayList<>(uniqueQuadruplets);
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, -1, 0, -2, 2};
        int target = 0;

        List<List<Integer>> result = findFourSumQuadruplets(arr, target);

        System.out.println("Quadruplets with sum " + target + ":");
        for (List<Integer> quad : result) {
            System.out.println(quad);
        }
    }
}
