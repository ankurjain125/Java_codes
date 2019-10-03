import java.io.*;
public class insurancepremium {
	public static void main(String[] args)throws IOException
	{
		int age;
		float sum=0.00f,prem=0.00f;
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(ir);
		System.out.println("Enter your age:");
		String s=br.readLine();
		age=Integer.parseInt(s);
		System.out.println("Enter your Yearly Premium:");
		String s1=br.readLine();
		prem=Float.parseFloat(s1);
		if(age<30)
			sum=prem*0.05f;
		else if(age>30 && age<45)
			sum=prem*0.06f;
		else if(age>45 && age<60)
			sum=prem*0.07f;
		else
			System.out.println("No Coverage");	
		System.out.println("Your Insurance premium is: Rs."+(prem+sum));
	}

}