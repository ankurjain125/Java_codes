import java.io.*;
class circle {
	 float r;
	 float area;
	 float perimeter;
	circle()
	{
        r=1.0f;
        area=0.0f;
        perimeter=0.0f;
	}
	circle(float r)
	{
	    this.r=r;
	}
	void P()
	{
	    perimeter=2f*3.14f*r;
	}
	void A()
	{
	    area=3.14f*r*r;
	}
	void show()
    {
        System.out.println("\nRadius= "+r+"\nPerimeter= "+perimeter+"\nArea= "+area);
    }
}
class test
{
    public static void main(String ar[])throws IOException
    {
        circle c=new circle();
        InputStreamReader ir= new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        System.out.println("Enter the radius of the circle");
        String s=br.readLine();
        c.r=Float.parseFloat(s);
        c.P();
        c.A();
        c.show();
    }
}
