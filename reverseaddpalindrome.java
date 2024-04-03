import java.math.BigInteger;
class ReverseAndAddPalindrome {

    public static BigInteger getPalindromeByReversingAndAdding(int inputNumber) {
        BigInteger input = BigInteger.valueOf(inputNumber);
        BigInteger reversedInput;
        BigInteger sum;

        do {
            reversedInput = reverse(input);
            sum = input.add(reversedInput);
            input = sum;
        } while (!isPalindrome(sum));

        return sum;
    }

    private static BigInteger reverse(BigInteger value) {
        String stringValue = new StringBuilder(value.toString()).reverse().toString();
        return new BigInteger(stringValue);
    }

    private static boolean isPalindrome(BigInteger value) {
        return value.equals(reverse(value));
    }

    public static void main(String[] args) {
        int inputNumber = 7325;
        BigInteger palindrome = getPalindromeByReversingAndAdding(inputNumber);
        System.out.println("The palindrome for input " + inputNumber + " is " + palindrome);
    }
}
