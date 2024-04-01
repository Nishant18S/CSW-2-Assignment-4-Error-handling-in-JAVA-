//Name: Nishant Sankar Swain
//Section: 21
import java.util.Scanner;
public class Q18 {
	public static void traverseAndDouble(int[] arr, int index)
    {
        try 
        {
            if (index == arr.length) 
            {
                return;
            }
            arr[index] *= 2;
            traverseAndDouble(arr, index + 1);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error: Array index out of bounds. Terminating recursion.");
        }
    }
    public static void printArray(int[] arr) 
    {
        for (int num : arr)
        {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) 
    {
    	Scanner obj=new Scanner(System.in);
    	System.out.println("Enter the Size of the Array:");
    	int size=obj.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the Elements into the Array:");
        for(int i=0;i<arr.length;i++)
        	arr[i]=obj.nextInt();
        System.out.println("Original array:");
        printArray(arr);
        traverseAndDouble(arr, 0);
        System.out.println("\nModified array:");
        printArray(arr);
    }
    
    
}

