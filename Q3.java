//Name: Nishant Sankar Swain
//Section: 21
import java.util.Scanner;
class CustomNullPointerException extends NullPointerException
{
	CustomNullPointerException(String Message)
	{
		super(Message);
	}
}
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		try
		{
		System.out.println("Enter any String:");
		String s=obj.nextLine();
		if(s.isEmpty())
		{
			throw new CustomNullPointerException("String Cannot be Empty");
		}
		else
		{
			System.out.println("Length of the given String "+s+" is:"+s.length());
		}
		}
		catch(CustomNullPointerException e)
		{
			System.out.println(e);
		}

	}

}
