//Name: Nishant Sankar Swain
//Section: 21
import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		try
		{
			System.out.println("Enter the 1st Number:");
			int a=obj.nextInt();
			System.out.println("Enter the 2nd Number:");
			int b=obj.nextInt();
			if(b==0)
			{
				throw new ArithmeticException("Second Input Cannot be Zero!!!!");
			}
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}

	}

}
