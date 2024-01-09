import java.util.*;
class Manvi {
    public static boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
     return Math.floor(Math.log10(n) / Math.log10(3)) == Math.log10(n) / Math.log10(3);
    }

public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n =sc.nextInt();

        if (isPowerOfThree(n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
