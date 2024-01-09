import java.util.*;
class th extends Thread{
    public void run(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        int a=0,b=1;
        int c;
        System.out.print(a+" ");
        System.out.print(b);
        for(int i=2;i<n;i++)
        {
            c=a+b;  
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}
class main{
    public static void main(String args[]){
        th t =new th();
        t.start();
    }
}
