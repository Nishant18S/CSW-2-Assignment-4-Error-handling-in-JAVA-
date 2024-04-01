//Name: Nishant Sankar Swain
//Section: 21
import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		try
		{
		System.out.println("Enter any Number:");
		int a=obj.nextInt();
		
		double p=Math.sqrt(a);
		if(p==0 && p<=0)
		{
			throw new ArithmeticException("Output cannot be Zero!!!");
		}
		System.out.println(p);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}

	}

}
