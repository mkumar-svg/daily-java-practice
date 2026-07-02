package daily_java_practice.stream.api;

// Given a list of integers, find out all the numbers starting with 1 using Stream functions?
import java.util.*;
import java.util.stream.*;

public class NumberStartingWithOne {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
		list.stream().map(s -> s + "").filter(s -> s.startsWith("1")).forEach(n -> System.out.print(n + " "));
		
		System.out.println();
		
		int[] nums = {10,15,8,49,25,98,32};
		List<String> listString = Arrays.stream(nums).boxed().map(s -> s + "").filter(s -> s.startsWith("1")).collect(Collectors.toList());
		System.out.println(listString);
	}
}
