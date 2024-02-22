import java.util.*;
class implict
{
public static void main(String arg[])
{
int a=12;
long b=a;
float f=12.00f;
double d=f;
double doubleValue = 12.8898;
int intValue = (int) doubleValue;        
long longValue = 12;        
int anotherIntValue = (int) longValue;
int maxValue = Integer.MAX_VALUE;
int overflowedValue = maxValue + 1;
int minValue = Integer.MIN_VALUE;
int underflowedValue = minValue - 1;
System.out.println("implicit int to long = "+b);
System.out.println("implicit float to double = "+d);
System.out.println("Explict double to int: " + intValue);
System.out.println("Explict long to int: " + anotherIntValue);
System.out.println("Overflowed value: " + overflowedValue);
System.out.println("Underflowed value: " + underflowedValue);
}
}