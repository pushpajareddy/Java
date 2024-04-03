import java.util.*;
class implicit
{
public static void main(String arg[])
{
int a=12;
long b=a;
float f=12.89879f;
double d=f;
double doublevalue=12.6473;
int intvalue=(int) doublevalue;
long longvalue=12;
int anotherintvalue=(int)longvalue;
int maxvalue=Integer.MAX_VALUE;
int overflowedvalue=maxvalue+1;
int minvalue=I
nteger.MIN_VALUE;
int underflowedvalue=minvalue-1;
System.out.println("implicit int to long="+b);
System.out.println("implicit float to double="+d);
System.out.println("explicit double to int:"+intvalue);
System.out.println("explicit long to int:"+anotherintvalue);
System.out.println("overflowed value:"+overflowedvalue);
System.out.println("underflowed value:"+underflowedvalue);
}
}

