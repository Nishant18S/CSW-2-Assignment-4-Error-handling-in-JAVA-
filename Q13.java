//Name: Nishant Sankar Swain
//Section: 21
import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner obj=new Scanner(System.in);
		System.out.print("X=");
		double x=obj.nextDouble();
		try
		{
			double denominator=Math.sin(x)+Math.cos(x);
			double result=Math.sin(x)*Math.cos(x)/denominator;;
			if(denominator<=0)
			{
				throw new ArithmeticException(" may arise \r\n"
						+ "due to invalid mathematical operations");
			}
			System.out.println("Result: " +result);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}

	}

}
