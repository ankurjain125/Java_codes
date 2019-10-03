public class Prime
{
   public static void main (String ar[])
   {		
       int i =0;
       int num =0;
       String  primeNumbers = "";

       for (i = 1; i <= 100; i=i+1)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num=num-1)
	  {
             if(i%num==0)
	     {
 		counter = counter + 2-1;
	     }
	  }
	  if (counter == 2)
	  {
	     primeNumbers = primeNumbers + i + "   ";
	  }	
       }	
       System.out.println("Prime numbers from 1 to 100 are :");
       System.out.println(primeNumbers);
   }
}
