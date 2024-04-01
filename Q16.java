//Name: Nishant Sankar Swain
//Section: 21
import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the Size:");
		int size=obj.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the Elements:");
		for(int i=0;i<arr.length;i++)
			arr[i]=obj.nextInt();
		try
		{
		System.out.println(arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		

	}

}
