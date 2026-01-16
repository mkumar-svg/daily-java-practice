package daily_java_practice.arrays.meduim;

public class SetMatrixZeroesBruteForce {
	public static void setZeroes(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				if(matrix[i][j] == 0) {
					for(int col = 0; col < cols; col++) {
						if(matrix[i][col] != 0) {
							matrix[i][col] = -1;
						}
					}
					
					for (int row = 0; row < rows; row++) {
                        if (matrix[row][j] != 0) {
                            matrix[row][j] = -1;
                        }
                    }
				}
			}
		}
		
		for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
	}
	
	public static void main(String[] args) {

        int[][] matrix = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };

        setZeroes(matrix);

        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
