import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        String resultString = removeVowels(inputString);
        System.out.println("The string without vowels is: " + resultString);
    }
    public static String removeVowels(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }
}
