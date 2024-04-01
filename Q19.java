//Name: Nishant Sankar Swain
//Section: 21
import java.util.Arrays;
import java.util.Scanner;

public class Q19 
{
	 public static int linearSearch(int[] arr, int key)
	 {
	        for (int i = 0; i < arr.length; i++)
	        {
	            if (arr[i] == key)
	            {
	                return i; // Return index if found
	            }
	        }
	        return -1; // Return -1 if not found
	    }

    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Size:");
        int size = obj.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the Elements:");
        for (int i = 0; i < arr.length; i++)
            arr[i] = obj.nextInt();

        System.out.println("Display Elements are:");
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i] + " "); // Print each element
        }
        try
        {
        Arrays.sort(arr); // Sorting the array

        System.out.println("\nAfter sorting Elements are:");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " "); // Print each element after sorting
        }
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println(e);
        }
        System.out.println("\nEnter the element to search:");
        int key = obj.nextInt();
        try
        {
        int index = linearSearch(arr, key);
        if (index != -1)
        {
            System.out.println("Element " + key + " found at index: " + index);
        } 
        else
        {
            System.out.println("Element " + key + " not found in the array.");
        }
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println(e);
        }
        try 
        {
            System.out.println("Enter the index to access an element:");
            int accessIndex = obj.nextInt();
            int accessedElement = arr[accessIndex];
            System.out.println("Element at index " + accessIndex + ": " + accessedElement);
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println(e);
        }
    }
}
