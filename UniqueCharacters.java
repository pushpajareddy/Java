import java.util.*;
public class UniqueCharacters {
    public static void main(String[] args) {
        String input = "abcb";
        printUniqueCharacters(input);
    }

    public static void printUniqueCharacters(String input) {
        char[] charArray = input.toCharArray();
        
        for (int i = 0; i < charArray.length; i++) {
            char currentChar = charArray[i];
            boolean isUnique = true;
            
            for (int j = 0; j < charArray.length; j++) {
                if (i != j && currentChar == charArray[j]) {
                    isUnique = false;
                    break;
                }
            }
            
            if (isUnique) {
                System.out.print(currentChar + " ");
            }
        }
    }
}