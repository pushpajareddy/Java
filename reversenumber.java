 import java.util.*;
 class Reversenumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      System.out.print("enter a number : ");
      int n = scanner.nextInt();  
      int rev = reverse(n);
      System.out.println("Reversed number: " + rev);    

    }
    public static int reverse(int n) {
        int rev = 0;
        while (n!= 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n =n/10;
        }
        return rev;

    }
}


