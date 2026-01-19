package daily_java_practice.arrays.hard;

public class MissingAndRepeatingUsingMath {
	public static int[] findMissingAndRepeating(int[] nums) {
		long n = nums.length;
		
		long sumN = (n * (n +1 ))/2;
		long sumSqN = (n * (n + 1) * (2 * n + 1))/6;
		
		long sum = 0, sumSq = 0;
		for(int num : nums) {
			sum += num;
			sumSq += (long)num * num;
		}
		
		long diff = sum - sumN;            // X - Y
        long diffSq = sumSq - sumSqN;      // X² - Y²

        long sumXY = diffSq / diff;        // X + Y

        long repeating = (diff + sumXY) / 2;
        long missing = repeating - diff;

        return new int[]{(int) repeating, (int) missing};
	}
	
	public static void main(String[] args) {
        int[] nums = {3, 1, 2, 5, 4, 6, 7, 5};

        int[] result = findMissingAndRepeating(nums);

        System.out.printf(
            "The repeating and missing numbers are: {%d, %d}%n",
            result[0], result[1]
        );
    }
}
