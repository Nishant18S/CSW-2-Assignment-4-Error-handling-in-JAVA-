//Name: Nishant Sankar Swain
//Section: 21
import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		try
		{
		System.out.println("Enter any String:");
		String s=obj.nextLine();
		int a=Integer.parseInt(s);
		System.out.println(a);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}

	}

}
