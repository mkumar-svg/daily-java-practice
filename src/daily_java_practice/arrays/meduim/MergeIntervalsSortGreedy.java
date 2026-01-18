package daily_java_practice.arrays.meduim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervalsSortGreedy {
	public static List<List<Integer>> mergeIntervals(int[][] intervals) {
		Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<List<Integer>> merged = new ArrayList<>();
		
		for(int[] interval : intervals) {
			if(merged.isEmpty() || merged.get(merged.size()-1).get(1) < interval[0]) {
				merged.add(Arrays.asList(interval[0], interval[1]));
			} else {
				int lastIndex = merged.size()-1;
				merged.get(lastIndex).set(1, Math.max(merged.get(lastIndex).get(1), interval[1]));
			}
		}
		return merged;
	}
	
	public static void main(String[] args) {
        int[][] intervals = {
            {1, 3}, {2, 6}, {8, 10}, {15, 18}
        };

        List<List<Integer>> result = mergeIntervals(intervals);

        for (List<Integer> interval : result) {
            System.out.print(
                "[" + interval.get(0) + "," + interval.get(1) + "] "
            );
        }
    }
}
