class table 
{
    synchronized void calc(int n)
    {
        for(int i=1;i<11;i++)
        {
            System.out.println(n+"*"+i+" = "+(n*i));
        }
    }
}
class table3 extends Thread
{
    table t;
    table3(table t1)
    {
        t=t1;
    }
    public void run()
    {
        t.calc(3);
    }
}
class table8 extends Thread
{
    table t;
    table8(table t1)
    {
        t=t1;
    }
    public void run()
    {
        t.calc(8);
    }
}
class q6
{
    public static void main(String[] args) throws Exception
    {
        table ob=new table();
        table3 t1=new table3(ob);
        table8 t2=new table8(ob);
        t1.start();
        t2.start();   
    }
}