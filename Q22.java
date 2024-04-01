//Name: Nishant Sankar Swain
//Section: 21
import java.util.Scanner;

class CustomCheckedException extends Exception
{
	CustomCheckedException(String M)
	{
		super(M);
	}
}
public class Q22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter Any Number");
		int a=obj.nextInt();
		try
		{
			if(a<0)
			{
				throw new CustomCheckedException(a+"Number Can't be Negative!!");
			}
			System.out.println("Number is:" +a);
		}
		catch(CustomCheckedException e)
		{
			System.out.println(e);
		}

	}

}
