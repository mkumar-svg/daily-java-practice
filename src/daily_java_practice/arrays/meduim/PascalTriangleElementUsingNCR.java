package daily_java_practice.arrays.meduim;

public class PascalTriangleElementUsingNCR {
	public static long findPascalElement(int r, int c) {
		int n = r-1;
		int k = c-1;
		
		long result = 1;
		
		for(int i = 0; i < k; i++) {
			result = result * (n-i)/(i+1);
		}
		
		return result;
	}
	
	public static void main(String[] args) {

        int r = 5, c = 3; 

        System.out.println(findPascalElement(r, c));
    }
}
