package daily_java_practice.stream.api;

// How to find duplicate elements in a given integers list in java using Stream functions?
import java.util.*;
import java.util.stream.*;

public class DuplicateElements {
	public static void main(String[] args) {
		System.out.println("=== 1. Find Duplicate Elements ===");
		findDuplicates();
		
		System.out.println("\n=== 2. Remove Duplicates (using distinct()) ===");
		removeDuplicates();
	}
	
	// Approach 1: (HashSet.add() trick)
	public static void findDuplicates() {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		Set<Integer> seen = new HashSet<>();
		
		System.out.println("Input list: " + myList);
        System.out.print("Duplicates: ");
		
		myList.stream().filter(n -> !seen.add(n)).forEach(n -> System.out.print(n + " "));
		System.out.println();
	}
	
	// Approach 2: distinct() (order preserved)
	public static void removeDuplicates() {
		List<Integer> myList = Arrays.asList(1, 1, 85, 6, 2, 3, 65, 6, 45, 45, 5662, 2582, 2, 2, 266, 666, 656);

        System.out.println("Input list: " + myList);
		List<Integer> uniqueList = myList.stream().distinct().collect(Collectors.toList());
		System.out.println("Without duplicates: " + uniqueList);
	}
} 
