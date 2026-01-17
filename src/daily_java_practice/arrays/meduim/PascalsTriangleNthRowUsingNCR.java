package daily_java_practice.arrays.meduim;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleNthRowUsingNCR {
	public static List<Long> getNthRow(int N) {
		List<Long> row = new ArrayList<>();
		
		long value = 1;
		row.add(value);
		
		for(int k = 1; k < N; k++) {
			value = value * (N-k)/k;
			row.add(value);
		}
		return row;
	}
	
	public static void main(String[] args) {

        int N = 5; 

        List<Long> result = getNthRow(N);

        for (long num : result) {
            System.out.print(num + " ");
        }
    }
}
