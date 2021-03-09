package src.dynamicprogramming;

public class CountThePaths {
    // Suppose with that with an n * n grid
    // With movements limited to : down and right
    // Starting point (0,0) Finishing point (n-1,n-1)
    // Find how many paths lead from starting point to the finishing point.
    // Note that an index i and index j could be blocked off such that
    // it cannot be used as part of the path this will be indicated if the value of (i,j) = -1

    public void run() {
        int[][] recursionCountPathMatrix = new int[4][4];
        // create method to generate data
        this.generateMatrixData(recursionCountPathMatrix);

        System.out.println("Number Of paths using recursive algorithm: "
                + countPathRecursion(recursionCountPathMatrix, 0, 0));

        int[][] dynamicProgrammingMatrix = new int[10][10];
        this.generateMatrixData(dynamicProgrammingMatrix);

        System.out.println("Number of paths using memoization algorithm: "
                + countPathMemoization(dynamicProgrammingMatrix, 0, 0, new int[10][10]));

        System.out.println("Number of paths using tabulation algorithm: "
                + countPathTabulation(dynamicProgrammingMatrix));
    }


    // TODO: fill this out!
    private void generateMatrixData(int[][] recursionCountPathMatrix) {
    }

    // Recursive Solution O(2^n^2)
    // In this example we should only have an n = 4
    public int countPathRecursion(int[][] matrix, int row, int col) {
        if (matrix[row][col] == -1) {
            return 0;
        }

        if (row == matrix[0].length - 1 && col == matrix[1].length - 1) {
            return 1;
        }

        return countPathRecursion(matrix, row + 1, col) + countPathRecursion(matrix, row, col + 1);
    }


    // Dynamic Solution Memoization O(n^2)
    public int countPathMemoization(int[][] matrix, int row, int col, int[][] paths) {
        if (matrix[row][col] == -1) {
            return 0;
        }

        if (row == matrix[0].length - 1 && col == matrix.length - 1) {
            return 1;
        }

        if (paths[row][col] == 0) {
            paths[row][col] = countPathMemoization(matrix, row + 1, col, paths)
                    + countPathMemoization(matrix, row, col + 1, paths);
        }

        return paths[row][col];
    }

    // Dynamic Solution Tabulation O(2n)
    public int countPathTabulation(int[][] matrix) {
        for (int row = matrix[0].length; row >= 0; row--) {
            for (int col = matrix.length; col >= 0; col--) {
                if (row == matrix[0].length && col == matrix.length) {
                    matrix[row - 1][col] = 1;
                    matrix[row][col - 1] = 1;
                } else {
                    if (row == 0) {
                        int valueAtRight = matrix[row][col - 1] == -1 ? 0 : matrix[row][col - 1];
                        int valueAtDown = 0;
                        matrix[row][col] = valueAtRight + valueAtDown;
                    } else if (col == 0) {
                        int valueAtRight = 0;
                        int valueAtDown = matrix[row - 1][col] == -1 ? 0 : matrix[row - 1][col];
                        matrix[row][col] = valueAtRight + valueAtDown;
                    } else {
                        int valueAtRight = matrix[row][col - 1] == -1 ? 0 : matrix[row][col - 1];
                        int valueAtDown = matrix[row - 1][col] == -1 ? 0 : matrix[row - 1][col];
                        matrix[row][col] = valueAtRight + valueAtDown;
                    }
                }
            }
        }
        return matrix[0][0];
    }
}
