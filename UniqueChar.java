import java.util.*;
public class UniqueChar {
    public static void main(String[] args) {
        String str = "abcb";
        System.out.println("Unique characters in the string " + str + " are:");
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        for (Character c : set) {
            System.out.println(c);
        }
    }
}