package src.search;

import java.util.Random;

public class NumberOfIslandsProblem {
    // TODO : Write the problem statement for this program

    private char[][] archipelago;

    public NumberOfIslandsProblem(int row, int column) {
        Random random = new Random();
        this.archipelago = new char[row][column];
        for (int i = row; i < row; i++) {
            for (int j = column; j < column; j++) {
                int value = random.nextInt(10);
                if (value % 2 == 0) {
                    archipelago[i][j] = '1';
                } else {
                    archipelago[i][j] = '0';
                }

            }
        }
    }


    public NumberOfIslandsProblem(char[][] archipelago) {
        this.archipelago = archipelago;
    }

    // Depth-first search solution
    public int countUsingDFS() {
        if (this.archipelago == null || this.archipelago.length == 0) {
            return 0;
        }

        int numberOfIslands = 0;
        for (int row = 0; row < archipelago.length; row++) {
            for (int column = 0; column < archipelago[row].length; column++) {
                if (archipelago[row][column] == '1') {
                    numberOfIslands++;
                    dfs(archipelago, row, column);
                }
            }
        }

        return numberOfIslands;
    }

    public void dfs(char[][] archipelago, int row, int column) {
        if (row < 0 || row >= archipelago.length) {
            return;
        }

        if (column < 0 || column >= archipelago[row].length) {
            return;
        }

        if (archipelago[row][column] == '0') {
            return;
        }

        archipelago[row][column] = '0';

        dfs(archipelago, row + 1, column); // down
        dfs(archipelago, row, column + 1); // right
        dfs(archipelago, row - 1, column); // up
        dfs(archipelago, row, column - 1); // left


    }

    // Breadth-first search solution
    public int countUsingBFS(int row, int column) {
        if (this.archipelago == null || this.archipelago.length == 0) {
            return 0;
        }
        // need a structure to save the pair of coordinates<row, column>
        return 0;
    }
}
