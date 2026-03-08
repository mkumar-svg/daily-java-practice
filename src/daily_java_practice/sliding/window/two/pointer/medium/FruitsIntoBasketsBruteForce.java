package daily_java_practice.sliding.window.two.pointer.medium;

import java.util.HashMap;
import java.util.Map;

public class FruitsIntoBasketsBruteForce {
	public static int totalFruit(int[] fruits) {
		int maxFruits = 0;
		
		for(int start = 0; start < fruits.length; start++) {
			Map<Integer, Integer> basket = new HashMap<>();
			int currentCount = 0;
			
			for(int end = start; end < fruits.length; end++) {
				basket.put(fruits[end], basket.getOrDefault(fruits[end], 0) + 1);
				
				if(basket.size() > 2) {
					break;
				}
				currentCount++;
			}
			maxFruits = Math.max(maxFruits, currentCount);
		}
		return maxFruits;
	}
	
	public static void main(String[] args) {

        int[] fruits = {1, 2, 1};

        int result = totalFruit(fruits);

        System.out.println("Maximum fruits collected: " + result);
    }
}
