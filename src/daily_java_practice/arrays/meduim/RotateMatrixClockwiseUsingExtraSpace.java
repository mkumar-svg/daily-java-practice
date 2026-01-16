package daily_java_practice.arrays.meduim;

public class RotateMatrixClockwiseUsingExtraSpace {
	public static int[][] rotateClockwise(int[][] matrix) {
		int n = matrix.length;
		int[][] rotated = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				rotated[j][n-i-1] = matrix[i][j];
			}
		}
		
		return rotated;
	}
	
	public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] rotatedMatrix = rotateClockwise(matrix);

        for (int[] row : rotatedMatrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
