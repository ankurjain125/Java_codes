import java.io.IOException;
import java.util.Scanner;

class bank
{
	private double balance;
    bank()
	{
		balance = 0;
	}
	bank(double initialBalance)
	{
		balance = initialBalance;
	}
	public void deposit(double amount)
	{
		balance = balance + amount;
	}
	public void withdraw(double amount)
	{
        if(balance<=amount)
            balance = balance - amount;
        else
            System.out.println("Low Balance !!");
	}
	public void getBalance()
	{
		System.out.println("Balance is= ₹"+balance);
	}

}
class SBI extends bank
{
    public static void main(String ar[])throws IOException
    {
        Scanner s=new Scanner(System.in);
        bank i=new bank(10000);
        System.out.println("Press 1 to withdraw and 2 to deposit");
        int a=s.nextInt();
        if(a==1)
        {
            System.out.println("Enter the amount");
            double amt=s.nextDouble();
            i.withdraw(amt);
            i.getBalance();
        }
        else{
            System.out.println("Enter the amount");
            double amt=s.nextDouble();
            i.deposit(amt);
            i.getBalance();
        }
    }
}