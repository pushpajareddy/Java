import java.util.Scanner;
class reverse 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.next();
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed =reversed+ word.charAt(i);
        }
        System.out.println("Reversed word: " + reversed);
    }
} 
    
 
