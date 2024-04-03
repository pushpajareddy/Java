class fibo implements Runnable{
    public void run()
    {
        int a=0,b=1,c;
        System.out.println(a);
        System.out.println(b);
        for(int i=1;i<=10;i++)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }

    }
}
class Fibotest
{
    public static void main(String[] args)
    {
        fibo f=new fibo();
        Thread t=new Thread(f);
        t.start();
    
    }
}