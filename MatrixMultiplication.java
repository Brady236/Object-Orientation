public class MatrixMultiplication {
    public static void main(String[] args) {
        // 1. Define two input matrices
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] matrixB = {
            {7, 8},
            {9, 1},
            {2, 3}
        };

        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int rowsB = matrixB.length;
        int colsB = matrixB[0].length;

        
        if (colsA != rowsB) {
            System.out.println("Error: Columns of Matrix A must match Rows of Matrix B.");
            return;
        }

       
        int[][] resultMatrix = new int[rowsA][colsB];

        
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                int sum = 0;
                for (int k = 0; k < colsA; k++) {
                    sum += matrixA[i][k] * matrixB[k][j];
                }
                resultMatrix[i][j] = sum;
            }
        }

        
        System.out.println("Resulting Matrix (Displayed using Enhanced For-Loops):");
        for (int[] row : resultMatrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
}