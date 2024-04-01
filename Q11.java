//Name: Nishant Sankar Swain
//Section: 21
import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		
			System.out.print("X=");
			double x=obj.nextDouble();
			try
			{
			double neumorator=Math.log(Math.sin(x)+Math.cos(x));
			double denominator=Math.tan(x)-(1/Math.tan(x));
			double result=neumorator/denominator;
			if(denominator<=0)
			{
				throw new ArithmeticException(" may \r\n"
						+ "occur due to invalid mathematical operations.!!");
			}
			System.out.print("Result = "+result);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}

	}

}
