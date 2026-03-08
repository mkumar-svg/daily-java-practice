package daily_java_practice.sliding.window.two.pointer.medium;

public class MaxScoreBruteForce {
	public static int maxScore(int[] cardPoints, int k) {

        int n = cardPoints.length;
        int maxSum = 0;

        for (int i = 0; i <= k; i++) {

            int currentSum = 0;

            for (int j = 0; j < i; j++) {
                currentSum += cardPoints[j];
            }

            for (int j = 0; j < k - i; j++) {
                currentSum += cardPoints[n - 1 - j];
            }

            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] cards = {1, 2, 3, 4, 5, 6, 1};
        int k = 3;

        int result = maxScore(cards, k);

        System.out.println("Maximum Score: " + result);
    }
}
