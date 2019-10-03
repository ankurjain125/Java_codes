import java.io.*;
public class calculator
{
	
	public static int sum(int a,int b)
	{
		return a+b;
	}
	public static int sub(int a,int b)
	{
		return a-b;
	}
	public static int mul(int a,int b)
	{
		return a*b;
	}
}
class main{
public static void main(String arg[])throws IOException
{
	int a,b;
	calculator cal=new calculator();
	InputStreamReader ir=new InputStreamReader(System.in);
	System.out.println("Enter the first number");
	BufferedReader br=new BufferedReader(ir);
	String s=br.readLine();
	a=Integer.parseInt(s);
	System.out.println("Enter the second number");
	String s1=br.readLine();
	b=Integer.parseInt(s1);
	int choice;
	System.out.println("Enter 1 to ADD\nEnter 2 to SUB\nEnter 3 to MULTIPLY\nEnter your choice:");
	String s2=br.readLine();
	choice=Integer.parseInt(s2);
	switch(choice)
	{
		case 1:
			System.out.println(cal.sum(a,b));
			break;
		case 2:
			System.out.println(cal.sub(a,b));
			break;
		case 3:
			System.out.println(cal.mul(a,b));
			break;
		default:
			System.out.println("You have entered a wrong choice!!");
		
	}
}
}