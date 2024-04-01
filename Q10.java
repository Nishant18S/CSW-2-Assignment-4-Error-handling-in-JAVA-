//Name: Nishant Sankar Swain
//Section: 21
import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		try
		{
			System.out.print("X=");
			int x=obj.nextInt();
			double result=(Math.sin(x)+Math.cos(x))/Math.tan(x);
			final double EPSILON = 1e-10; 
			if(Math.abs(x % (Math.PI / 2)) < EPSILON || Math.abs(x % (Math.PI / 2) - (Math.PI / 2)) < EPSILON)
			{
				throw new ArithmeticException("Division by zero error: x is close to a multiple of π/2");
			}
			System.out.print("Result = "+result);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}

	}

}
