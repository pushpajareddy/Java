import java.util.*;
class onetwothree
{
      public static void main(String arg[]) 
      {
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           int i,j;
           for(i=1;i<=n;i++)
           {
             for(j=n-i;j>=0;j--)
             { 
               System.out.print(" ");
             } 
                 for(j=1;j<=i;j++)
                 {
                   System.out.print(""i++"");
                 }
                 System.out.println();
           }
      }
}