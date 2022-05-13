import java.util.ArrayList;

public class Matrix {


    public static int minimum(int[][] matrix) {
        int min = matrix[0][0];
        int row = 0;
        while (row < matrix.length) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] < min)
                    min = matrix[row][col];

            }
            row++;
        }

        return min;
    }

    public static ArrayList<Integer> numbersDivisibleByThree(int[][] matrix) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] % 3 == 0) {
                    if (!numbers.contains(matrix[row][col])) {
                        numbers.add(matrix[row][col]);
                    }
                }
            }
        }
        return numbers;
    }
}

