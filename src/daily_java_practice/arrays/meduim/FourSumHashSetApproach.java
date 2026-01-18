package daily_java_practice.arrays.meduim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourSumHashSetApproach {
	public static List<List<Integer>> findFourSumQuadruplets(int[] arr, int target) {
        int n = arr.length;
        Set<List<Integer>> uniqueQuadruplets = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                Set<Integer> seen = new HashSet<>();

                for (int k = j + 1; k < n; k++) {
                    long required =
                            (long) target - arr[i] - arr[j] - arr[k];

                    if (seen.contains((int) required)) {
                        List<Integer> quad =
                                Arrays.asList(arr[i], arr[j], arr[k], (int) required);
                        Collections.sort(quad);
                        uniqueQuadruplets.add(quad);
                    }

                    seen.add(arr[k]);
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
