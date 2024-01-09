import java.util.Scanner;
class main{  
	public static int factorial(int n){
		int fact=1;
		if(n==0)
		{
			return 1;
		}
		else
		{
			return n*factorial(n-1);
		}
	}
	public static void main(String args[]){
		main m=new main();
		Scanner sc=new Scanner(System.in);
		System.out.print("Given number : ");
		int a=sc.nextInt();
		System.out.print("Factorial of given number : "+m.factorial(a));
	}
}
