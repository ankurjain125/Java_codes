import java.io.*;
public class IncomeTax {
	public static void main(String[] args)throws IOException {
		float income=0.00f,tax=0.00f;
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		System.out.println("Enter your income:");
		String s=br.readLine();
		income=Float.parseFloat(s);
		if(income<=500000)
			tax=0.00f;
		else if(income>500001 && income<800000)
			tax=income*0.1f;
		else if(income>800001 && income<1000000)
			tax=income*0.2f;
		else
			tax=income*0.3f;
		System.out.println("Your Income Tax is: Rs:"+tax);
	}

}