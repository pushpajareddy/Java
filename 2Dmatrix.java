import java.lang.reflect.Array;
import java.util.Arrays;
class matrix
 {
 public static void main(String[] args) {
 int rows = 3;
 int cols = 3;
 int[][] matrix = (int[][]) Array.newInstance(int.class, rows, cols);
 for (int i = 0; i < rows; i++) {
 for (int j = 0; j < cols; j++) {
 matrix[i][j] = i * cols + j + 1;
 }
 }
