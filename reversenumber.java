class ReverseNumber {
    public static void main(String[] args) {
        int num = 12345;
        int reversedNum = reverse(num);
        System.out.println("Reversed number: " + reversedNum);
    }

    public static int reverse(int num) {
        int reversedNum = 0;
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        return reversedNum;
    }
}