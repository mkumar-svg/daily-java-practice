package daily_java_practice.arrays.hard;

public class MissingAndRepeatingUsingXor {
	public static int[] findMissingAndRepeating(int[] nums) {
		int n = nums.length;
		int xor = 0;
		
		for(int i = 0; i < n; i++) {
			xor ^= nums[i];
			xor ^= (i+1);
		}
		
		int rightmostSetBit = xor & -xor;

        int group1 = 0, group2 = 0;
		
		for(int num : nums) {
			if((num & rightmostSetBit) != 0) {
				group1 ^= num;
			} else {
				group2 ^= num;
			}
		}
		
		for(int i = 1; i <= n; i++) {
			if((i & rightmostSetBit) != 0) {
				group1 ^= i;
			} else {
				group2 ^= i;
			}
		}
		
		int repeating, missing;
        int count = 0;
		for(int num : nums) {
			if(num == group1) {
				count++;
			}
		}
		
		if (count == 2) {
            repeating = group1;
            missing = group2;
        } else {
            repeating = group2;
            missing = group1;
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
