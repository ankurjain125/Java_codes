import java.io.*;
class complex
{
    float real;
    float img;
    complex()
    {
        real=0.0f;
        img=0.0f;
    }
    complex(complex c)
    {
        real=c.real;
        img=c.img;
    }
    void sum(complex c1,complex c2)
    {
        real=c1.real+c2.real;
        img=c1.img+c2.img;
        System.out.println("Sum is = "+real+ " +i "+img);
    }
    void mul(complex c1,complex c2)
    {
        real=c1.real*c2.real-c1.img*c2.img;
        img=c1.img*c2.real+c1.real*c2.img;
        System.out.println("Product is = "+real+ " +i "+img);
    }
}
class testcomplex
{
    public static void main(String ar[])throws IOException
    {
            complex c1,c2,c3;
            c1=new complex();
            c2=new complex();
            c3=new complex();
            System.out.println("Enter the real part and imaginary part of first no.");
            InputStreamReader ir=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(ir);
            String s=br.readLine();
            c1.real=Float.parseFloat(s);
            String s1=br.readLine();
            c1.img=Float.parseFloat(s1);
            System.out.println("Enter the real part and imaginary part of second no.");
            InputStreamReader ir1=new InputStreamReader(System.in);
            BufferedReader br1=new BufferedReader(ir1);
            String s2=br1.readLine();
            c2.real=Float.parseFloat(s2);
            String s3=br1.readLine();
            c2.img=Float.parseFloat(s3);
            c3.sum(c1,c2);
            c3.mul(c1,c2);
    }
}
