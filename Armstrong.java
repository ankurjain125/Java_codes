import java.io.*;
class Armstrong
{  
  public static void main(String args[])throws IOException
  {  
    int c=0,a,temp,n;  
    InputStreamReader ir=new InputStreamReader(System.in);
    System.out.println("Enter the number to be checked");
    BufferedReader br=new BufferedReader(ir);
    String s=br.readLine();
    n=Integer.parseInt(s);
    temp=n;  
    while(n>0)  
    {  
    	a=n%10;  
    	n=n/10;  
    	c=c+(a*a*a);  
    }  
    if(temp==c)  
    	System.out.println("armstrong number");   
    else  
        System.out.println("Not armstrong number");   
   }  
}  