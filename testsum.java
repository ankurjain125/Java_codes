import java.io.*;
class sum
{
    int add(int a,int b)
    {
        return(a+b);
    }
    float add(float a,int b)
    {
        return(a+b);
    }
    float add(int a,float b)
    {
        return(a+b);
    }
    float add(float a,float b)
    {
        return(a+b);
    }
    double add(double a,double b)
    {
        return(a+b);
    }
    double add(int a,double b)
    {
        return(a+b);
    }
    double add(float a,double b)
    {
        return(a+b);
    }
    double add(double a,int b)
    {
        return(a+b);
    }
    double add(double a,float b)
    {
        return(a+b);
    }
}
class testsum
{
        public static void main(String ar[])throws IOException
        {
                sum s=new sum();
                System.out.println("Sum= "+s.add(3,6));
                System.out.println("Sum= "+s.add(3.08f,6));
                System.out.println("Sum= "+s.add(3,6.65f));
                System.out.println("Sum= "+s.add(3.45f,6.38f));
                System.out.println("Sum= "+s.add(3,6));
                System.out.println("Sum= "+s.add(3.56f,6));
                System.out.println("Sum= "+s.add(3,6.36f));
        }
}
