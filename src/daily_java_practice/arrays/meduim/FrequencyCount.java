package daily_java_practice.arrays.meduim;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {
	public static void findMajorityElement(int[] arr) {
		int n = arr.length;
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int num : arr) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue() > n/2) {
				System.out.println("Majority Element: " + entry.getKey());
                return;
			}
		}
		System.out.println("No Majority Element found");
	}
	
	public static void main(String[] args) {
        int[] arr = {2, 2, 1, 2, 3, 2, 2};
        findMajorityElement(arr);
    }
}
