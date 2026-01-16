package daily_java_practice.arrays.meduim;

public class RearrangeArrayBySign {
	public static int[] rearrangeBySign(int[] arr) {
		int n = arr.length;
		
		int[] result = new int[n];
		
		int pos = 0;
		int neg = 1;
		
		for(int i = 0; i < n; i++) {
			if(arr[i] < 0) {
				result[neg] = arr[i];
				neg += 2;
			} else {
				result[pos] = arr[i];
				pos += 2;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
        int[] arr = {1, 2, -4, -5};

        int[] result = rearrangeBySign(arr);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
