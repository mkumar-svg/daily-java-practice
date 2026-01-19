package daily_java_practice.arrays.hard;

public class MissingAndRepeatingUsingHashing {
	public static int[] findMissingAndRepeating(int[] nums) {
		int n = nums.length;
		int[] freq = new int[n+1];
		
		for(int num : nums) {
			freq[num]++;
		}
		
		int repeating = -1, missing = -1;
		
		for(int i = 1; i <= n; i++) {
			if(freq[i] == 2) {
				repeating = i;
			} else if(freq[i] == 0) {
				missing = i;
			}
			
			if (repeating != -1 && missing != -1) {
                break;
            }
		}
		
		return new int[]{repeating, missing};
	}
	
	public static void main(String[] args) {
        int[] nums = {3, 1, 2, 5, 4, 6, 7, 5};

        int[] result = findMissingAndRepeating(nums);

        System.out.println(
            "The repeating and missing numbers are: {" +
            result[0] + ", " + result[1] + "}"
        );
    }
}
