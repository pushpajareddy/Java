import java.io.*;

public class DiagonalSum {
    static void sumOfDiagonals(int[][] matrix, int N) {
        int principalDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for (int i = 0; i < N; i++) {
            principalDiagonalSum += matrix[i][i];
            secondaryDiagonalSum += matrix[i][N - (i + 1)];
        }

        System.out.println("Sum of Principal Diagonal: " + principalDiagonalSum);
        System.out.println("Sum of Secondary Diagonal: " + secondaryDiagonalSum);
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {8, 2, 13, 4},
            {9, 16, 17, 8},
            {1, 22, 3, 14},
            {15, 6, 17, 8}
        };

        sumOfDiagonals(matrix, 4);
    }
}

