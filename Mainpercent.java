import java.util.Scanner;
public class Mainpercent
{
	public static void main(String[] args)
 {
	Double p , om , mm;
	Scanner read = new Scanner(System.in);
	System.out.println("Enter the maximum marks marks");
	mm= read.nextDouble();
	System.out.println("Enter the obtained marks");
	om=read.nextDouble();
	p=(om/mm)*100;
	System.out.println("The percentage is:"+p +"%");
   }
}
