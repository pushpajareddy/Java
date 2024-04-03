import java.util.*;
class StringMethods
{
public static void main(String arg[])
{
int n=0;
String strnumber= String.valueOf(n);
String S1="hello";
String S2=new String("hello");
String S3=new String("world");
String S4=strnumber+S1;


System.out.println("Length of S1: " + S1.length());
System.out.println("Character at index 2 in S1:" + S1.charAt(2)); 
System.out.println("Index of 'o' in S1:" + S1.indexOf('o'));
System.out.println("Substring from index 3 to end in S1:"+ S1.substring(3));
System.out.println("Replacing 'o' with 'x' in S1: " + S1.replace('o','x'));
System.out.println("Uppercase of S1: " + S1.toUpperCase());
System.out.println("Lowercase of S1: " + S1.toLowerCase());
System.out.println("Concatenation of S2 and S3: " + S1.concat(S3));
System.out.println("S1.equals(S3) is " + S1.equals(S3));
System.out.println("the value is: "+S3);

}}