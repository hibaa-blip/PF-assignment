import java.util.Scanner;
public class Maintrapiziuem
{
	public static void main(String[] args)
 {
	Double a,b,h,k;
	Scanner read= new Scanner(System.in);
	System.out.println("Enter length of 1st parallel sides of trapiziuem:");
        a=read.nextDouble();
        System.out.println("Enter length no.1 and length no.2 of parallel sides");
	b=read.nextDouble();
	System.out.println("Enter the height of trapezium:");
	h=read.nextDouble();
	k= h * (a + b)/2;
	System.out.println("the area of trapezium is"+k+" m^2");
  }
}

    

