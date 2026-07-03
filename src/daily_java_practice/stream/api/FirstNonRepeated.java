package daily_java_practice.stream.api;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

// Given a String, find the first non-repeated character in it using Stream functions?

public class FirstNonRepeated {
	public static void main(String[] args) {
		 
        String input = "Java articles are Awesome";
 
        System.out.println("Approach 1 (groupingBy + LinkedHashMap):  " + approach1(input));
        System.out.println("Approach 2 (indexOf/lastIndexOf):         " + approach2(input));
        System.out.println("Approach 3 (LinkedHashMap manual count):  " + approach3(input));
        System.out.println("Approach 4 (Collectors.toMap):            " + approach4(input));
    }
	
	// ---------------------------------------------------------------
    // APPROACH 1: groupingBy + LinkedHashMap (original approach, fixed)
    // ---------------------------------------------------------------
    static Character approach1(String input) {
        Character result = input.chars()
                // Step 1: Convert IntStream to Stream<Character> and lowercase each char
                .mapToObj(c -> Character.toLowerCase((char) c))
 
                // Step 2: Group characters and count occurrences
                // Function.identity() -> the character itself is the grouping key
                // LinkedHashMap::new -> preserves insertion order (so we can find the FIRST unique char)
                // Collectors.counting() -> counts how many times each character appears
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
 
                // Step 3: Convert the map into a stream of Entry<Character, Long>
                .entrySet()
                .stream()
 
                // Step 4: Keep only entries where count is exactly 1 (non-repeated chars)
                .filter(entry -> entry.getValue() == 1L)
 
                // Step 5: Extract just the character (key) from each entry
                .map(Map.Entry::getKey)
 
                // Step 6: Because LinkedHashMap preserves order, the first match is the answer
                .findFirst()
 
                // Step 7: Return null if no non-repeated character exists
                .orElse(null);
 
        return result;
    }
	
	// ---------------------------------------------------------------
    // APPROACH 2: indexOf == lastIndexOf trick (simple but O(n^2))
    // ---------------------------------------------------------------
    static Character approach2(String input) {
        String lower = input.toLowerCase();
 
        return lower.chars()
                // Step 1: Convert int code point to char
                .mapToObj(c -> (char) c)
 
                // Step 2: If a character's first occurrence index equals its last occurrence
                // index, it means the character appears only once in the string.
                // NOTE: This is O(n^2) because indexOf/lastIndexOf scan the whole string
                // for every character — slow for large inputs.
                .filter(ch -> lower.indexOf(ch) == lower.lastIndexOf(ch))
 
                // Step 3: Take the first such character
                .findFirst()
                .orElse(null);
    }
 
    // ---------------------------------------------------------------
    // APPROACH 3: Manually built LinkedHashMap for counting (common interview style)
    // ---------------------------------------------------------------
    static Character approach3(String input) {
        String lower = input.toLowerCase();
 
        // Step 1: LinkedHashMap to preserve insertion order
        Map<Character, Integer> countMap = new LinkedHashMap<>();
 
        // Step 2: Increment count for each character
        for (char ch : lower.toCharArray()) {
            // getOrDefault -> returns existing count if present, otherwise 0
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }
 
        // Step 3: Find the first entry in the map with count == 1
        return countMap.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
    }
 
    // ---------------------------------------------------------------
    // APPROACH 4: Using Collectors.toMap() (alternative to groupingBy)
    // ---------------------------------------------------------------
    static Character approach4(String input) {
        String lower = input.toLowerCase();
 
        Map<Character, Long> countMap = lower.chars()
                .mapToObj(c -> (char) c)
                // Collectors.toMap(keyMapper, valueMapper, mergeFunction, mapSupplier)
                // keyMapper -> the character itself
                // valueMapper -> initial value 1L (first time we see this char)
                // mergeFunction -> if key already exists, add 1 to the existing value (duplicate found)
                // mapSupplier -> LinkedHashMap to preserve insertion order
                .collect(Collectors.toMap(
                        Function.identity(),
                        c -> 1L,
                        Long::sum,
                        LinkedHashMap::new
                ));
 
        return countMap.entrySet().stream()
                .filter(entry -> entry.getValue() == 1L)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
    }
}
