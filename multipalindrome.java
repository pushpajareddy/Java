class nine extends Thread
{
	public void run()
	{	
		int n=1221,pal=0,rem,temp;
		temp=n;
		while(n!=0)
		{
			rem=n%10;
			pal=pal*10+rem;
			n=n/10;
		}
		if(temp==pal)
		{
			System.out.println(temp+" is a palindrome");
		}
		else
		{
			System.out.println(temp+" is not a plaindrome");
		}

	}
}
class eleven extends Thread
{
	public void run()
	{	
      		String original, reverse = "";  
      		original = "haha"; 
      		int length = original.length();   
      		for ( int i = length - 1; i >= 0; i-- )  
         		reverse = reverse + original.charAt(i);  
      		if (original.equals(reverse))  
         		System.out.println(original+" is a palindrome.");  
      		else  
         		System.out.println(original+" isn't a palindrome.");   
   	}  

}
class palindrome
{
	public static void main(String arg[])
	{
		nine n=new nine();
		eleven  e=new eleven();
		n.start();	
		e.start();
	}
}
