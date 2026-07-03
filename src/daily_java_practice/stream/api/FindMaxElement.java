package daily_java_practice.stream.api;

import java.util.*;

// Given a list of integers, find the maximum value element present in it using Stream functions?

public class FindMaxElement {
	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		int[] arr = {10, 15, 8, 49, 25, 98, 98, 32, 15};
		
		System.out.println("Input List : " + myList);
		System.out.println("Input Array: " + Arrays.toString(arr));
		System.out.println("---------------------------------------------------");
		
		// ---------------------------------------------------------
        // Approach 1: Stream + max(Integer::compare) on List
        // ---------------------------------------------------------
		int max1 = myList.stream().max(Integer::compare).get();
		System.out.println("Approach 1 (List Stream + Integer::compare)   -> " + max1);
		 
        // ---------------------------------------------------------
        // Approach 2: Stream + Comparator.naturalOrder() on List
        // ---------------------------------------------------------
		int max2 = myList.stream().max(Comparator.naturalOrder()).get();
		System.out.println("Approach 2 (List Stream + naturalOrder)       -> " + max2);
		 
        // ---------------------------------------------------------
        // Approach 3: int[] array -> IntStream.max() (no boxing needed)
        //             Primitive int[] pe direct kaam karta hai
        // ---------------------------------------------------------
		int max3 = Arrays.stream(arr).max().getAsInt();
		System.out.println("Approach 3 (IntStream.max on int[])           -> " + max3);
		 
        // ---------------------------------------------------------
        // Approach 4: int[] -> boxed() -> Stream<Integer> -> max()
        // ---------------------------------------------------------
		int max4 = Arrays.stream(arr).boxed().max(Comparator.naturalOrder()).get();
		System.out.println("Approach 4 (boxed() + naturalOrder)           -> " + max4);
		 
        // ---------------------------------------------------------
        // Approach 5: Stream reduce() - functional style
        // ---------------------------------------------------------
		int max5 = myList.stream().reduce(Integer::max).get();
		System.out.println("Approach 5 (Stream reduce with Integer::max)  -> " + max5);
	}
}
