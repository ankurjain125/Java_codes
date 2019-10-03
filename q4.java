class table3 implements Runnable
{
    public void run()
    {
        for(int i=1;i<11;i++)
        {
            System.out.println("3*"+i+" = "+(3*i));
        }
    }
}
class table5 implements Runnable
{
    public void run()
    {
        for(int i=1;i<11;i++)
        {
            System.out.println("5*"+i+" = "+(5*i));
        }
    }
}
class table7 implements Runnable
{
    public void run()
    {
        for(int i=1;i<11;i++)
        {
            System.out.println("7*"+i+" = "+(7*i));
        }
    }
}
class q4
{
    public static void main(String[] args) throws Exception
    {
        table3 t1=new table3();
        table5 t2=new table5();
        table7 t3=new table7();
        Thread ob1=new Thread(t1);
        Thread ob2=new Thread(t2);
        Thread ob3=new Thread(t3);
        ob1.start();
        ob1.join();
        ob2.start();
        ob2.join();
        ob3.start();
        ob3.join();    
    }
}