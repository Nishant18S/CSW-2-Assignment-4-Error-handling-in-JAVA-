//Name: Nishant Sankar Swain
//Section: 21
import java.util.LinkedList;
import java.util.Scanner;

public class Q17 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the Size:");
		int size=obj.nextInt();
		LinkedList <Integer>list=new LinkedList<>();
		System.out.println("Enter the Data:");
		for(int i=0;i<size;i++)
		{
			int o=obj.nextInt();
			list.add(o);
		}
		System.out.println(list);
		try
		{
		 System.out.println("Enter the index to access an element:");
         int index = obj.nextInt();
         if (index < 0 || index >= list.size())
         {
             throw new ArrayIndexOutOfBoundsException("Index is out of bounds");
         }

         int element = list.get(index);
         System.out.println("Element at index " + index + ": " + element);
     } 
	
	 catch(ArrayIndexOutOfBoundsException e)
	{
         System.out.println(e);
     }

	}

}
