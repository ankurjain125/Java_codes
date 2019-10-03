class table3 extends Thread
{
    public void run()
    {
        for(int i=1;i<11;i++)
        {
            System.out.println("3*"+i+" = "+(3*i));
        }
    }
}
class table5 extends Thread
{
    public void run()
    {
        for(int i=1;i<11;i++)
        {
            System.out.println("5*"+i+" = "+(5*i));
        }
    }
}
class table7 extends Thread
{
    public void run()
    {
        for(int i=1;i<11;i++)
        {
            System.out.println("7*"+i+" = "+(7*i));
        }
    }
}
class q3
{
    public static void main(String[] args) throws Exception
    {
        table3 t1=new table3();
        table5 t2=new table5();
        table7 t3=new table7();
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();    
    }
}