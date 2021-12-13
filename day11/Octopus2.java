package day11;

public class Octopus2 {
    public static void main(String[] args) {
        //int[][] matrix = {{5,4,8,3,1,4,3,2,2,3},{2,7,4,5,8,5,4,7,1,1},{5,2,6,4,5,5,6,1,7,3},{6,1,4,1,3,3,6,1,4,6},{6,3,5,7,3,8,5,4,7,8},{4,1,6,7,5,2,4,6,4,5},{2,1,7,6,8,4,1,7,2,1},{6,8,8,2,8,8,1,1,3,4},{4,8,4,6,8,4,8,5,5,4},{5,2,8,3,7,5,1,5,2,6}};
        int[][] matrix = {{6,1,1,1,8,2,1,7,6,7},{1,7,6,3,6,1,1,6,1,5},{3,5,1,2,6,8,3,1,3,1},{8,5,8,2,7,7,1,4,7,3},{8,2,1,4,8,1,3,8,7,4},{2,3,2,5,8,2,3,2,1,7},{2,2,2,2,4,8,2,8,2,3},{5,4,7,1,3,5,6,7,8,2},{3,7,3,8,6,7,1,2,8,7},{8,6,7,5,2,2,6,5,7,4}};
        long flashes = 0;
        for (int i = 0; ; i++) {
            long beforeFlashes = flashes;
            for (int rowNum = 0; rowNum < matrix.length; rowNum++) {
                for (int colNum = 0; colNum < matrix[0].length; colNum++) {
                    flashes = flash(matrix, rowNum, colNum, flashes);
                }
            }
            if (flashes == beforeFlashes + 100) {
                System.out.println("Answer: " + (i + 1));
                System.exit(0);
            }

            for (int rowNum = 0; rowNum < matrix.length; rowNum++) {
                for (int colNum = 0; colNum < matrix[0].length; colNum++) {
                    if (matrix[rowNum][colNum] == -1) {
                        matrix[rowNum][colNum] = 0;
                    }
                }
            }
        }
    }

    public static long flash(int[][] matrix, int rowNum, int colNum, long flashes) {
        if (matrix[rowNum][colNum] >= 0) {
            matrix[rowNum][colNum]++;
        }

        if (matrix[rowNum][colNum] > 9) {
            flashes++;
            matrix[rowNum][colNum] = -1;
            if (colNum > 0) {
                flashes = flash(matrix, rowNum, colNum - 1, flashes);
            }
            if (colNum < matrix[0].length - 1) {
                flashes = flash(matrix, rowNum, colNum + 1, flashes);
            }
            if (rowNum > 0) {
                flashes = flash(matrix, rowNum - 1, colNum, flashes);
                if (colNum > 0) {
                    flashes = flash(matrix, rowNum - 1, colNum - 1, flashes);
                }
                if (colNum < matrix[0].length - 1) {
                    flashes = flash(matrix, rowNum - 1, colNum + 1, flashes);
                }
            }
            if (rowNum < matrix.length - 1) {
                flashes = flash(matrix, rowNum + 1, colNum, flashes);
                if (colNum > 0) {
                    flashes = flash(matrix, rowNum + 1, colNum - 1, flashes);
                }
                if (colNum < matrix[0].length - 1) {
                    flashes = flash(matrix, rowNum + 1, colNum + 1, flashes);
                }
            }
        }

        return flashes;
    }
}
