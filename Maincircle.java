import java.util.Scanner;
public class Maincircle
{
	public static void main(String[] args)
 {
	Double a , c, r;
        Double pi=3.14;
	Scanner read= new Scanner(System.in);
	System.out.println("Enter the value of radius of the circle:");
	r=read.nextDouble();
	a=pi*r*r;
	System.out.println("Area of the circle is:"+ a+"m^2");
	c=2*pi*r;
	System.out.println("Circumference of the circle is:"+ c+"m");
	

		
	}
}