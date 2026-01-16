import java.util.Scanner;
public class Mainwatts
{
	public static void main(String[] args)
 {
	Double v , a ,w;
	Scanner read = new Scanner(System.in);
	System.out.println("Enter the value of volts:");
	v=read.nextDouble();
	System.out.println("Enter the value of amperes:");
	a=read.nextDouble();
	w=v*a;
	System.out.println("The reading in watts is:"+w +"Watt");
  }
}
