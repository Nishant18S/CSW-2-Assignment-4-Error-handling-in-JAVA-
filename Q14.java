//Name: Nishant Sankar Swain
//Section: 21
import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.print("X=");
		double x=obj.nextDouble();
		try 
		{
			double neumorator=Math.log(Math.abs(Math.sin(x)+Math.cos(x)));
			double denominator=Math.sin(x)+Math.cos(x);
			double result=neumorator/denominator;;
			if(neumorator<0 && denominator==0)
			{
				throw new ArithmeticException(" negative values inside the logarithmic function");
			}
			System.out.println("Result: " +result);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}

	}

}
