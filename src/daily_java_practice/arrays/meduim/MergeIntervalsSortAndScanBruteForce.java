package daily_java_practice.arrays.meduim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervalsSortAndScanBruteForce {
	public static List<List<Integer>> mergeOverlappingIntervals(int[][] intervals) {
		Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
		
		List<List<Integer>> mergedIntervals = new ArrayList<>();
        int n = intervals.length;
        int i = 0;
		
		while(i < n) {
			int start = intervals[i][0];
			int end = intervals[i][1];
			int j = i+1;
			
			while(j < n && intervals[j][0] <= end) {
				end = Math.max(end, intervals[j][1]);
				j++;
			}
			mergedIntervals.add(Arrays.asList(start, end));
			i = j;
		}
		return mergedIntervals;
	}
	
	public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};

        List<List<Integer>> result = mergeOverlappingIntervals(intervals);

        for (List<Integer> interval : result) {
            System.out.print(interval + " ");
        }
    }
}
