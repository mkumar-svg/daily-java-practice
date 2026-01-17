package daily_java_practice.arrays.hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementNBy3HashMap {
	public static List<Integer> findMajorityElements(int[] nums) {
		int n = nums.length;
		int threshold = n / 3 + 1;
		
		Map<Integer, Integer> frequencyMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();
		
		for(int num : nums) {
			frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
			
			if (frequencyMap.get(num) == threshold) {
                result.add(num);
            }
			
			if (result.size() == 2) break;
		}
		return result;
	}
	
	public static void main(String[] args) {

        int[] arr = {11, 33, 33, 11, 33, 11};

        List<Integer> ans = findMajorityElements(arr);

        System.out.print("The majority elements are: ");
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}
