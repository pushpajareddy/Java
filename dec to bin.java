import java.util.*;
class Manvi {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int decimalNumber =sc.nextInt();
        sc.nextLine();

        String binaryNumber = Integer.toBinaryString(decimalNumber);
        String octalNumber = Integer.toOctalString(decimalNumber);

        System.out.println("Binary number = " + binaryNumber);
        System.out.println("Octal = " + octalNumber);
    }
}
