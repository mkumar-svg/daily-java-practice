package daily_java_practice.sliding.window.two.pointer.medium;

import java.util.HashMap;
import java.util.Map;

public class FruitsIntoBasketsSlidingWindow {
	public static int totalFruit(int[] fruits) {
		Map<Integer, Integer> basket = new HashMap<>();
		int left = 0;
		int maxFruits = 0;
		
		for (int right = 0; right < fruits.length; right++) {

            basket.put(fruits[right], basket.getOrDefault(fruits[right], 0) + 1);

            while (basket.size() > 2) {
                basket.put(fruits[left], basket.get(fruits[left]) - 1);

                if (basket.get(fruits[left]) == 0) {
                    basket.remove(fruits[left]);
                }

                left++;
            }

            maxFruits = Math.max(maxFruits, right - left + 1);
        }

        return maxFruits;
	}
	
	public static void main(String[] args) {

        int[] fruits = {1, 2, 1, 2, 3};

        int result = totalFruit(fruits);

        System.out.println("Maximum fruits collected: " + result);
    }
}
