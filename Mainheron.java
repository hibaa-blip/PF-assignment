import java.util.Scanner;
public class Mainheron
{
	public static void main(String[] args)
 {
	Double a,b,c,A,s,d;
	Scanner read= new Scanner(System.in);
	System.out.println("Enter the length no.1 of the three sides of triangle:");
	a=read.nextDouble();
	System.out.println("Enter the length no.2 of the three sides of triangle:");
	b=read.nextDouble();
	System.out.println("Enter the length no.3 of the three sides of triangle:");
	c=read.nextDouble();
	s=(a+b+c)/2;
	System.out.println("semi perameter is"+s+"m");
	A= Math.sqrt((s-a)*(s-b)*(s-c));
	System.out.println("The area of trapezium is"+A+" m^2");
	
}
}
    

