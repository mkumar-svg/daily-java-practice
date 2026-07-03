package daily_java_practice.stream.api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

// Given a list of integers, sort all the values present in it using Stream functions?

public class SortValues {
	public static void main(String[] args) {
		 
        // Original list of Integer values (boxed type required for List)
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
 
        // ---------- Approach 1: Simple ascending sort ----------
        // sorted() uses natural ordering (Comparable) for Integer -> ascending
        System.out.println("Approach 1: Simple ascending sort");
        myList.stream()
              .sorted()                     // sort in natural (ascending) order
              .forEach(System.out::println); // print each sorted element
 
        System.out.println();
 
        // ---------- Approach 2: Descending sort ----------
        // Comparator.reverseOrder() reverses the natural ordering
        System.out.println("Approach 2: Descending sort");
        myList.stream()
              .sorted(Comparator.reverseOrder()) // sort in descending order
              .forEach(System.out::println);
 
        System.out.println();
 
        // ---------- Approach 3: Remove duplicates, then sort ----------
        // distinct() removes duplicate values (e.g. 98, 98 -> single 98)
        System.out.println("Approach 3: Distinct + sorted");
        myList.stream()
              .distinct()   // remove duplicate elements
              .sorted()     // then sort ascending
              .forEach(System.out::println);
 
        System.out.println();
 
        // ---------- Approach 4: Sort a primitive int[] array using IntStream ----------
        // Arrays.stream(int[]) returns an IntStream (primitive stream, no boxing)
        System.out.println("Approach 4: int[] array sort using IntStream");
        int[] arr = {10, 15, 8, 49, 25, 98, 98, 32, 15};
        int[] sortedArr = Arrays.stream(arr)  // create IntStream from primitive array
                                 .sorted()      // sort ascending
                                 .toArray();     // collect back into int[]
        System.out.println(Arrays.toString(sortedArr));
 
        System.out.println();
 
        // ---------- Approach 5: int[] -> boxed -> List<Integer> ----------
        // boxed() converts IntStream (primitive int) into Stream<Integer> (object type)
        // This is the approach you were originally trying to use
        System.out.println("Approach 5: int[] boxed to List<Integer>");
        List<Integer> boxedSortedList = Arrays.stream(arr)     // IntStream from int[]
                                               .boxed()          // convert int -> Integer
                                               .sorted()         // sort ascending
                                               .collect(Collectors.toList()); // collect into List<Integer>
        System.out.println(boxedSortedList);
 
        System.out.println();
 
        // ---------- Approach 6: sorted() + collect into a new List ----------
        // Useful when you need an actual List object (not just print output)
        System.out.println("Approach 6: sorted() + collect(Collectors.toList())");
        List<Integer> sortedList = myList.stream()
                                          .sorted()                      // sort ascending
                                          .collect(Collectors.toList()); // store result in a List
        System.out.println(sortedList);
 
        System.out.println();
 
        // ---------- Approach 7: Custom Comparator ----------
        // First sort by (value % 10), then break ties using the value itself
        System.out.println("Approach 7: Custom comparator sort");
        myList.stream()
              .sorted(
                  Comparator.comparingInt((Integer x) -> x % 10) // primary sort key: last digit
                            .thenComparing(Function.identity())   // tie-breaker: actual value
              )
              .forEach(System.out::println);
 
        System.out.println();
 
        // ---------- Approach 8: Sorted stream + summary statistics (bonus) ----------
        // mapToInt converts Stream<Integer> -> IntStream for numeric operations
        // summaryStatistics() gives min, max, average, count, sum in one call
        System.out.println("Approach 8: IntSummaryStatistics on sorted stream");
        IntSummaryStatistics stats = myList.stream()
                                            .mapToInt(Integer::intValue) // unbox Integer -> int
                                            .sorted()                    // sort ascending
                                            .summaryStatistics();        // compute min/max/avg/sum/count
        System.out.println("Min: " + stats.getMin() + ", Max: " + stats.getMax() + ", Avg: " + stats.getAverage());
    }
}
