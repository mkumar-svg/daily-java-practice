package daily_java_practice.sliding.window.two.pointer.medium;

public class FruitBasketLastFruitTracking {
	public static int totalFruit(int[] fruits) {

        int maxLen = 0;

        int lastFruit = -1;
        int secondLastFruit = -1;

        int currCount = 0;
        int lastFruitStreak = 0;

        for (int fruit : fruits) {

            if (fruit == lastFruit || fruit == secondLastFruit) {
                currCount++;
            } 
            else {
                currCount = lastFruitStreak + 1;
            }

            if (fruit == lastFruit) {
                lastFruitStreak++;
            } 
            else {
                lastFruitStreak = 1;
                secondLastFruit = lastFruit;
                lastFruit = fruit;
            }

            maxLen = Math.max(maxLen, currCount);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] fruits = {1, 2, 1, 2, 3};
        System.out.println(totalFruit(fruits));
    }
}	
