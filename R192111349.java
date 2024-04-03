class R192111349
{
    double p,n,r,Sintrest,Aintrest,Iintrest;
    void get(double pr,double no)
    {
        p=pr;
        n=no;
    }
    void SBI(double r)
    {
        Sintrest=p*n*r/100;
    }
    void ICICI(double r)
    {
        Iintrest=p*n*r/100;
    }
    void Axis(double r)
    {
        Aintrest=p*n*r/100;
    }
    void display()
    {
        System.out.print("SBI intrest: "+Sintrest);
        System.out.print("ICICI intrest: "+Iintrest);
        System.out.print("Axis intrest: "+Aintrest);
    }
    public static void main(String[] args)
    {
        R192111349 b=new R192111349();
        b.get(100000,5);
        b.SBI(8.4);
        b.ICICI(7.3);
        b.Axis(9.7);
        b.display();
    }
}

