//Name: Nishant Sankar Swain
//Section: 21
import java.util.InputMismatchException;
import java.util.Scanner;

public class Q25 {
	public static void Method()throws InputMismatchException
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter any Number:");
		int num=obj.nextInt();
	    System.out.println("You ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		Method();
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}

	}

}
