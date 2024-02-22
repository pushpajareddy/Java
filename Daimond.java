import java.util.*;
class Diamond {
    public static void main(String[] args) {
        int n = 4; // Change this value to adjust the size of the pattern
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}