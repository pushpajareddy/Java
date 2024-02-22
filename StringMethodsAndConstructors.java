import java.util.*;
class StringMethodsAndConstructors 
{
    public static void main(String[] args) 
{

        char[] charArray = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};
        int[] uniCodeArray = {72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100};
        byte[] byteArray = {72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100};

        String s1 = new String("Hello World");
        String s2 = new String(charArray);
        String s3 = new String(uniCodeArray);
        String s4 = new String(byteArray, "US-ASCII");
        String s5 = new String(byteArray, 2, 5);
        String s6 = new String(new char[5]);
        String s7 = new String(s6);
        String s8 = new String(charArray, 6, 5);
        String s9 = new String(byteArray, 2, 5, "UTF-8");

        System.out.println("Length of s1: " + s1.length());
        System.out.println("Char at index 0 in s1: " + s1.charAt(0));
        System.out.println("Substring of s1 from index 6: " + s1.substring(6));
        System.out.println("Substring of s1 from index 2 to 5: " + s1.substring(2, 5));
        System.out.println("Concatenation of s1 and s2: " + s1.concat(s2));
        System.out.println("Index of 'o' in s1: " + s1.indexOf('o'));
        System.out.println("Index of 'o' in s1 starting from index 6: " + s1.indexOf('o', 6));
        System.out.println("Last index of 'l' in s1: " + s1.lastIndexOf('l'));
        System.out.println("Comparison of s1 and s2: " + s1.compareTo(s2));
        System.out.println("Comparison of s1 and s2 (ignoring case): " + s1.compareToIgnoreCase(s2));
        System.out.println("Lowercase of s1: " + s1.toLowerCase());
        System.out.println("Uppercase of s1: " + s1.toUpperCase());
        System.out.println("Trim of s1: " + s1.trim());
        System.out.println("Replace 'o' with 'a' in s1: " + s1.replace('o', 'a'));
        System.out.println("Check if s1 contains s2: " + s1.contains(s2));
        System.out.println("To char array of s1: " + java.util.Arrays.toString(s1.toCharArray()));
        System.out.println("Check if s1 starts with 'He': " + s1.startsWith("He"));
    }
}