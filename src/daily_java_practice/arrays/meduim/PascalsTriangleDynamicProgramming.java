package daily_java_practice.arrays.meduim;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PascalsTriangleDynamicProgramming {
	public static List<List<Integer>> generatePascalsTriangle(int numRows) {
		List<List<Integer>> triangle = new ArrayList<>();
		
		for(int i = 0; i < numRows; i++) {
			List<Integer> row = new ArrayList<>(Collections.nCopies(i + 1, 1));
			
			for(int j = 1; j < i; j++) {
				row.set(j, triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j));
			}
			triangle.add(row);
		}
		return triangle;
	}
	
	public static void main(String[] args) {
		int numRows = 5;
		
		List<List<Integer>> result = generatePascalsTriangle(numRows);

        for (List<Integer> row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
	}
}
