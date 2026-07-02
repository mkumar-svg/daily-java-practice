package daily_java_practice.stream.api;

// Given the list of integers, find the first element of the list using Stream functions?
import java.util.*;

public class FindFirstElement {
	public static void main(String[] args) {
		System.out.println("=== 1. findFirst() on a List ===");
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		
		myList.stream().findFirst().ifPresent(System.out::println);
		
		System.out.println("\n=== 2. findFirst() on a primitive int[] array ===");
        int[] arr = {10, 15, 8, 49, 25, 98, 98, 32, 15};
		
		Arrays.stream(arr).boxed().findFirst().ifPresent(System.out::println);
		
		System.out.println("\n=== 3. findFirst() with a filter condition ===");
		myList.stream().filter(n -> n > 20).findFirst().ifPresent(System.out::println);
		
		System.out.println("\n=== 4. findFirst() on empty list -> Optional.empty() ===");
		List<Integer> emptyList = new ArrayList<>();
		Optional<Integer> result = emptyList.stream().findFirst();
		System.out.println("Is present? " + result.isPresent());
	}
}