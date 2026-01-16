
import java.util.Scanner;
public class Mainevenodd
{
	public static void main(String[] args) 
{
	int num;
	Scanner read= new Scanner(System.in);
	System.out.println("Enter your number:");
	num=read.nextInt();
	if(num%2==0)
	{
	    System.out.println("You have an even number");
	}
	else 
	{
	    System.out.println("You have an odd number");
	}
	}
}