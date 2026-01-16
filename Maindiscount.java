import java.util.Scanner;
public class Maindiscount
{
	public static void main(String[] args)
 {
	
	Double dsp , dp , da , csp;
	Scanner read= new Scanner(System.in);
	System.out.println("Enter the current selling price:");
	csp=read.nextDouble();
	System.out.println("Enter the discount percentage:");
	dp=read.nextDouble();
	da=dp*csp/100;
	dsp=csp-da;
	System.out.println("the discounted selling price is Rs"+ dsp);
  }
}
