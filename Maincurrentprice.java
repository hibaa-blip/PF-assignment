import java.util.Scanner;
public class Maincurrentprice
{
	public static void main(String[] args)
 {
	Double dsp;
	Scanner read= new Scanner(System.in);
	Double csp,dis,dp;
	System.out.println("enter the discount selling price");
	dsp=read.nextDouble();
	System.out.println("enter the discount percentage");
	dp=read.nextDouble();
	csp=dsp/(1-dp/100);
	System.out.println("the current selling price is Rs"+ csp);
  }
}