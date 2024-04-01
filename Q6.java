//Name: Nishant Sankar Swain
//Section: 21
import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		try
		{
		System.out.println("Enter any Number:");
		int x=obj.nextInt();
		x=Integer.parseInt(null);
		System.out.println(x);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}

	}

}
