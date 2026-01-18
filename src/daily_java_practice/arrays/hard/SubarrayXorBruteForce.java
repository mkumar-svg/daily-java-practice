package daily_java_practice.arrays.hard;

public class SubarrayXorBruteForce {
	public static int countSubarraysWithXor(int[] arr, int targetXor) {
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			int xorVal = 0;
			for(int j = i; j < arr.length; j++) {
				xorVal ^= arr[j];
				if(xorVal == targetXor) {
					count++;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
        int[] arr = {4, 2, 2, 6, 4};
        int targetXor = 6;

        System.out.println(countSubarraysWithXor(arr, targetXor));
    }
}
