package daily_java_practice.stream.api;

// Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
import java.util.*;
import java.util.stream.*;

public class EvenNumber {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
		list.stream().filter(n -> n%2 == 0).forEach(n -> System.out.print(n + " "));
		
		System.out.println();
		
		int[] nums = {10,15,8,49,25,98,32};
		Map<Boolean, List<Integer>> evenNums = Arrays.stream(nums).boxed().collect(Collectors.partitioningBy(n -> n%2 == 0));
		List<Integer> evenList = evenNums.get(true);
		System.out.print(evenList);
	}
}
